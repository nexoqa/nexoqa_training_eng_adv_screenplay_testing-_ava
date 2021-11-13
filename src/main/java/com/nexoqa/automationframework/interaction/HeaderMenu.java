package com.nexoqa.automationframework.interaction;

import com.nexoqa.automationframework.ui.ECommercePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class HeaderMenu implements Interaction {

    @Override
    @Step("{0} navigate to the Sign In section")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(ECommercePage.SIGN_IN, isCurrentlyEnabled())
                .forNoMoreThan(60).seconds());

        actor.attemptsTo(Click.on(ECommercePage.SIGN_IN));
    }

    public static HeaderMenu navigateToSingIn() {
        return instrumented(HeaderMenu.class);
    }

}
