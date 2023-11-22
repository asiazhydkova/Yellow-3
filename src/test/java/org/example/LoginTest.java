package org.example;

import org.junit.jupiter.api.Test;
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
        getLoginPage().inputUsername(validUsername);
        getLoginPage().inputPassword(validPassword);
        getLoginPage().clickLoginButton();
        getLoginPage().implicitWait(500);

        assertTrue(getToolBarPage().getFavoriteButton().isDisplayed());
    }

    @Test
    public void loginNegative(){
        getToolBarPage().clickLoginButtonTB();
        getLoginPage().inputUsername(noValidUsername);
        getLoginPage().inputPassword(noValidPassword);
        getLoginPage().clickLoginButton();
        getLoginPage().implicitWait(500);

        assertTrue(getLoginPage().getErrorMessage().isDisplayed());
    }

    @Test
    public void loginEmptyUsername(){
        getToolBarPage().clickLoginButtonTB();
        getLoginPage().getUsername().clear();
        getLoginPage().inputPassword(validPassword);
        getLoginPage().clickLoginButton();
        getLoginPage().waitElement(500, getLoginPage().getErrorEmptyUsername());

        assertTrue(getLoginPage().getErrorEmptyUsername().isDisplayed());
    }

    @Test
    public void loginEmptyPassword(){
        getToolBarPage().clickLoginButtonTB();
        getLoginPage().inputUsername(validUsername);
        getLoginPage().getPassword().clear();
        getLoginPage().clickLoginButton();
        getLoginPage().implicitWait(500);

        assertTrue(getLoginPage().getErrorEmptyPassword().isDisplayed());
    }

    @Test
    public void redirectToRegistrationPage(){
        getToolBarPage().clickLoginButtonTB();
        getLoginPage().clickRegisterButton();
        getLoginPage().waitElement(200, getRegistrationPage().getRegisterForm());

        assertTrue(getDriver().getCurrentUrl().contains("register"));
    }
}