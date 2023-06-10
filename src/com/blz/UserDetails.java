package com.blz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
    String firstName="^[A-Z][a-z]{2,}$";
    public void firstName(String name) {

        Pattern pattern = Pattern.compile(firstName);
        Matcher match = pattern.matcher(name);
        System.out.println(match.matches());

    }
}
