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

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginButton(){
        loginButton.click();
    }
}
