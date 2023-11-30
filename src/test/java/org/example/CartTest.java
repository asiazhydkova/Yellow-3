package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
    @ValueSource(ints = {1,2,5})
    public void viewAddToCart(int numBooks) throws InterruptedException {
        getHomePage().addToCartInOrder(numBooks);
        Thread.sleep(1000);
        goToCart();
        Thread.sleep(1000);
        assertEquals(numBooks, getCartPage().getListItemsCart().size());
    }
}
