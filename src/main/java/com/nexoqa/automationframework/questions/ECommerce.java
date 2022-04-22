package com.nexoqa.automationframework.questions;

import net.serenitybdd.screenplay.Question;

public class ECommerce {

    public static Question<Boolean> isShoppingCartSummaryPagePreset() {
       return ShoppingCartSummaryPageSuccess.isPresent();
    }

}
