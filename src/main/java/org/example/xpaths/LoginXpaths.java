package org.example.xpaths;

public class LoginXpaths {
    public static final String USERNAME = "//input[contains(@formcontrolname,'username')]";
    public static final String PASSWORD = "//input[contains(@formcontrolname,'password')]";
    public static final String LOGIN_BUTTON = "//mat-card-actions//span[contains(text(),'Login')]/ancestor::button";
    public static final String REGISTER_BUTTON = "//button/span[contains(text(), 'Register')]//ancestor::button";
    public static final String ERROR_MESSAGE = "//mat-error[contains(text(),'Username or Password is incorrect')]";

    public static final String LOGIN_FORM = "//app-login";
}
