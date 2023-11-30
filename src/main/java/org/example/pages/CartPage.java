package org.example.pages;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

import static org.example.XPaths.XPath.CartXPaths.*;

public class CartPage extends BasePage {

    @FindBys({@FindBy(xpath = LIST_ITEMS_CART)})
    private List<WebElement> listItemsCart;

    @FindBy(xpath = CLEAR_BUTTON)
    private WebElement clearButton;

    @FindBy(xpath = MINUS_BUTTON)
    private WebElement minusButton;

    @FindBy(xpath = ADD_BUTTON)
    private WebElement addButton;

    @FindBy(xpath = QUANTITY)
    private WebElement quantity;

    @FindBy(xpath = ADD_MESSAGE)
    private WebElement addMessage;

    @FindBy(xpath = MINUS_MESSAGE)
    private WebElement minusMessage;

    @FindBy(xpath = DELETE_MESSAGE)
    private WebElement delMessage;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public CartPage addBook(int numBook, int num) {
        WebElement element = listItemsCart.get(numBook-1);
        WebElement addButtonW = element.findElement(By.xpath(ADD_BUTTON));
        for (int i = 0; i < num; i++) {
            addButtonW.click();
        }
        return this;
    }

    public CartPage minusBook(int numBook, int num) {
        WebElement element = listItemsCart.get(numBook-1);
        WebElement addButtonW = element.findElement(By.xpath(MINUS_BUTTON));
        for (int i = 0; i < num; i++) {
            addButtonW.click();
        }
        return this;
    }

    public int getQuantity() {
        return Integer.parseInt(quantity.getText());
    }

    //Getters
    public List<WebElement> getListItemsCart() {
        return listItemsCart;
    }

    public WebElement getClearButton() {
        return clearButton;
    }

    public WebElement getAddMessage() {
        return addMessage;
    }

    public WebElement getMinusMessage() {
        return minusMessage;
    }

    public WebElement getDelMessage() {
        return delMessage;
    }

    public WebElement getMinusButton() {
        return minusButton;
    }

    public WebElement getAddButton() {
        return addButton;
    }
}
