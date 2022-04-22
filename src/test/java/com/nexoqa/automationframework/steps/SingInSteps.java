package com.nexoqa.automationframework.steps;

import com.nexoqa.automationframework.model.ClientData;
import com.nexoqa.automationframework.model.Credentials;
import com.nexoqa.automationframework.model.builder.ClientBuilder;
import com.nexoqa.automationframework.model.builder.CredentialsBuilder;
import com.nexoqa.automationframework.model.enums.ErrorMessage;
import com.nexoqa.automationframework.questions.ECommerce;
import com.nexoqa.automationframework.questions.LogIn;
import com.nexoqa.automationframework.questions.ShoppingCartSummaryPageSuccess;
import com.nexoqa.automationframework.task.*;
import com.nexoqa.automationframework.questions.Summary;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static com.nexoqa.automationframework.task.Logout.closeSession;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class SingInSteps {

    private Credentials credentials;
    private ClientData clientData;

    @Given("^that (Fran|Saul|Rafa) is already registered in the ecommerce$")
    public void theClientIsRegisteredAtThePlatform(String actorName) {
        Actor actor = theActorCalled(actorName);

        credentials = new CredentialsBuilder(actor).build();
        clientData = new ClientBuilder(actor, credentials).build();

        actor.wasAbleTo(
                GoTo.eCommerce(),
                NavigateTo.SignInSection(),
                SignIn.createNewAccountAs(clientData)
        );

    }

    @But("^he is not yet logged in the ecommerce$")
    public void heIsNotLoggedInTheEcommerce() {
        if (LogIn.isLogged(clientData).answeredBy(theActorInTheSpotlight())) {
            theActorInTheSpotlight().attemptsTo(closeSession());
        }
    }

    @When("^(?:he|she) login with your credentials in the login page$")
    public void theClientFillWithYourCorrectCredentialsTheLogin() {
        theActorInTheSpotlight().attemptsTo(
                GoTo.eCommerce(),
                NavigateTo.SignInSection(),
                Login.with(credentials)
        );
    }

    @Then("^(?:he|she) shouldn't see a (AUTHENTICATION_FAILED) error message$")
    public void theClientShouldNotAccessToTheCalculatorPriceApp(ErrorMessage errorMessage) {
        theActorInTheSpotlight().should(
                seeThat("the login not show an error message", LogIn.isLogged(clientData), equalTo(true))
        );

    }



    @Then("^(?:he|she) should see a (AUTHENTICATION_FAILED) error message$")
    public void theClientShouldAccessToTheCalculatorPriceApp(ErrorMessage errorMessage) {
        theActorInTheSpotlight().should(
                seeThat("the login show an error message", LogIn.isFailed(errorMessage.getMessageDescription()), equalTo(true))
        );
    }

    @Given("^that (Fran|Saul|Rafa) isn't registered in the ecommerce$")
    public void theClientIsNotRegisteredAtThePlatform(String actorName) {
        credentials = new CredentialsBuilder(theActorCalled(actorName)).build();
        theActorInTheSpotlight().attemptsTo(
                GoTo.eCommerce());
    }


    @When("^(?:he|she) selects an item$")
    public void theActorSelectAnItem() {
        theActorInTheSpotlight().attemptsTo(
                GoTo.eCommerce(),
                SelectItem.SelectNewItem()
        );
    }

    @Then("^(?:he|she) should be in the shopping cart summary page$")
    public void theActorShouldBeInTheCheckOutPage() {
        theActorInTheSpotlight().should(
                seeThat("the application shows the shopping cart summary page",
                        ECommerce.isShoppingCartSummaryPagePreset(), equalTo(true)));
    }
    
    @And("^(?:he|she) has to create (?:his|her) account$")
    public void theActorHasToCreateNewAccount() {
        Actor actor = credentials.getActor();
        clientData = new ClientBuilder(actor, credentials).build();

        actor.wasAbleTo(
                SignIn.createNewAccountAs(clientData));
    }

    @And("^(?:he|she) confirms shipping address$")
    public void theActorConfirmsShippingAddress() {
        Actor actor = credentials.getActor();
        actor.wasAbleTo(ConfirmShippingAddress.ProceedToCheckout());
    }

    @And("^(?:he|she) accepts the consent for shipping$")
    public void theActorAcceptsTheConsentForShipping() {
        Actor actor = credentials.getActor();
        actor.wasAbleTo(AcceptTheConsentForShipping.acceptConsent());
    }

    @Then("^(?:he|she) should be in the payment page$")
    public void theActorShouldBeInThePaymentPage() {
        theActorInTheSpotlight().should(
                seeThat("the application shows the payment step",
                        Summary.PaymentSummaryPageIsPresent(), equalTo(true)));
    }
 
    



}
