package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.XPaths.XPath.CartXPaths.QUANTITY;
import static org.junit.jupiter.api.Assertions.*;

public class CartTest extends BaseTest {

    public void goToCart() {
        getToolBarPage().clickShopButton();
    }

    public void addToCart(int books) {
        Wait<WebDriver> wait = new WebDriverWait(getDriver(), Duration.ofMillis(5000));
        getHomePage().addToCartInOrder(books);
        wait.until(ExpectedConditions.textToBePresentInElement(getToolBarPage().getNumCartButton(), String.valueOf(books)));

    }

    @Test
    public void openCart() {
        goToCart();
        assertTrue(getDriver().getCurrentUrl().contains("shopping-cart"));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 20})
    public void viewAddToCart(int numBooks) {
        addToCart(numBooks);
        goToCart();
        getCartPage().waitElement(5000, getCartPage().getClearButton());
        assertEquals(numBooks, getCartPage().getListItemsCart().size());
    }

    @Test
    public void quantityAdd() throws InterruptedException {
        int addBooks = 4;

        addToCart(1);

        goToCart();
        getCartPage().waitElementActive(3000, getCartPage().getAddButton());

        getCartPage().addBook(1, addBooks);

        Wait<WebDriver> wait = new WebDriverWait(getDriver(), Duration.ofMillis(3000));
        wait.until(ExpectedConditions.textToBePresentInElement(getCartPage().getQuantity(), String.valueOf(addBooks + 1)));

        assertEquals(Integer.toString(addBooks + 1), getCartPage().getListItemsCart().get(0).findElement(By.xpath(QUANTITY)).getText());

    }

    @Test
    public void quantityMinus() throws InterruptedException {
        int minBook = 1;

        addToCart(1);
        goToCart();
        getCartPage().waitElementActive(3000, getCartPage().getAddButton());

        getCartPage().addBook(1, 2);

        getCartPage().minusBook(1, minBook);

        Wait<WebDriver> wait = new WebDriverWait(getDriver(), Duration.ofMillis(4000));
        wait.until(ExpectedConditions.textToBePresentInElement(getCartPage().getQuantity(), String.valueOf(2)));

        assertEquals(2, getCartPage().getQuantityInt());

    }
}
