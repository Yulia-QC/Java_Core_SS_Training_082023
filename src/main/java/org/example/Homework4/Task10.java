package org.example.Homework4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Write a Java program to remove the specific letters from a string and return the
new string. Specific letters: "p", "q", or "r".
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Pattern pattern = Pattern.compile("[^pqr]");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            str = matcher.group();
            System.out.print(str);
        }
        sc.close();
    }
}
