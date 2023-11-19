package org.example.pages;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.example.xpaths.ToolbarXpaths.*;

public class ToolBarPage extends BasePage {

    @FindBy(xpath = LOGIN_BUTTON)
    private WebElement loginButtonTB;

    @FindBy(xpath = FAVORITE_BUTTON)
    private WebElement favoriteButton;

    public ToolBarPage(WebDriver driver) {
        super(driver);
    }


    public void clickLoginButtonTB(){
        loginButtonTB.click();
    }


    //Getters
    public WebElement getFavoriteButton() {
        return favoriteButton;
    }
}
