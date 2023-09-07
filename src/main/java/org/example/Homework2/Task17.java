package org.example.Homework2;

import java.util.Scanner;
/*
Write a program that accepts a positive number N (entered by the user).
The program to calculate the value of N! (N factorial).
Example:
Input:
4
Calculations:
4! = 1*2*3*4 = 24
Output:
24
 */

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Wrong number. Please enter a positive number.");
        } else {
            long factorial = calculateFactorial(n);
            System.out.println(n + "! = " + factorial);
        }
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
