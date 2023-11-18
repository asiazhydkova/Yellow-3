package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest extends BaseTest {

    @Test
    public void checkOpen() {

        assertTrue(getLoginPage().loginButton.isDisplayed());
        //getLoginPage().clickLoginButton();

    }

}