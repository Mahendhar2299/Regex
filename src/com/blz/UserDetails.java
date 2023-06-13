package com.blz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
    String lastName="^[A-Z][a-z]{2,}$";
    public void lastName(String name) {

        Pattern pattern = Pattern.compile(lastName);
        Matcher match = pattern.matcher(name);
        System.out.println(match.matches());

    }
}
