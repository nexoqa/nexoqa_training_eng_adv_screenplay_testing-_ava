package com.nexoqa.automationframework.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php?controller=order")
public class ShoppingCartSummaryPage extends PageObject {

    public static final Target NAVIGATION_PAGE = Target.the("Navigation page")
            .located(By.cssSelector(".navigation_page"));

}
