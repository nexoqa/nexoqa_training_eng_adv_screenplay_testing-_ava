package com.nexoqa.automationframework.model.builder;

import com.nexoqa.automationframework.model.Credentials;
import com.nexoqa.automationframework.model.builder.utils.BuilderUtils;
import net.serenitybdd.screenplay.Actor;

public class CredentialsBuilder extends BaseBuilder {

    public CredentialsBuilder(Actor actor) {
        super(actor);
    }

    public Credentials build() {
        return new Credentials(
                this.actor,
                generateEmail(actor.getName()),
                generatePassword()
        );
    }

    private String generateEmail(String actorName) {
        return actorName + "_" + BuilderUtils.generateRandomString(4) + "@demo.com";
    }

    private String generatePassword() {
        return BuilderUtils.generateRandomString(6);
    }


}
