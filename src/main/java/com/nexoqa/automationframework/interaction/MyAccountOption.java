package com.nexoqa.automationframework.interaction;

import com.nexoqa.automationframework.ui.ECommercePage;
import com.nexoqa.automationframework.ui.MyAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class MyAccountOption implements Interaction {

    @Override
    @Step("{0} navigate to the Home page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(MyAccountPage.HOME, isCurrentlyEnabled())
                .forNoMoreThan(60).seconds());

        actor.attemptsTo(Click.on(MyAccountPage.HOME));
    }

    public static MyAccountOption navigateToHome() {
        return instrumented(MyAccountOption.class);
    }

}
