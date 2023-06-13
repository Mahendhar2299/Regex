package com.blz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {

    String PASSWORD = "^.{8,}$";

        public void password(String Password) {
        Pattern pattern = Pattern.compile(PASSWORD);
        Matcher matcher = pattern.matcher(Password);
        System.out.println(matcher.matches());
    }
}
