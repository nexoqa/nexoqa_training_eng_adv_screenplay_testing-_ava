package com.nexoqa.automationframework.model;

public class BirthDate {

    private String birthDay;
    private String birthMonth;
    private String birthYear;

    public BirthDate(String birthDay, String birthMonth, String birthYear) {
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public String getBirthYear() {
        return birthYear;
    }
}
