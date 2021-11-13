package com.nexoqa.automationframework.task;

import com.nexoqa.automationframework.ui.ECommercePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo implements Task {

    private ECommercePage eCommercePage;

    @Override
    @Step("{0} accesses to the ecommerce")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(eCommercePage)
        );
    }

    public static GoTo eCommerce() {
        return instrumented(GoTo.class);
    }



}
