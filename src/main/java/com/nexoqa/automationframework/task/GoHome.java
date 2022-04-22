package com.nexoqa.automationframework.task;

import com.nexoqa.automationframework.interaction.HeaderMenu;
import com.nexoqa.automationframework.interaction.MyAccountOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoHome implements Task {

    @Override
    @Step("{0} go to authentication page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MyAccountOption.navigateToHome());
    }

    public static GoHome action() {
        return instrumented(GoHome.class);
    }


}
