package com.nexoqa.automationframework.task;

import com.nexoqa.automationframework.interaction.AddToCart;
import com.nexoqa.automationframework.interaction.MouseOverItem;
import com.nexoqa.automationframework.interaction.ProceedToCheckout;
import com.nexoqa.automationframework.interaction.SummaryProceedToCheckout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectItem implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MouseOverItem.called());
        actor.attemptsTo(AddToCart.called());
        actor.attemptsTo(ProceedToCheckout.called());
        actor.attemptsTo(SummaryProceedToCheckout.called());
    }

    public static SelectItem SelectNewItem() {
        return instrumented(SelectItem.class);
    }
}
