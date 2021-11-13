package com.nexoqa.automationframework.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.nexoqa.automationframework.ui.AuthenticationPage.ERROR_MESSAGE;

public class LoginFailed implements Question<Boolean> {

    private String errorMessage;

    public LoginFailed(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return ERROR_MESSAGE.resolveFor(actor).getText().contains(errorMessage);
    }

    public static Question<Boolean> isErrorShowing(String errorMessage) {
        return new LoginFailed(errorMessage);
    }

}
