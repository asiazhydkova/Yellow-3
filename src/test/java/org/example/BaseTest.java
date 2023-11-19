package org.example;

import org.example.pages.LoginPage;
import org.example.pages.ToolBarPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
    private WebDriver driver;
    private static final String URL = "https://bookcart.azurewebsites.net";

    @BeforeAll
    public static void profileSetUp() {
        System.setProperty("web-driver.gecko.driver", "drivers/geckodriver.exe");
    }


    @BeforeEach
    void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public LoginPage getLoginPage() {
        return new LoginPage(getDriver());
    }

    public ToolBarPage getToolBarPage() {
        return new ToolBarPage(getDriver());
    }


}