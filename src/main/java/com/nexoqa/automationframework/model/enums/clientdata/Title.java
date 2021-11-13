package com.nexoqa.automationframework.model.enums.clientdata;

public enum Title {

    Mr("Mr", 1),
    Mrs("Mrs", 2);

    private Integer id;
    private String description;

    Title(String description, Integer id) {
        this.description = description;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

}
