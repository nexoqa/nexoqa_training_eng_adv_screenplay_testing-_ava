package com.nexoqa.automationframework.questions;

import com.nexoqa.automationframework.model.ClientData;
import net.serenitybdd.screenplay.Question;

public class LogIn {

    public static Question<Boolean> isFailed(String errorMessage) {
       return LoginFailed.isErrorShowing(errorMessage);
    }
    public static Question<Boolean> isLogged(ClientData clientData) {
        return LoginSuccess.isLogged(clientData);
    }

}
