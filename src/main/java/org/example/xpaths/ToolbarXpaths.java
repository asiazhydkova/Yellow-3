package org.example.xpaths;

public class ToolbarXpaths {
    public static final String LOGIN_BUTTON = "//mat-toolbar//button[contains(@class, 'ng-star-inserted')]";
    public static final String THEME_BUTTON = "//mat-toolbar//app-theme-picker/button";
    public static final String SHOP_BUTTON = "//mat-toolbar-row//mat-icon[contains(text(), 'shopping_cart')]/ancestor::button";
    public static final String FAVORITE_BUTTON = "//mat-toolbar-row//mat-icon[contains(text(), 'favorite')]/ancestor::button";

    public static final String SWAGGER_BUTTON = "//a[contains(text(), 'Swagger')]/ancestor::button";
    public static final String GITHUB_BUTTON = "//a[contains(text(), 'GitHub')]/ancestor::button";

    public static final String SEARCH_INPUT = "//mat-toolbar//input";
    public static final String TITLE_BUTTON = "//div[contains(@class,'brand-title')]/button";

    public static final String MENU_BUTTON = "//div/button[contains(@class, 'mat-menu-trigger')]";
    public static final String MENU_MYORDER_BUTTON = "//button[contains(text(),'My Orders')]";
    public static final String MENU_LOGOUT_BUTTON = "//button[contains(text(),'Logout')]";
}
