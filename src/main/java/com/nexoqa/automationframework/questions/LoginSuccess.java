package com.nexoqa.automationframework.questions;

import com.nexoqa.automationframework.model.ClientData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.nexoqa.automationframework.ui.ECommercePage.ACCOUNT;

public class LoginSuccess implements Question<Boolean> {

    private ClientData clientData;

    public LoginSuccess(ClientData clientData) {
        this.clientData = clientData;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return ACCOUNT.resolveFor(actor).getText().equals(clientData.getFirstName() + " " + clientData.getLastName());
    }

    public static Question<Boolean> isLogged(ClientData clientData) {
        return new LoginSuccess(clientData);
    }

}
