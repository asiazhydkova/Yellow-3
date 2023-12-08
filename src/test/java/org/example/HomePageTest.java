package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTest extends BaseTest {
/*
    @Test
    public void testSelectFirstTheme() {

        getHomePage().clickThemeButton();

        getHomePage().chooseDropDownMenuThemeButton(1);
        getHomePage().waitElement(1000,getHomePage().getWebElementPriceFilterWrapper());

        String actual = getHomePage().getColorElement(getHomePage().getWebElementPriceFilterWrapper());
        getHomePage().waitElement(1000,getHomePage().getWebElementPriceFilterWrapper());
        String expected = "rgba(255, 215, 64, 1)";
        assertEquals(expected, actual);
    }*/

    @ParameterizedTest
    @ValueSource(ints = {45})
    public void viewItemsHomePage(int expected) {
        assertEquals(expected, getHomePage().getListItems().size());
    }

    @ParameterizedTest(name = "{0} -> number of books added to cart")
    @ValueSource(ints = {1, 2, 5})
    public void addToCart(int numBooks) throws InterruptedException {
        Wait<WebDriver> wait = new WebDriverWait(getDriver(), Duration.ofMillis(5000));

        getHomePage().addToCartInOrder(numBooks);
        wait.until(ExpectedConditions.textToBePresentInElement(getToolBarPage().getNumCartButton(), String.valueOf(numBooks)));

        assertEquals(numBooks, getToolBarPage().getNumLogoShopButton());
    }

    @Test
    public void redirectToCart() {
        getToolBarPage().clickShopButton();

        assertTrue(getDriver().getCurrentUrl().contains("shopping-cart"));
    }

}
