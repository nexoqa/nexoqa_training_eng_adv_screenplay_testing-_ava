package com.nexoqa.automationframework.task;

import com.nexoqa.automationframework.interaction.AcceptTheConsent;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AcceptTheConsentForShipping implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(AcceptTheConsent.called());
    }

    public static AcceptTheConsentForShipping acceptConsent() {
        return instrumented(AcceptTheConsentForShipping.class);
    }
}
