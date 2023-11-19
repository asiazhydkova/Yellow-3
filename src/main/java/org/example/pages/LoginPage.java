package org.example.pages;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.example.xpaths.LoginXpaths.*;

public class LoginPage extends BasePage {

    @FindBy(xpath = USERNAME)
    private WebElement username;

    @FindBy(xpath = PASSWORD)
    private WebElement password;

    @FindBy(xpath = LOGIN_BUTTON)
    public WebElement loginButton;

    @FindBy(xpath = REGISTER_BUTTON)
    private WebElement registerButton;

    @FindBy(xpath = LOGIN_FORM)
    public WebElement loginForm;

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
        username.sendKeys(name);
    }

    public void inputPassword(String passwordQ) {
        password.sendKeys(passwordQ);
    }

    //Getters
    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }
}
