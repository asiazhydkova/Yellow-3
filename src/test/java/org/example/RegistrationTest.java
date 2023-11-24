package org.example;

import org.junit.jupiter.api.Test;
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

    @Test
    public void openRegistrationPage() {
        getToolBarPage().clickLoginButtonTB();
        getLoginPage().clickRegisterButton();

        assertTrue(getRegistrationPage().getRegisterForm().isDisplayed());
    }

    @Test
    public void successfulRegistration() throws IOException {
        getToolBarPage().clickLoginButtonTB();
        getLoginPage().clickRegisterButton();

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


}
