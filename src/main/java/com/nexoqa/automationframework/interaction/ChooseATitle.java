package com.nexoqa.automationframework.interaction;

import com.nexoqa.automationframework.model.enums.clientdata.Title;
import com.nexoqa.automationframework.ui.CreateAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Arrays;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class ChooseATitle implements Interaction {

    private Title title;

    public ChooseATitle(Title title) {
        this.title = title;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target selectedTitle = getTitleById().get(title.getId() - 1);
        actor.attemptsTo(WaitUntil.the(selectedTitle, isCurrentlyEnabled()).forNoMoreThan(10).seconds());
        actor.attemptsTo(Click.on(selectedTitle));
    }

    private static List<Target> getTitleById() {
        return Arrays.asList(CreateAccountPage.TITLE_MR, CreateAccountPage.TITLE_MRS);
    }

    public static ChooseATitle choose(Title title) {
        return instrumented(ChooseATitle.class, title);
    }


}
