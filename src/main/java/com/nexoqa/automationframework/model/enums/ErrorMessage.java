package com.nexoqa.automationframework.model.enums;

public enum ErrorMessage {

    AUTHENTICATION_FAILED("Authentication failed.");

    private String messageDescription;

    ErrorMessage(String messageDescription) {
        this.messageDescription = messageDescription;
    }

    public String getMessageDescription() {
        return messageDescription;
    }

}
