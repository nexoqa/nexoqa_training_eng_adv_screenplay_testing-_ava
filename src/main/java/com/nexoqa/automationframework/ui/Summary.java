package com.nexoqa.automationframework.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com")
public class Summary extends PageObject {

public static final Target PROCEED_CHECKOUT = Target.the("Proceed checkout")
        .located(By.cssSelector("a.standard-checkout"));

public static final Target PROCEED_ADDRESS = Target.the("Proceed address")
                .located(By.name("processAddress"));
        
public static final Target CONSENT_CHECKBOX = Target.the("Proceed address")
                .located(By.id("uniform-cgv"));

public static final Target PROCEED_CARRIER = Target.the("Proceed address")
                .located(By.name("processCarrier"));

public static final Target PAY_BY_BANK = Target.the("Proceed address")
.located(By.cssSelector("a.bankwire"));

}
