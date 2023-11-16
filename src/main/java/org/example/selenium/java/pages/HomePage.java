package org.example.selenium.java.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePage {
    private final WebDriver webDriver;

    private final By iconColorTheme = By.cssSelector("button.mat-icon-button[mattooltip='Select a theme for the site']");
    private final By navBar = By.cssSelector("app-nav-bar mat-toolbar");

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickIconChangeColorTheme() {
        WebElement iconElement = webDriver.findElement(iconColorTheme);
        iconElement.click();
    }

    public void chooseDropDownMenuThemeButton(int buttonNumber) {
        String dynamicButtonXPath = String.format("//*[@id='mat-menu-panel-0']/div/button[%d]", buttonNumber);
        By dynamicButtonLocator = By.xpath(dynamicButtonXPath);
        WebElement buttonElement = webDriver.findElement(dynamicButtonLocator);
        buttonElement.click();
    }

    public String getNavBarBackgroundColor() {
        WebElement navBarElement = webDriver.findElement(navBar);
        return navBarElement.getCssValue("background-color");
    }
}
