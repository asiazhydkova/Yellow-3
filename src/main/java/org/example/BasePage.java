package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void implicitWait(long timeToWait) {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeToWait));
    }

    public void waitElement(long timeToWait, WebElement element) {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofMillis(timeToWait));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitTextToBePresentInElement(long timeToWait, WebElement element, String text) {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofMillis(timeToWait));
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    public void waitElementActive(long timeToWait, WebElement element) {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofMillis(timeToWait));
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }
}
