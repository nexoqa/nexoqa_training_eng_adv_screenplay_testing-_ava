package com.nexoqa.automationframework.interaction;

import com.nexoqa.automationframework.model.ClientData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

import static com.nexoqa.automationframework.ui.CreateAccountPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SigInForm implements Interaction {

    private ClientData clientData;

    public SigInForm(ClientData clientData) {
        this.clientData = clientData;
    }

    @Override
    @Step("{0} enters his personal data in the sign in form")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ChooseATitle.choose(clientData.getTitle()));
        actor.attemptsTo(Enter.theValue(clientData.getFirstName()).into(FIRST_NAME));
        actor.attemptsTo(Enter.theValue(clientData.getLastName()).into(LAST_NAME));
        actor.attemptsTo(Enter.theValue(clientData.getCredentials().getPassword()).into(PASSWORD));
        actor.attemptsTo(InsertBirthDate.fillWith(clientData));
        actor.attemptsTo(Enter.theValue(clientData.getAddress()).into(FIRST_ADDRESS));
        actor.attemptsTo(Enter.theValue(clientData.getCity()).into(CITY));
        actor.attemptsTo(SelectFromOptions.byVisibleText(clientData.getState().getName()).from(STATE));
        actor.attemptsTo(Enter.theValue(clientData.getPostalCode()).into(POSTAL_CODE));
        actor.attemptsTo(SelectFromOptions.byVisibleText(clientData.getCountry().getName()).from(COUNTRY));
        actor.attemptsTo(Enter.theValue(clientData.getPhoneNumber()).into(MOBILE_PHONE));
        actor.attemptsTo(Click.on(REGISTER));
    }

    public static SigInForm fillWith(ClientData clientData) {
        return instrumented(SigInForm.class, clientData);
    }

}
