package org.example.pages;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

import static org.example.XPaths.XPath.CartXPaths.*;
import static org.example.XPaths.XPath.ToolbarXPaths.THEME_BUTTON;

public class CartPage extends BasePage {

    @FindBys({@FindBy(xpath = LIST_ITEMS_CART)})
    private List<WebElement> listItemsCart;

    @FindBy(xpath = CLEAR_BUTTON)
    private WebElement clearButton;

    public CartPage(WebDriver driver) {
        super(driver);
    }


    //Getters
    public List<WebElement> getListItemsCart() { return listItemsCart;  }
    public WebElement getClearButton() { return clearButton;}
}
