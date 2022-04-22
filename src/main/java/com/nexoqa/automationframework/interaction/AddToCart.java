package com.nexoqa.automationframework.interaction;

import com.nexoqa.automationframework.ui.ECommercePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddToCart implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ECommercePage.ADD_TO_CAR));

    }

    public static AddToCart called() {
        return instrumented(AddToCart.class);
    }
}
