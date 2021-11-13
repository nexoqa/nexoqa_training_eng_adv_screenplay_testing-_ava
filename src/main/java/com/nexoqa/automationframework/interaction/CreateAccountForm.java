package com.nexoqa.automationframework.interaction;

import com.nexoqa.automationframework.ui.AuthenticationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class CreateAccountForm implements Interaction {

    private String email;

    public CreateAccountForm(String email) {
        this.email = email;
    }

    @Override
    @Step("{0} enters his email to create a new account")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(AuthenticationPage.EMAIL_CREATE, isCurrentlyVisible()).forNoMoreThan(5).seconds());
        actor.attemptsTo(Enter.theValue(email).into(AuthenticationPage.EMAIL_CREATE));
        actor.attemptsTo(Click.on(AuthenticationPage.CREATE_ACCOUNT));
    }

    public static CreateAccountForm fillWith(String email) {
        return instrumented(CreateAccountForm.class, email);
    }

}
