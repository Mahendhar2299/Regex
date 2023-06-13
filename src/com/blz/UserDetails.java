package com.blz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {

    String PHONE = "^[0-9]{1,3}[\\s][0-9]{10}$";

    public void PhoneNumber(String phone) {
        Pattern pattern = Pattern.compile(PHONE);
        Matcher matcher = pattern.matcher(phone);
        System.out.println(matcher.matches());
    }
}
