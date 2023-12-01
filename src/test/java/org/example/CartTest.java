package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest extends BaseTest {

    public void goToCart() {
        getToolBarPage().clickShopButton();
    }

    public void addToCart(int books) throws InterruptedException {
        getHomePage().addToCartInOrder(books)
                .waitTextToBePresentInElement(5000, getToolBarPage().getNumCartButton(), String.valueOf(books));
    }

    @Test
    public void openCart() {
        goToCart();
        assertTrue(getDriver().getCurrentUrl().contains("shopping-cart"));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 20})
    public void viewAddToCart(int numBooks) throws InterruptedException {
        addToCart(numBooks);
        goToCart();
        getCartPage().waitElementActive(5000, getCartPage().getClearButton());

        assertEquals(numBooks, getCartPage().getListItemsCart().size());
    }

    @Test
    public void quantityAdd() throws InterruptedException {
        int addBooks = 4;

        addToCart(1);
        goToCart();
        getCartPage().waitElementActive(5000, getCartPage().getClearButton());

        getCartPage().addBook(1, addBooks)
                .waitTextToBePresentInElement(3000, getCartPage().getQuantity(), String.valueOf(addBooks + 1));

        assertEquals(addBooks + 1, getCartPage().getQuantityInt());

    }

    @ParameterizedTest(name = "{0} -> so much subtracted")
    @ValueSource(ints = {1})
    public void quantityMinus(int minusBook) throws InterruptedException {
        addToCart(1);
        goToCart();
        getCartPage().waitElementActive(5000, getCartPage().getClearButton());

        getCartPage().addBook(1, minusBook)
                .waitElementActive(1000,getCartPage().getMinusButton());

        getCartPage()
                .minusBook(1, minusBook)
                .waitTextToBePresentInElement(4000, getCartPage().getQuantity(), String.valueOf(1));

        assertEquals(1, getCartPage().getQuantityInt());

    }
}
