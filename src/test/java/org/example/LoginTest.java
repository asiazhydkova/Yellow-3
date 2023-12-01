package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest extends BaseTest {

    public void goToLoginPage() {
        getToolBarPage().clickLoginButtonTB();

    }

    @Test
    public void openLoginPage() {
        goToLoginPage();
        assertTrue(getLoginPage().getLoginForm().isDisplayed());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "andrSem4,  qiw12UTRgg"
    })
    public void loginPositive(String validUsername, String validPassword) {
        goToLoginPage();
        getLoginPage().inputUsername(validUsername)
                .inputPassword(validPassword)
                .clickLoginButton()
                .waitElement(1000, getToolBarPage().getFavoriteButton());

        assertTrue(getToolBarPage().getFavoriteButton().isDisplayed());

    }

    @ParameterizedTest
    @CsvSource(value = {
            "qwer,  12346564"
    })
    public void loginNegative(String noValidUsername, String noValidPassword) {
        goToLoginPage();
        getLoginPage().inputUsername(noValidUsername)
                .inputPassword(noValidPassword)
                .clickLoginButton()
                .waitElement(500, getLoginPage().getErrorMessage());

        assertTrue(getLoginPage().getErrorMessage().isDisplayed());
        assertTrue(getDriver().getCurrentUrl().contains("login"));

    }

    @ParameterizedTest
    @CsvSource(value = {
            "andrSem4"
    })
    public void loginEmptyUsername(String validPassword) {
        goToLoginPage();
        getLoginPage().inputUsername("")
                .inputPassword(validPassword)
                .clickLoginButton()
                .waitElement(500, getLoginPage().getErrorEmptyUsername());

        assertTrue(getLoginPage().getErrorEmptyUsername().isDisplayed());
        assertTrue(getDriver().getCurrentUrl().contains("login"));

    }

    @ParameterizedTest
    @CsvSource(value = {
            "andrSem4"
    })
    public void loginEmptyPassword(String validUsername) {
        goToLoginPage();
        getLoginPage().inputUsername(validUsername)
                .inputPassword("")
                .clickLoginButton()
                .waitElement(1000, getLoginPage().getErrorEmptyPassword());

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