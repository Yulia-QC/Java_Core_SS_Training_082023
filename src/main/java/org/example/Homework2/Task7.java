package org.example.Homework2;

import java.util.Scanner;
/*
Write a program that should do the following:
To read a positive integer entered by the user.
Display the sum of all numbers between 1 and the entered number.
Example:
Input:
12
Output:
The sum of all numbers to 12 is = 78.
 */

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer please: ");
        int a = sc.nextInt();


        if (a >= 0) {
            int sum = 0;
            for (int i = 1; i <= a; i++) {
                sum += i;
            }
            System.out.println(sum);
        } else {
            System.out.println("Enter a positive number, please.");
        }
    }
}
