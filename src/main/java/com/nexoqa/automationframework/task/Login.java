package com.nexoqa.automationframework.task;

import com.nexoqa.automationframework.interaction.LogInForm;
import com.nexoqa.automationframework.model.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private Credentials credentials;

    public Login(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    @Step("{0} login in the ecommerce")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(LogInForm.fillWith(credentials));
    }

    public static Login with(Credentials credentials) {
        return instrumented(Login.class, credentials);
    }

}
