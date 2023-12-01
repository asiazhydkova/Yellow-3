package org.example.pages;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.example.XPaths.XPath.HomeXPaths.*;
import static org.example.XPaths.XPath.ToolbarXPaths.*;
import static org.example.XPaths.XPath.filterContainer.*;

public class HomePage extends BasePage {

    @FindBy(xpath = THEME_BUTTON)
    private WebElement themeButton;

    @FindBy(xpath = PRICE_FILTER_WRAPPER)
    private WebElement priceFilterHeader;

    @FindBy(xpath = MENU_PANEL)
    private WebElement menuThemePanel;

    @FindBy(xpath = LIST_ITEMS)
    private List<WebElement> listItems;

    @FindBy(xpath = ITEM_ADD_MESSAGE)
    private WebElement itemAddMessage;

    public WebElement getWebElementPriceFilterWrapper() {
        return priceFilterHeader;
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickThemeButton() {
        themeButton.click();
    }

    public void chooseDropDownMenuThemeButton(int buttonNumber) {
        String dynamicButtonXPath = String.format("./button[%d]", buttonNumber);

        WebElement dynamicButtonElement = menuThemePanel.findElement(By.xpath(dynamicButtonXPath));

        dynamicButtonElement.click();
    }

    public String getColorElement(WebElement wb) {
        return wb.getCssValue("background-color");
    }

    public HomePage addToCartInOrder(int numberBooks){

        for (int i = 0; i < numberBooks; i++) {
            WebElement element = listItems.get(i);
            WebElement button = element.findElement(By.tagName("button"));
            button.click();
            //waitElement(2000, getItemAddMessage());
            //implicitWait(2000);
        }
        return this;
    }

    //Getters
    public List<WebElement> getListItems() { return listItems; }
    public WebElement getItemAddMessage() { return itemAddMessage; }
}
