package org.example.pages;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.example.XPaths.XPath.LoginXpaths.*;


public class LoginPage extends BasePage{

    @FindBy(xpath = USERNAME)
    private WebElement username;

    @FindBy(xpath = PASSWORD)
    private WebElement password;

    @FindBy(xpath = LOGIN_BUTTON)
    private WebElement loginButton;

    @FindBy(xpath = REGISTER_BUTTON)
    private WebElement registerButton;

    @FindBy(xpath = LOGIN_FORM)
    private WebElement loginForm;

    @FindBy(xpath = ERROR_MESSAGE)
    private WebElement errorMessage;

    @FindBy(xpath = ERROR_EMPTY_USERNAME)
    private WebElement errorEmptyUsername;

    @FindBy(xpath = ERROR_EMPTY_PASSWORD)
    private WebElement errorEmptyPassword;

    public LoginPage(WebDriver driver) {
        super(driver);
    }



    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public void inputUsername(String name) {
        username.clear();
        username.sendKeys(name);
    }

    public void inputPassword(String passwordQ) {
        password.clear();
        password.sendKeys(passwordQ);
    }

    //Getters
    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginForm() {
        return loginForm;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public WebElement getErrorEmptyUsername() {
        return errorEmptyUsername;
    }

    public WebElement getErrorEmptyPassword() {
        return errorEmptyPassword;
    }
}
