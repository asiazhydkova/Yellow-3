package org.example.pages;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.example.XPaths.XPath.ToolbarXPaths.*;

public class ToolBarPage extends BasePage {

    @FindBy(xpath = LOGIN_BUTTON)
    private WebElement loginButtonTB;

    @FindBy(xpath = FAVORITE_BUTTON)
    private WebElement favoriteButton;

    @FindBy(xpath = THEME_BUTTON)
    private WebElement themeButton;

    @FindBy(xpath = SHOP_BUTTON)
    private WebElement shopButton;

    @FindBy(xpath = SEARCH_INPUT)
    private WebElement search;

    @FindBy(xpath = TITLE_BUTTON)
    private WebElement titleButton;

    @FindBy(xpath = MENU_BUTTON)
    private WebElement menuButton;

    @FindBy(xpath = MENU_MYORDER_BUTTON)
    private WebElement menuMyOrderButton;

    @FindBy(xpath = MENU_LOGOUT_BUTTON)
    private WebElement menuLogOutButton;

    @FindBy(xpath = SWAGGER_BUTTON)
    private WebElement swaggerButton;

    @FindBy(xpath = GITHUB_BUTTON)
    private WebElement githubButton;

    public ToolBarPage(WebDriver driver) {
        super(driver);
    }


    public void clickLoginButtonTB() {
        loginButtonTB.click();
    }

    public void clickShopButton() { shopButton.click(); }

    public int getNumLogoShopButton() {
        return Integer.parseInt(shopButton.findElement(By.xpath(LOGO_SHOP)).getText());
    }
    public WebElement getNumCartButton() {
        return shopButton.findElement(By.xpath("//mat-icon/span"));
    }

    //Getters
    public WebElement getFavoriteButton() {
        return favoriteButton;
    }
    public WebElement getSwaggerButton() { return swaggerButton; }
    public WebElement getGithubButton() { return githubButton; }
    public WebElement getShopButton() { return shopButton; }

}
