package com.nexoqa.automationframework.model.enums.clientdata;

public enum State {

    Alabama("Alabama", 1),
    Alaska("Alaska", 2),
    Florida("Florida", 9),
    Nebraska("Nebraska", 27);

    private String name;
    private Integer id;

    State(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }
}
