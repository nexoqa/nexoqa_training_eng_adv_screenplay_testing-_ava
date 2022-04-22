package com.nexoqa.automationframework.task;

import com.nexoqa.automationframework.interaction.ProceedAddress;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConfirmShippingAddress implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ProceedAddress.called());
    }

    public static ConfirmShippingAddress ProceedToCheckout() {
        return instrumented(ConfirmShippingAddress.class);
    }
}
