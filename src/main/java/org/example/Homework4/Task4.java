package org.example.Homework4;

import java.util.Locale;
import java.util.Scanner;

/*
Write a program where the user must enter a string of several words separated
by a space.
To print the entered string, but the first letters of the individual words should be
uppercase, the rest should be lowercase.
Example:
Input:
mY tEsT stRinG
Output:
My Test String
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a several words separated by a space: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                String capitWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                result.append(capitWord).append(" ");
            }
        }
        String output = result.toString().strip();
        System.out.println(output);

        sc.close();

    }
}
