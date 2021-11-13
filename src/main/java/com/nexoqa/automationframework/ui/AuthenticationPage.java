package com.nexoqa.automationframework.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class AuthenticationPage extends PageObject {

    public static final Target EMAIL = Target.the("the email field to authenticate")
            .locatedBy("#email");

    public static final Target EMAIL_CREATE = Target.the("the email field to create a new account")
            .locatedBy("#email_create");

    public static final Target PASSWORD = Target.the("the password field to authenticate")
            .locatedBy("#passwd");

    public static final Target SIGN_IN = Target.the("the submit button to login")
            .locatedBy("#SubmitLogin");

    public static final Target ERROR_MESSAGE = Target.the("the error description after login")
            .locatedBy(".alert");

    public static final Target CREATE_ACCOUNT = Target.the("the button to create a new account")
            .locatedBy("#SubmitCreate > span > i");

}
