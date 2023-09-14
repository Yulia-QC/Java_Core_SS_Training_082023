package org.example.Homework4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Write a Java program where the user must enter a string - email.
The program should check is this a valid email string or not – use regex.
Display the result in the console.
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String email = sc.nextLine();

        Pattern pattern = Pattern.compile("^((?!\\.)[\\w-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$");
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println(email + " is a valid email address.");
        } else {
            System.out.println(email + " is NOT a valid email address.");
        }
        sc.close();
    }

}
