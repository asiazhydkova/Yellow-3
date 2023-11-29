package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest extends BaseTest {

    private String validUsername = " ";
    private String validPassword = " ";
    private String noValidUsername = "qwer";
    private String noValidPassword = "12346564";


    public void goToLoginPage() {
        getToolBarPage().clickLoginButtonTB();

    }

    @Test
    public void openLoginPage() {
        goToLoginPage();
        assertTrue(getLoginPage().getLoginForm().isDisplayed());
    }

    @Test
    public void loginPositive() {
        goToLoginPage();
        getLoginPage().inputUsername(validUsername)
                .inputPassword(validPassword)
                .clickLoginButton()
                .implicitWait(500);

        assertTrue(getToolBarPage().getFavoriteButton().isDisplayed());

    }

    @Test
    public void loginNegative() {
        goToLoginPage();
        getLoginPage().inputUsername(noValidUsername)
                .inputPassword(noValidPassword)
                .clickLoginButton()
                .implicitWait(500);

        assertTrue(getLoginPage().getErrorMessage().isDisplayed());
        assertTrue(getDriver().getCurrentUrl().contains("login"));

    }

    @Test
    public void loginEmptyUsername() {
        goToLoginPage();
        getLoginPage().inputUsername("")
                .inputPassword(validPassword)
                .clickLoginButton()
                .waitElement(500, getLoginPage().getErrorEmptyUsername());

        assertTrue(getLoginPage().getErrorEmptyUsername().isDisplayed());
        assertTrue(getDriver().getCurrentUrl().contains("login"));

    }

    @Test
    public void loginEmptyPassword() {
        goToLoginPage();
        getLoginPage().inputUsername(validUsername)
                .inputPassword("")
                .clickLoginButton()
                .implicitWait(500);

        assertTrue(getLoginPage().getErrorEmptyPassword().isDisplayed());
        assertTrue(getDriver().getCurrentUrl().contains("login"));

    }

    @Test
    public void redirectToRegistrationPage() {
        goToLoginPage();
        getLoginPage().clickRegisterButton()
                .waitElement(200, getRegistrationPage().getRegisterForm());

        assertTrue(getDriver().getCurrentUrl().contains("register"));
    }
}