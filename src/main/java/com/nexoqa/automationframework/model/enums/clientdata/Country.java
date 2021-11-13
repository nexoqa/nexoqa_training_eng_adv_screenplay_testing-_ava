package com.nexoqa.automationframework.model.enums.clientdata;

public enum Country {

    USA("United States", 21);

    private String name;
    private Integer id;

    Country(String name, Integer id) {
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
