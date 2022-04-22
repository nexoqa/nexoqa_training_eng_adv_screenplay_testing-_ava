package com.nexoqa.automationframework.interaction;

import com.nexoqa.automationframework.ui.Summary;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class AcceptTheConsent implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(Summary.CONSENT_CHECKBOX, isCurrentlyVisible()).forNoMoreThan(5).seconds());
        actor.attemptsTo(Click.on(Summary.CONSENT_CHECKBOX));
        actor.attemptsTo(WaitUntil.the(Summary.PROCEED_CARRIER, isCurrentlyVisible()).forNoMoreThan(5).seconds());
        actor.attemptsTo(Click.on(Summary.PROCEED_CARRIER));
    }
    
    public static AcceptTheConsent called() {
        return instrumented(AcceptTheConsent.class);
    }
}
