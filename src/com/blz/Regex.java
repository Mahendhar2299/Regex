package com.blz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Password:");
        String password = scanner.nextLine();
        UserDetails userDetails = new UserDetails();
        userDetails.password(password);
    }
}
