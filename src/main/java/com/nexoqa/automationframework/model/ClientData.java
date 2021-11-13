package com.nexoqa.automationframework.model;

import com.nexoqa.automationframework.model.enums.clientdata.Country;
import com.nexoqa.automationframework.model.enums.clientdata.State;
import com.nexoqa.automationframework.model.enums.clientdata.Title;

public class ClientData {

    private Title title;
    private String firstName;
    private String lastName;
    private Credentials credentials;
    private BirthDate birthDate;
    private String address;
    private String city;
    private State state;
    private String postalCode;
    private Country country;
    private String phoneNumber;

    public ClientData(Title title, String firstName, String lastName, Credentials credentials, BirthDate birthDate, String address, String city, State state, String postalCode, Country country, String phoneNumber) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.credentials = credentials;
        this.birthDate = birthDate;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }

    public Title getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public BirthDate getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public State getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public Country getCountry() {
        return country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
