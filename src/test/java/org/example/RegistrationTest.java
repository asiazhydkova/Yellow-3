package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegistrationTest extends BaseTest{

    @Test
    public void openRegistrationPage() {
        getToolBarPage().clickLoginButtonTB();
        getLoginPage().clickRegisterButton();

        assertTrue(getRegistrationPage().getRegisterForm().isDisplayed());
    }
}
