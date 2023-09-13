package org.example.Homework4;

import java.util.Scanner;

/*
Write a program where the user must enter two strings.
The program should merge the two strings and print the newly obtained one.
Example:
Input:
Hello to; Java world
Output:
Hello to Java world
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first string: ");
        String first = sc.nextLine();
        System.out.print("Enter a second string: ");
        String second = sc.nextLine();

        System.out.println(first + " " + second);

        sc.close();
    }
}
