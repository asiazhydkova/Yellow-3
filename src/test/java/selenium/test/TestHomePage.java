package selenium.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.example.selenium.java.pages.HomePage;

import java.time.Duration;

public class TestHomePage {
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
        homePage.clickIconChangeColorTheme();
        homePage.chooseDropDownMenuThemeButton(1);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        String actual = homePage.getNavBarBackgroundColor();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        String expected = "rgba(103, 58, 183, 1)";

        assertEquals(expected, actual);
    }
    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
