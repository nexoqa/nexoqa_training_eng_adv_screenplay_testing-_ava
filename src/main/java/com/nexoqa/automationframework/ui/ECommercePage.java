package com.nexoqa.automationframework.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com")
public class ECommercePage extends PageObject {

    public static final Target SIGN_IN = Target.the("sign in button")
            .located(By.cssSelector(".login"));

    public static final Target SIGN_OUT = Target.the("sign out button")
            .located(By.cssSelector(".logout"));

    public static final Target ACCOUNT = Target.the("the account name")
            .located(By.cssSelector(".account"));

}
