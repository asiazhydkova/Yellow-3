package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegistrationTest extends BaseTest{

    public Properties openFileProperty() throws IOException {

        File file = new File("src/main/resources/registration.properties");

        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Properties prop = new Properties();
        prop.load(fileInput);
        return prop;
    }

    public void goToRegistrationPage(){
        getToolBarPage().clickLoginButtonTB();
        getLoginPage().clickRegisterButton();

    }

    @Test
    public void openRegistrationPage() {
        goToRegistrationPage();

        assertTrue(getRegistrationPage().getRegisterForm().isDisplayed());
    }

    @Test
    public void successfulRegistration() throws IOException {
        goToRegistrationPage();

        getRegistrationPage().inputFirstName(openFileProperty().getProperty("firstName"));
        getRegistrationPage().inputLastName(openFileProperty().getProperty("lastName"));
        getRegistrationPage().inputUsername(openFileProperty().getProperty("username"));
        getRegistrationPage().inputPassword(openFileProperty().getProperty("validPassword"));
        getRegistrationPage().inputConfirmPassword(openFileProperty().getProperty("validPassword"));
        getRegistrationPage().selectRadioButtonMale();

        new Actions(getDriver())
                .pause(java.time.Duration.ofSeconds(1))
                .click(getRegistrationPage().getRegisterButton())
                .perform();

        getRegistrationPage().waitElement(500, getLoginPage().getLoginForm());

        assertTrue(getDriver().getCurrentUrl().contains("login"));

    }

    @Test
    public void errorMessageWhenInvalidPassword() throws IOException {
        goToRegistrationPage();

        getRegistrationPage().inputPassword(openFileProperty().getProperty("invalidPassword"));
        getRegistrationPage().getPassword().sendKeys(Keys.TAB);
        getRegistrationPage().waitElement(300, getRegistrationPage().getErrorValidPassword());

        assertTrue(getRegistrationPage().getErrorValidPassword().isDisplayed());

    }

    @Test
    public void errorMessageWhenUsernameInSystem() throws IOException {
        goToRegistrationPage();

        getRegistrationPage().inputUsername(openFileProperty().getProperty("usernameInSystem"));
        getRegistrationPage().getUsername().sendKeys(Keys.TAB);
        getRegistrationPage().waitElement(300, getRegistrationPage().getErrorUsernameInSystem());

        System.out.println(getRegistrationPage().getErrorUsernameInSystem().getText());
        assertTrue(getRegistrationPage().getErrorUsernameInSystem().isDisplayed());

    }

    @Test
    public void errorsMessageWhenFieldsEmpty() {
        goToRegistrationPage();

        getRegistrationPage().getFirstName().sendKeys(Keys.TAB);
        getRegistrationPage().getLastName().sendKeys(Keys.TAB);
        getRegistrationPage().getUsername().sendKeys(Keys.TAB);
        getRegistrationPage().getPassword().clear();
        getRegistrationPage().getPassword().sendKeys(Keys.TAB);
        getRegistrationPage().getConfirmPassword().sendKeys(Keys.TAB);
        getRegistrationPage().getRadioButtonMale().sendKeys(Keys.TAB);
        getRegistrationPage().getRadioButtonFemale().sendKeys(Keys.TAB);

        getRegistrationPage().waitElement(200, getRegistrationPage().getErrorRadioButton());

        assertTrue(getRegistrationPage().getErrorUsername().isDisplayed());
        assertTrue(getRegistrationPage().getErrorFirstName().isDisplayed());
        assertTrue(getRegistrationPage().getErrorLastName().isDisplayed());
        assertTrue(getRegistrationPage().getErrorPassword().isDisplayed());
        assertTrue(getRegistrationPage().getErrorRadioButton().isDisplayed());
    }
}
