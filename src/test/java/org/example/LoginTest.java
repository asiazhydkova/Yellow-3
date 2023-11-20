package org.example;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest extends BaseTest {

    private String validUsername = " ";
    private String validPassword = " ";
    private String noValidUsername = "qwer";
    private String noValidPassword = "12346564";

    @Test
    public void openLoginPage() {
        getToolBarPage().clickLoginButtonTB();
        assertTrue(getLoginPage().getLoginForm().isDisplayed());
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

    @Test
    public void loginNegative(){
        getToolBarPage().clickLoginButtonTB();
        getLoginPage().getUsername().clear();
        getLoginPage().inputUsername(noValidUsername);
        getLoginPage().getPassword().clear();
        getLoginPage().inputPassword(noValidPassword);
        getLoginPage().clickLoginButton();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        assertTrue(getLoginPage().getErrorMessage().isDisplayed());
    }
}