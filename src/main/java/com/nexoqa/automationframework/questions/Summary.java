package com.nexoqa.automationframework.questions;

import net.serenitybdd.screenplay.Question;

public class Summary {

    public static Question<Boolean> PaymentSummaryPageIsPresent() {
       return PaymentSummaryPageSuccess.isPresent();
    }

}
