package org.example.lab_02.homework_02;

import java.util.regex.Pattern;

public class Validator {
    private static final Pattern PATTERNSOCIALSECURITYNUMBER = Pattern.compile("^(?!666|000|9\\d{2})\\d{3}-(?!00)\\d{2}-(?!0{4})\\d{4}$");
    private static final Pattern PATTERNFEDERALTAXID = Pattern.compile("^[1-9]\\d?-\\d{7}$");

    public static boolean isTrueSSN(String string) {
        return PATTERNSOCIALSECURITYNUMBER.matcher(string).matches();
    }

    public static boolean isTrueEIN(String string) {
        return PATTERNFEDERALTAXID.matcher(string).matches();
    }
}
