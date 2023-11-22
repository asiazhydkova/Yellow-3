package org.example.pages;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.example.XPaths.XPath.ToolbarXPaths.*;
import static org.example.XPaths.XPath.filterContainer.*;

public class HomePage extends BasePage {

    @FindBy(xpath=THEME_BUTTON)
    private WebElement themeButton;

    @FindBy(xpath=PRICE_FILTER_WRAPPER)
    private WebElement priceFilterHeader;

    @FindBy(xpath=MENU_PANEL)
    private WebElement menuThemePanel;
    public WebElement getWebElementPriceFilterWrapper() {
        return priceFilterHeader;
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickThemeButton(){
        themeButton.click();
    }

    public void chooseDropDownMenuThemeButton(int buttonNumber) {
        String dynamicButtonXPath = String.format("./button[%d]", buttonNumber);

        WebElement dynamicButtonElement = menuThemePanel.findElement(By.xpath(dynamicButtonXPath));

        dynamicButtonElement.click();
    }

    public String getColorElement(WebElement wb){
        return wb.getCssValue("background-color");
    }


}
