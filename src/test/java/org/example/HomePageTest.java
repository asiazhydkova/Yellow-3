package org.example;

import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.pages.RegistrationPage;
import org.example.pages.ToolBarPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePageTest extends BaseTest{
    private WebDriver driver;
    private HomePage homePage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get("https://bookcart.azurewebsites.net/");
    }

    @Test
    public void testSelectFirstTheme() {

        homePage.clickThemeButton();

        homePage.chooseDropDownMenuThemeButton(1);
        homePage.waitElement(1000,homePage.getWebElementPriceFilterWrapper());

        String actual = homePage.getColorElement(homePage.getWebElementPriceFilterWrapper());
        homePage.waitElement(1000,homePage.getWebElementPriceFilterWrapper());
        String expected = "rgba(255, 215, 64, 1)";
        assertEquals(expected, actual);
    }
    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
