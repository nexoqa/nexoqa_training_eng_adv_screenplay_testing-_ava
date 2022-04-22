package com.nexoqa.automationframework.ability;

import com.nexoqa.automationframework.model.ClientData;
import com.nexoqa.automationframework.model.Credentials;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;

public class PermissionLogIn implements Ability {

    private Credentials credentials;

    private PermissionLogIn(Credentials credentials){
        this.credentials = credentials;
    }
    // retrieves the Ability from an Actor within the Interaction
    public static PermissionLogIn as(Actor actor) throws Exception {

        // complain if someone's asking the impossible
        if (actor.abilityTo(PermissionLogIn.class) == null) {
            throw new Exception("The actor: " + actor.getName() + " does not have permission to Log In");
        }

        return actor.abilityTo(PermissionLogIn.class);
    }

    public Credentials getCredentials() { return credentials; }

    public static PermissionLogIn with(Credentials credentials) {
        return new PermissionLogIn(credentials);
    }
}
