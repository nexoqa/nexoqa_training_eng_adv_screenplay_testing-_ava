package com.nexoqa.automationframework.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.nexoqa.automationframework.ui.ShoppingCartSummaryPage.NAVIGATION_PAGE;

public class ShoppingCartSummaryPageSuccess implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return NAVIGATION_PAGE.resolveFor(actor).getText().equals("Your shopping cart");
    }

    public static Question<Boolean> isPresent() {
        return new ShoppingCartSummaryPageSuccess();
    }

}
