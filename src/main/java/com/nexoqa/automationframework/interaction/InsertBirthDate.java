package com.nexoqa.automationframework.interaction;

import com.nexoqa.automationframework.model.ClientData;
import com.nexoqa.automationframework.ui.CreateAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InsertBirthDate implements Interaction {

    private ClientData clientData;

    public InsertBirthDate(ClientData clientData) {
        this.clientData = clientData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectFromOptions.byValue(clientData.getBirthDate().getBirthDay()).from(CreateAccountPage.BIRTH_DAY));
        actor.attemptsTo(SelectFromOptions.byVisibleText(clientData.getBirthDate().getBirthMonth() + " ").from(CreateAccountPage.BIRTH_MONTH));
        actor.attemptsTo(SelectFromOptions.byValue(clientData.getBirthDate().getBirthYear()).from(CreateAccountPage.BIRTH_YEAR));
    }

    public static InsertBirthDate fillWith(ClientData clientData) {
        return instrumented(InsertBirthDate.class, clientData);
    }

}
