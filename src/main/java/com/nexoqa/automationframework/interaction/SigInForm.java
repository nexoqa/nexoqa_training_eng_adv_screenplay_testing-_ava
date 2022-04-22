package com.nexoqa.automationframework.interaction;

import com.nexoqa.automationframework.ability.PermissionCreateAccount;
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
        try {
            actor.attemptsTo(ChooseATitle.choose(allowedTo(actor).getClientData().getTitle()));
            actor.attemptsTo(Enter.theValue(allowedTo(actor).getClientData().getFirstName()).into(FIRST_NAME));
            actor.attemptsTo(Enter.theValue(allowedTo(actor).getClientData().getLastName()).into(LAST_NAME));
            actor.attemptsTo(Enter.theValue(allowedTo(actor).getClientData().getCredentials().getPassword()).into(PASSWORD));
            actor.attemptsTo(InsertBirthDate.fillWith(allowedTo(actor).getClientData()));
            actor.attemptsTo(Enter.theValue(allowedTo(actor).getClientData().getAddress()).into(FIRST_ADDRESS));
            actor.attemptsTo(Enter.theValue(allowedTo(actor).getClientData().getCity()).into(CITY));
            actor.attemptsTo(SelectFromOptions.byVisibleText(allowedTo(actor).getClientData().getState().getName()).from(STATE));
            actor.attemptsTo(Enter.theValue(allowedTo(actor).getClientData().getPostalCode()).into(POSTAL_CODE));
            actor.attemptsTo(SelectFromOptions.byVisibleText(allowedTo(actor).getClientData().getCountry().getName()).from(COUNTRY));
            actor.attemptsTo(Enter.theValue(allowedTo(actor).getClientData().getPhoneNumber()).into(MOBILE_PHONE));
            actor.attemptsTo(Click.on(REGISTER));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private PermissionCreateAccount allowedTo(Actor actor) throws Exception {
        return PermissionCreateAccount.as(actor);
    }

    public static SigInForm fillWith(ClientData clientData) {
        return instrumented(SigInForm.class, clientData);
    }

}
