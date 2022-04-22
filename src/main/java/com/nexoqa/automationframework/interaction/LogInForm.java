package com.nexoqa.automationframework.interaction;

import com.nexoqa.automationframework.ability.PermissionCreateAccount;
import com.nexoqa.automationframework.ability.PermissionLogIn;
import com.nexoqa.automationframework.model.Credentials;
import com.nexoqa.automationframework.ui.AuthenticationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogInForm implements Interaction {

    private Credentials credentials;

    public LogInForm(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    @Step("{0} enters his credentials in the login form")
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(Enter.theValue(allowedTo(actor).getCredentials().getEmail()).into(AuthenticationPage.EMAIL));
            actor.attemptsTo(Enter.theValue(allowedTo(actor).getCredentials().getPassword()).into(AuthenticationPage.PASSWORD));
            actor.attemptsTo(Click.on(AuthenticationPage.SIGN_IN));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static LogInForm fillWith(Credentials credentials) {
        return instrumented(LogInForm.class, credentials);
    }

    private PermissionLogIn allowedTo(Actor actor) throws Exception {
        return PermissionLogIn.as(actor);
    }
}
