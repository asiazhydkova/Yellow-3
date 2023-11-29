package org.example.pages;

import org.example.BasePage;
import org.openqa.selenium.Keys;
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

    @FindBy(xpath = ERROR_FIRST_NAME)
    private WebElement errorFirstName;

    @FindBy(xpath = ERROR_LAST_NAME)
    private WebElement errorLastName;

    @FindBy(xpath = ERROR_USERNAME)
    private WebElement errorUsername;

    @FindBy(xpath = ERROR_PASSWORD)
    private WebElement errorPassword;

    @FindBy(xpath = ERROR_VALID_PASSWORD)
    private WebElement errorValidPassword;

    @FindBy(xpath = ERROR_USERNAMEINSYSTEM)
    private WebElement errorUsernameInSystem;

    @FindBy(xpath = ERROR_CONFIRM_PASSWORD)
    private WebElement errorConfirmPassword;

    @FindBy(xpath = ERROR_RADIO_BUTTON)
    private WebElement errorRadioButton;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void inputTAB(WebElement element, String input){
        if (input.equals("pressTAB")){
            element.sendKeys(Keys.TAB);
        }
        else {
            element.sendKeys(input);
        }
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public RegistrationPage inputFirstName(String input) {
        firstName.clear();
        inputTAB(firstName, input);
        return this;
    }

    public RegistrationPage inputLastName(String input) {
        lastName.clear();
        inputTAB(lastName, input);
        return this;
    }

    public RegistrationPage inputUsername(String input) {
        username.clear();
        inputTAB(username, input);
        return this;
    }

    public RegistrationPage inputPassword(String input) {
        password.clear();
        inputTAB(password, input);
        return this;
    }

    public RegistrationPage inputConfirmPassword(String input) {
        confirmPassword.clear();
        inputTAB(confirmPassword, input);
        return this;
    }

    public RegistrationPage selectRadioButtonMale() {
        radioButtonMale.click();
        return this;
    }

    public RegistrationPage selectRadioButtonFemale() {
        radioButtonFemale.click();
        return this;
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

    public WebElement getErrorPassword() { return errorPassword; }

    public WebElement getErrorUsernameInSystem() { return errorUsernameInSystem;  }

    public WebElement getErrorFirstName() { return errorFirstName;    }

    public WebElement getErrorLastName() {  return errorLastName;    }

    public WebElement getErrorUsername() { return errorUsername;  }

    public WebElement getErrorConfirmPassword() {  return errorConfirmPassword;   }

    public WebElement getErrorRadioButton() {  return errorRadioButton;  }

    public WebElement getErrorValidPassword() {  return errorValidPassword;  }
}
