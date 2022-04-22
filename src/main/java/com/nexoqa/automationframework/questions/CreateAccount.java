package com.nexoqa.automationframework.questions;

import com.nexoqa.automationframework.model.ClientData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.nexoqa.automationframework.ui.MyAccountPage.HOME;

public class CreateAccount{

    public static Question<Boolean> isAccountCreated() {
        return CreateAccountSuccess.isAccountCreated();
    }

}
