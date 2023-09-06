package org.example.Homework2;

import java.util.Scanner;
/*
Write a program that should do the following:
To read two different integers entered by the user.
Display all the numbers in the interval.
Example:
Input:
17, 30
Output:
17 18 19 20 21 22 23 24 25 26 27 28 29 30
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first numbers, please: ");
        int a = sc.nextInt();
        System.out.print("Enter second numbers, please: ");
        int b = sc.nextInt();

        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Enter different numbers, please.");
        }

    }
}
