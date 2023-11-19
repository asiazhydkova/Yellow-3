package org.example;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest extends BaseTest {

    private String validUsername = " ";
    private String validPassword = " ";

    @Test
    public void openLoginPage() {
        getToolBarPage().clickLoginButtonTB();
        assertTrue(getLoginPage().loginForm.isDisplayed());
    }

    @Test
    public void loginPositive(){
        getToolBarPage().clickLoginButtonTB();
        getLoginPage().getUsername().clear();
        getLoginPage().inputUsername(validUsername);
        getLoginPage().getPassword().clear();
        getLoginPage().inputPassword(validPassword);
        getLoginPage().clickLoginButton();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        assertTrue(getToolBarPage().getFavoriteButton().isDisplayed());
    }

}