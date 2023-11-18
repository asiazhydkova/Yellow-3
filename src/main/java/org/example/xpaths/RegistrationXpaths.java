package org.example.xpaths;

public class RegistrationXpaths {
    public static final String FIRST_NAME = "//input[contains(@formcontrolname, 'firstname')]";
    public static final String LAST_NAME = "//input[contains(@formcontrolname, 'lastname')]";
    public static final String USERNAME = "//input[contains(@formcontrolname, 'username')]";
    public static final String PASSWORD = "//input[contains(@formcontrolname, 'password')]";
    public static final String CONFIRM_PASSWORD = "//input[contains(@formcontrolname, 'confirmPassword')]";

    public static final String ERROR_FIRST_NAME = "//mat-error[contains(text(),'First Name is required')]";
    public static final String ERROR_LAST_NAME = "//mat-error[contains(text(),'Last Name is required')]";
    public static final String ERROR_USERNAME = "//mat-error[contains(text(),'User Name is required')]";
    public static final String ERROR_PASSWORD = "//mat-error[contains(text(),'Password should have minimum 8 characters, at least 1 uppercase letter, 1 lowercase letter and 1 number ')]";
    public static final String ERROR_CONFIRM_PASSWORD = "//mat-error[contains(text(),'Password do not match')]";
    public static final String ERROR_RADIO_BUTTON = "//*[@id='mat-error-6']  -> Bag";

    public static final String RADIO_BUTTON_MALE = "//mat-radio-button[contains(@value, 'Male')]";
    public static final String RADIO_BUTTON_FEMALE = "//mat-radio-button[contains(@value, 'Female')]";

    public static final String REGISTER_BUTTON = "//app-user-registration//button[contains(@class, 'mat-primary')]";
    public static final String LOGIN_BUTTON = "//app-user-registration//button[contains(@class, 'mat-elevation-z4')]";
    public static final String REGISTER_FORM = " //app-user-registration";


}
