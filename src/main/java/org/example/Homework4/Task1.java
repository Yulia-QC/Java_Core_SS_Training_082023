package org.example.Homework4;
/*
Write a method where the user enters a string that can contain lowercase and
uppercase letters.
The size of the string should not be greater than 50.
Print to the console the entered string, but in uppercase letters.
Print to the console the entered string, but in lowercase letters.
Example:
Input:
Hello Java
Output:
HELLO JAVA, hello java
 */

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 50 characters string: ");
        String str = sc.nextLine();
        if (str.length() > 50) {
            System.out.println("The string is too long, enter less then 50 characters please!");
        } else {
            System.out.println(str.toUpperCase());
            System.out.println(str.toLowerCase());
        }

        sc.close();
    }
}
