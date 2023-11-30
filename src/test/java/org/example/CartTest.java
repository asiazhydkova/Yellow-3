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

import static org.junit.jupiter.api.Assertions.*;

public class CartTest extends BaseTest{

    public void goToCart(){
        getToolBarPage().clickShopButton();
    }

    @Test
    public void openCart(){
        goToCart();
        assertTrue(getDriver().getCurrentUrl().contains("shopping-cart"));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,5,20})
    public void viewAddToCart(int numBooks) {
        Wait<WebDriver> wait = new WebDriverWait(getDriver(), Duration.ofMillis(1000));
        getHomePage().addToCartInOrder(numBooks);
        wait.until(ExpectedConditions.textToBePresentInElement(getToolBarPage().getNumCartButton(), String.valueOf(numBooks)));
        goToCart();
        getCartPage().waitElement(5000, getCartPage().getClearButton());
        assertEquals(numBooks, getCartPage().getListItemsCart().size());
    }

    @Test
    public void quantityAdd() throws InterruptedException {
        int addBooks = 2;

        Wait<WebDriver> wait = new WebDriverWait(getDriver(), Duration.ofMillis(1000));

        getHomePage().addToCartInOrder(1);
        wait.until(ExpectedConditions.textToBePresentInElement(getToolBarPage().getNumCartButton(), String.valueOf(1)));

        goToCart();
        getCartPage().waitElementActive(5000, getCartPage().getAddButton());
        getCartPage().addBook(1,addBooks);
        Thread.sleep(1000);
        assertEquals(addBooks+1,getCartPage().getQuantity());

    }

    @Test
    public void quantityMinus() throws InterruptedException {
        getHomePage().addToCartInOrder(1);
        goToCart();
        getCartPage().waitElementActive(5000, getCartPage().getAddButton());
        getCartPage().addBook(1,2);
        getCartPage().waitElementActive(5000, getCartPage().getMinusButton());
        getCartPage().minusBook(1,1);
        Thread.sleep(1000);
        assertEquals(2,getCartPage().getQuantity());

    }
}
