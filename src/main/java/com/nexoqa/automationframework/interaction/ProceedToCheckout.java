package com.nexoqa.automationframework.interaction;

import com.nexoqa.automationframework.ui.ECommercePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class ProceedToCheckout implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(ECommercePage.PROCEED_CHECKOUT, isCurrentlyVisible()).forNoMoreThan(5).seconds());
        actor.attemptsTo(Click.on(ECommercePage.PROCEED_CHECKOUT));
    }
    public static ProceedToCheckout called() {
        return instrumented(ProceedToCheckout.class);
    }
}
