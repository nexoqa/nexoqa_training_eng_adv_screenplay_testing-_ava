package com.nexoqa.automationframework.task;

import com.nexoqa.automationframework.interaction.HeaderMenu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateTo implements Task {

    @Override
    @Step("{0} go to authentication page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(HeaderMenu.navigateToSingIn());
    }

    public static NavigateTo SignInSection() {
        return instrumented(NavigateTo.class);
    }


}
