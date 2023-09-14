package org.example.Homework4;
/*
Write a program where the user must enter two strings.
- The program to check which of the two strings is longer.
- The program to print the length of the two strings.
Example:
Input:
short, longString
Output:
The longest string is: longString
short – 5, longString - 10

 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first string: ");
        String first = sc.nextLine();
        System.out.print("Enter a second string: ");
        String second = sc.nextLine();

        if (first.length() < second.length()) {
            System.out.println("The longest string is: " + second);
            System.out.println("short - " + first.length() + " longString - " + second.length());
        } else {
            System.out.println("The longest string is: " + first);
            System.out.println("short - " + second.length() + " longString - " + first.length());
        }

        sc.close();
    }
}
