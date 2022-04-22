package com.nexoqa.automationframework.task;


import com.nexoqa.automationframework.interaction.CreateAccountForm;
import com.nexoqa.automationframework.interaction.SigInForm;
import com.nexoqa.automationframework.model.ClientData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static com.nexoqa.automationframework.ui.MyAccountPage.HOME;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotCurrentlyEnabled;

public class SignIn implements Task {

    private final ClientData clientData;

    public SignIn(ClientData clientData) {
        this.clientData = clientData;
    }

    @Override
    @Step("{0} creates a new account")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CreateAccountForm.fillWith(clientData.getCredentials().getEmail()));
        actor.attemptsTo(SigInForm.fillWith(clientData));
        actor.attemptsTo(WaitUntil.the(HOME, isCurrentlyEnabled()));
    }

    public static SignIn createNewAccountAs(ClientData clientData) {
        return instrumented(SignIn.class, clientData);
    }

}
