package org.example.Homework2;

import java.util.Scanner;
/*
Write a program that should do the following:
To read a positive number (n) entered by the user.
As result print a triangle with height equal to n.
Example:
Input:
4
Output:
 *
 ***
*****
*******
 */

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
