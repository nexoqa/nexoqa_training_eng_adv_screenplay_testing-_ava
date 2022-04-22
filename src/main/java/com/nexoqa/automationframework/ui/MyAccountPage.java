package com.nexoqa.automationframework.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php?controller=my-account")
public class MyAccountPage extends PageObject {

    public static final Target HOME = Target.the("sign in button")
            .located(By.cssSelector("#center_column a.button"));

}
