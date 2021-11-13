package com.nexoqa.automationframework.task;

import com.nexoqa.automationframework.ui.ECommercePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class Logout implements Task {

    @Override
    @Step("{0} logout in the ecommerce")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ECommercePage.SIGN_OUT));
        actor.attemptsTo(WaitUntil.the(ECommercePage.ACCOUNT, isNotVisible()).forNoMoreThan(5).seconds());
    }

    public static Logout closeSession() {
        return instrumented(Logout.class);
    }


}

