package com.example.ctatracker;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static boolean checkEmailForValidity(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
    }
    public static boolean checkUsernameEmpty(String uname) {
        if(uname == "") return false;
        else return true;
    }

    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

}




