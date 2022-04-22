package com.nexoqa.automationframework.ability;

import com.nexoqa.automationframework.model.ClientData;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Consequence;

public class PermissionCreateAccount implements Ability {

    private ClientData clientData;

    private PermissionCreateAccount(ClientData clientData){
        this.clientData = clientData;
    }
    // retrieves the Ability from an Actor within the Interaction
    public static PermissionCreateAccount as(Actor actor) throws Exception {

        // complain if someone's asking the impossible
        if (actor.abilityTo(PermissionCreateAccount.class) == null) {
            throw new Exception("The actor: " + actor.getName() + " does not have permission to Create Account");
        }

        return actor.abilityTo(PermissionCreateAccount.class);
    }

    public ClientData getClientData() {
        return clientData;
    }

    public static PermissionCreateAccount with(ClientData clientData) {
        return new PermissionCreateAccount(clientData);
    }
}
