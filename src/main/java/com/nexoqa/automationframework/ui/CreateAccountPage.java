package com.nexoqa.automationframework.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation")
public class CreateAccountPage extends PageObject {

    public static final String MY_ACCOUNT_PAGE_TITLE = "My account - My Store";

    public static final Target TITLE_MR = Target.the("the radio button to specify the Mr title")
            .locatedBy("#id_gender1");

    public static final Target TITLE_MRS = Target.the("the radio button to specify the Mrs title")
            .locatedBy("#id_gender2");

    public static final Target FIRST_NAME = Target.the("the first name field")
            .located(By.xpath(".//label[text()='First name ']/following-sibling::input[@id='customer_firstname']"));

    public static final Target LAST_NAME = Target.the("the last name field")
            .located(By.xpath(".//label[text()='Last name ']/following-sibling::input"));

    public static final Target EMAIL = Target.the("the email field")
            .located(By.xpath(".//label[text()='Email ']/following-sibling::input"));

    public static final Target PASSWORD = Target.the("the password field")
            .located(By.xpath(".//label[text()='Password ']/following-sibling::input"));

    public static final Target NEWSLETTER = Target.the("the button to subscribe to the newsletter")
            .located(By.xpath(".//input[@name='newsletter']"));

    public static final Target FISRT_NAME_ADRESS = Target.the("the first name to address field")
            .located(By.xpath(".//label[text()='First name ']/following-sibling::input[@id='firstname']"));

    public static final Target LAST_NAME_ADRESS = Target.the("the last name to address field")
            .located(By.xpath(".//label[text()='Last name ']/following-sibling::input[@id='lastname']"));

    public static final Target COMPANY = Target.the("the company field")
            .located(By.xpath(".//label[text()='Company']/following-sibling::input"));

    public static final Target FIRST_ADDRESS = Target.the("the first address field")
            .located(By.xpath(".//label[text()='Address ']/following-sibling::input"));

    public static final Target SECOND_ADDRESS = Target.the("the second address field")
            .located(By.xpath(".//label[text()='Address (Line 2)']/following-sibling::input"));

    public static final Target CITY = Target.the("the city field")
            .located(By.xpath(".//label[text()='City ']/following-sibling::input"));

    public static final Target STATE = Target.the("the state field")
            .located(By.xpath(".//label[text()='State ']/following-sibling::div/select"));

    public static final Target POSTAL_CODE = Target.the("the postal code field")
            .located(By.xpath(".//label[text()='Zip/Postal Code ']/following-sibling::input"));

    public static final Target COUNTRY = Target.the("the country field")
            .located(By.xpath(".//label[text()='Country ']/following-sibling::div/select"));

    public static final Target ADDITIONAL_INFORMATION = Target.the("the Additional Information field")
            .located(By.xpath(".//label[text()='Additional information']/following-sibling::textarea"));

    public static final Target HOME_PHONE = Target.the("the home phone field")
            .located(By.xpath(".//label[contains(text(),'Home phone')]/following-sibling::input"));

    public static final Target MOBILE_PHONE = Target.the("the mobile phone field")
            .located(By.xpath(".//label[contains(text(),'Mobile phone')]/following-sibling::input"));

    public static final Target ALIAS = Target.the("the field to define an Alias")
            .located(By.xpath(".//input[@id='alias']"));

    public static final Target REGISTER = Target.the("the register button")
            .located(By.id("submitAccount"));

    public static final Target BIRTH_DAY = Target.the("the birth days select")
            .located(By.id("days"));

    public static final Target BIRTH_MONTH = Target.the("the birth months select")
            .located(By.id("months"));

    public static final Target BIRTH_YEAR = Target.the("the birth years selected")
            .located(By.id("years"));

}
