package com.nexoqa.automationframework.model;

import net.serenitybdd.screenplay.Actor;

public class Credentials {

    private Actor actor;
    private String email;
    private String password;

    public Credentials(Actor actor, String email, String password) {
        
        this.actor = actor;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Actor getActor() {
        return actor;
    }

}
