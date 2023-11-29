package org.example.XPaths;

public interface XPath {

    interface LoginXpaths {
        String USERNAME = "//input[contains(@formcontrolname,'username')]",
                PASSWORD = "//input[contains(@formcontrolname,'password')]",
                LOGIN_BUTTON = "//mat-card-actions//span[contains(text(),'Login')]/ancestor::button",
                REGISTER_BUTTON = "//button/span[contains(text(), 'Register')]//ancestor::button",
                ERROR_MESSAGE = "//mat-error[contains(text(),'Username or Password is incorrect')]",
                ERROR_EMPTY_USERNAME = "//mat-error[contains(text(),'Username is required')]",
                ERROR_EMPTY_PASSWORD = "//mat-error[contains(text(),'Password is required')]",
                LOGIN_FORM = "//app-login";

    }

    interface RegistrationXPaths {
        String FIRST_NAME = "//input[contains(@formcontrolname, 'firstname')]",
                LAST_NAME = "//input[contains(@formcontrolname, 'lastname')]",
                USERNAME = "//input[contains(@formcontrolname, 'username')]",
                PASSWORD = "//input[contains(@formcontrolname, 'password')]",
                CONFIRM_PASSWORD = "//input[contains(@formcontrolname, 'confirmPassword')]",
                ERROR_FIRST_NAME = "//mat-error[contains(text(),'First Name is required')]",
                ERROR_LAST_NAME = "//mat-error[contains(text(),'Last Name is required')]",
                ERROR_USERNAME = "//mat-error[contains(text(),'User Name is required')]",
                ERROR_USERNAMEINSYSTEM = "//mat-error[contains(text(),'User Name is not available')]",
                ERROR_PASSWORD = "//mat-error[contains(text(),'Password is required')]",
                ERROR_VALID_PASSWORD = "//mat-error[contains(text(),'Password should have minimum 8 characters, at least 1 uppercase letter, 1 lowercase letter and 1 number \')]",
                ERROR_CONFIRM_PASSWORD = "//mat-error[contains(text(),'Password do not match ')]",
                ERROR_RADIO_BUTTON = "//mat-error[contains(text(),'Gender is required')]",
                RADIO_BUTTON_MALE = "//mat-radio-button[contains(@value, 'Male')]",
                RADIO_BUTTON_FEMALE = "//mat-radio-button[contains(@value, 'Female')]",
                REGISTER_BUTTON = "//mat-card-actions//span[contains(text(),'Register')]/ancestor::button",
                LOGIN_BUTTON = "//app-user-registration//button/span[contains(text(), 'Login')]//ancestor::button",
                REGISTER_FORM = " //app-user-registration";

    }

    interface ToolbarXPaths {
        String LOGIN_BUTTON = "//mat-toolbar//button[contains(@class, 'ng-star-inserted')]",
                MENU_PANEL = "//*[@id='mat-menu-panel-0']/div",
                THEME_BUTTON = "//mat-toolbar//app-theme-picker/button",
                SHOP_BUTTON = "//mat-toolbar-row//mat-icon[contains(text(), 'shopping_cart')]/ancestor::button",
                FAVORITE_BUTTON = "//mat-toolbar-row//mat-icon[contains(text(), 'favorite')]/ancestor::button",
                SWAGGER_BUTTON = "//a[contains(text(), 'Swagger')]/ancestor::button",
                GITHUB_BUTTON = "//a[contains(text(), 'GitHub')]/ancestor::button",
                SEARCH_INPUT = "//mat-toolbar//input",
                TITLE_BUTTON = "//div[contains(@class,'brand-title')]/button",
                MENU_BUTTON = "//div/button[contains(@class, 'mat-menu-trigger')]",
                MENU_MYORDER_BUTTON = "//button[contains(text(),'My Orders')]",
                MENU_LOGOUT_BUTTON = "//button[contains(text(),'Logout')]",
                LOGO_SHOP = "//mat-icon/span";

    }

    interface filterContainer {
        String CATEGORY_LIST = "//app-book-filter/mat-nav-list",
                CATEGORY_ITEM_BIOGRAPHY = "//a[@_ngcontent-hsh-c129=''][contains(text(),'Biography')]",
                CATEGORY_ITEM_FICTION = "//a[@_ngcontent-hsh-c129=''][contains(text(),'Fiction')]",
                CATEGORY_ITEM_MYSTERY = "//a[@_ngcontent-hsh-c129=''][contains(text(),'Mystery')]",
                CATEGORY_ITEM_FANTASY = "//a[@_ngcontent-hsh-c129=''][contains(text(),'Fantasy')]",

        CATEGORY_ITEM_ROMANCE = "//a[@_ngcontent-hsh-c129=''][contains(text(),'Romance')]",
                PRICE_FILTER_WRAPPER = "//div[@class='docs-example-viewer-title mat-elevation-z2']";

    }

    interface HomeXPaths {
        String LIST_ITEMS = "//div[contains(@class, 'p-1 ng-star-inserted')]",
                BUTTON = "//app-addtocart//button",
                ITEM_ADD_MESSAGE = "//div[contains(@dir, 'ltr')]";
    }

}
