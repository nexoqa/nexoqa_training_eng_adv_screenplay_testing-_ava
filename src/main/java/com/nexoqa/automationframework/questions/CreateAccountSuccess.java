package com.nexoqa.automationframework.questions;

import com.nexoqa.automationframework.model.ClientData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.nexoqa.automationframework.ui.MyAccountPage.HOME;

public class CreateAccountSuccess implements Question<Boolean> {

    private ClientData clientData;

    public CreateAccountSuccess() {

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return HOME.resolveFor(actor).isPresent();
    }

    public static Question<Boolean> isAccountCreated() {
        return new CreateAccountSuccess();
    }

}
