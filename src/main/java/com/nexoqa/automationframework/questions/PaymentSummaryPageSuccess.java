package com.nexoqa.automationframework.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.nexoqa.automationframework.ui.Summary.PAY_BY_BANK;;

public class PaymentSummaryPageSuccess implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return PAY_BY_BANK.resolveFor(actor).isDisplayed();
    }

    public static Question<Boolean> isPresent() {
        return new PaymentSummaryPageSuccess();
    }

}
