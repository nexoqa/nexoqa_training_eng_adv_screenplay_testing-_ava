package com.nexoqa.automationframework.model.builder;

import com.nexoqa.automationframework.model.enums.clientdata.Country;
import com.nexoqa.automationframework.model.enums.clientdata.State;
import com.nexoqa.automationframework.model.enums.clientdata.Title;
import com.nexoqa.automationframework.model.BirthDate;
import com.nexoqa.automationframework.model.ClientData;
import com.nexoqa.automationframework.model.Credentials;
import net.serenitybdd.screenplay.Actor;
import org.apache.commons.lang3.StringUtils;

import java.time.Month;

import static com.nexoqa.automationframework.model.builder.utils.BuilderUtils.generateRandomInteger;
import static com.nexoqa.automationframework.model.builder.utils.BuilderUtils.generateRandomString;


public class ClientBuilder extends BaseBuilder {

    private Credentials credentials;

    public ClientBuilder(Actor actor, Credentials credentials) {
        super(actor);
        this.credentials = credentials;
    }

    public ClientData build() {
        return new ClientData(defineTitle(),
                actor.getName(),
                generateLastName(),
                credentials,
                generateBirthDate(),
                generateAddress(),
                generateCity(),
                defineState(),
                generatePostalCode(),
                defineCountry(),
                generatePhoneNumber());
    }

    private Title defineTitle() {
        return Title.values()[generateRandomInteger(0, Title.values().length - 1)];
    }

    private String generateLastName() {
        return generateRandomString(6);
    }

    private BirthDate generateBirthDate() {
        return new BirthDate(
                generateBirthDay(),
                generateBirthMonth(),
                generateBirthYear()
        );
    }

    private String generateBirthDay() {
        return generateRandomInteger(1, 6).toString();
    }

    private String generateBirthMonth() {
        Month[] months = Month.values();
        return StringUtils.capitalize(
                months[generateRandomInteger(0, months.length - 1)].name().toLowerCase()
        );
    }

    private String generateBirthYear() {
        return generateRandomInteger(1900, 2019).toString();
    }

    private String generateAddress() {
        return "Street " + generateRandomString(6);
    }


    private String generateCity() {
        return generateRandomString(6);
    }

    private State defineState() {
        return State.values()[generateRandomInteger(0, State.values().length - 1)];
    }

    private String generatePostalCode() {
        return generateRandomInteger(10000, 99999).toString();
    }

    private Country defineCountry() {
        return Country.values()[generateRandomInteger(0, Country.values().length - 1)];
    }

    private String generatePhoneNumber() {
        return "+" + generateRandomInteger(1, 99) + " " + generateRandomInteger(100000000, 999999999);
    }

}
