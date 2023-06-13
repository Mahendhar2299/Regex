package com.blz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {

    String EMAIL = "^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9+_-]+)*@[a-zA-Z0-9]+([.][a-zA-Z0-9+_-]+)+$";

    public void email(String email) {
        Pattern pattern = Pattern.compile(EMAIL);
        Matcher matcher = pattern.matcher(email);
        System.out.println(matcher.matches());
    }
}
