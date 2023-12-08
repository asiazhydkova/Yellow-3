package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

public class RegistrationTest extends BaseTest {

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

    public void goToRegistrationPage() {
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

        getRegistrationPage().inputFirstName(openFileProperty().getProperty("firstName"))
                .inputLastName(openFileProperty().getProperty("lastName"))
                .inputUsername(openFileProperty().getProperty("username"))
                .inputPassword(openFileProperty().getProperty("validPassword"))
                .inputConfirmPassword(openFileProperty().getProperty("validPassword"))
                .selectRadioButtonMale();

        new Actions(getDriver())
                .pause(java.time.Duration.ofSeconds(1))
                .click(getRegistrationPage().getRegisterButton())
                .perform();

        getRegistrationPage().waitElement(1000, getLoginPage().getLoginForm());

        assertTrue(getDriver().getCurrentUrl().contains("login"));

    }

    @Test
    public void unSuccessfulRegistrationWhenInvalidPassword() throws IOException {
        goToRegistrationPage();

        getRegistrationPage().inputFirstName(openFileProperty().getProperty("firstName"))
                .inputLastName(openFileProperty().getProperty("lastName"))
                .inputUsername(openFileProperty().getProperty("username"))
                .inputPassword(openFileProperty().getProperty("invalidPassword"))
                .inputConfirmPassword(openFileProperty().getProperty("invalidPassword"))
                .selectRadioButtonMale();

        new Actions(getDriver())
                .pause(java.time.Duration.ofSeconds(1))
                .click(getRegistrationPage().getRegisterButton())
                .perform();

        assertTrue(getRegistrationPage().getErrorValidPassword().isDisplayed());
        assertTrue(getDriver().getCurrentUrl().contains("register"));
    }

    @Test
    public void unSuccessfulRegistrationWhenUsernameInSystem() throws IOException {
        goToRegistrationPage();

        getRegistrationPage().inputUsername(openFileProperty().getProperty("usernameInSystem"))
                .inputUsername("pressTAB")
                .implicitWait(1000);

        new Actions(getDriver())
                .pause(java.time.Duration.ofSeconds(2))
                .click(getRegistrationPage().getRegisterButton())
                .perform();

        assertTrue(getRegistrationPage().getErrorUsernameInSystem().isDisplayed());
        assertTrue(getDriver().getCurrentUrl().contains("register"));

    }

    @Test
    public void viewErrorsMessageWhenFieldsEmpty() {
        goToRegistrationPage();

        getRegistrationPage().inputFirstName("pressTAB")
                .inputLastName("pressTAB")
                .inputUsername("pressTAB")
                .inputPassword("")
                .inputPassword("pressTAB")
                .inputConfirmPassword("pressTAB")
                .getRadioButtonMale().sendKeys(Keys.TAB);

        getRegistrationPage().getRadioButtonFemale().sendKeys(Keys.TAB);

        getRegistrationPage().waitElement(200, getRegistrationPage().getErrorRadioButton());

        assertTrue(getRegistrationPage().getErrorUsername().isDisplayed());
        assertTrue(getRegistrationPage().getErrorFirstName().isDisplayed());
        assertTrue(getRegistrationPage().getErrorLastName().isDisplayed());
        assertTrue(getRegistrationPage().getErrorPassword().isDisplayed());
        assertTrue(getRegistrationPage().getErrorRadioButton().isDisplayed());
    }
}
