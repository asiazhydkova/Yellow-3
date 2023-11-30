package org.example;

import org.example.pages.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
    private WebDriver driver;
    private static final String URL = "https://bookcart.azurewebsites.net";

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
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


    public LoginPage getLoginPage() { return new LoginPage(getDriver()); }
    public RegistrationPage getRegistrationPage() {return new RegistrationPage(getDriver()); }
    public ToolBarPage getToolBarPage() {return new ToolBarPage(getDriver());}
    public HomePage getHomePage() {return new HomePage(getDriver());}
    public CartPage getCartPage() {return new CartPage(getDriver());}


}