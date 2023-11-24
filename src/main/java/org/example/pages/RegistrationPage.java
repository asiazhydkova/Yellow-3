package org.example.pages;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.example.XPaths.XPath.RegistrationXPaths.*;

public class RegistrationPage extends BasePage {

    @FindBy(xpath = REGISTER_FORM)
    private WebElement registerForm;

    @FindBy(xpath = FIRST_NAME)
    private WebElement firstName;

    @FindBy(xpath = LAST_NAME)
    private WebElement lastName;

    @FindBy(xpath = USERNAME)
    private WebElement username;

    @FindBy(xpath = PASSWORD)
    private WebElement password;

    @FindBy(xpath = CONFIRM_PASSWORD)
    private WebElement confirmPassword;

    @FindBy(xpath = RADIO_BUTTON_MALE)
    private WebElement radioButtonMale;

    @FindBy(xpath = RADIO_BUTTON_FEMALE)
    private WebElement radioButtonFemale;

    @FindBy(xpath = REGISTER_BUTTON)
    private WebElement registerButton;

    @FindBy(xpath = LOGIN_BUTTON)
    private WebElement loginButton;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void inputFirstName(String input) {
        firstName.clear();
        firstName.sendKeys(input);
    }

    public void inputLastName(String input) {
        lastName.clear();
        lastName.sendKeys(input);
    }

    public void inputUsername(String input) {
        username.clear();
        username.sendKeys(input);
    }

    public void inputPassword(String input) {
        password.clear();
        password.sendKeys(input);
    }

    public void inputConfirmPassword(String input) {
        confirmPassword.clear();
        confirmPassword.sendKeys(input);
    }

    public void selectRadioButtonMale() {
        radioButtonMale.click();
    }

    public void selectRadioButtonFemale() {
        radioButtonFemale.click();
    }

    //Getters
    public WebElement getRegisterForm() {
        return registerForm;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getConfirmPassword() {
        return confirmPassword;
    }

    public WebElement getRadioButtonMale() {
        return radioButtonMale;
    }

    public WebElement getRadioButtonFemale() {
        return radioButtonFemale;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
}
