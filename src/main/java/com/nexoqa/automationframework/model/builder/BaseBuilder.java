package com.nexoqa.automationframework.model.builder;

import net.serenitybdd.screenplay.Actor;

public class BaseBuilder {

    protected Actor actor;

    public BaseBuilder(Actor actor) {
        this.actor = actor;
    }

}
