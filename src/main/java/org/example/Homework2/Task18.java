package org.example.Homework2;

import java.util.Scanner;
/*
Write a program that should do the following:
The program must accept (by the user) a number N from the interval [1-10000].
The program to reverse the number entered by the user and prints it in the
console.
Example:
Input:
4289
Output:
9824
 */

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N from the interval [1-10000]: ");

        int number = sc.nextInt();

        if (number < 1 || number > 10000) {
            System.out.println("Please, enter a number N from the interval [1-10000].");
        } else {
            int reversedNumber = reverseNumber(number);
            System.out.println("Reversed number: " + reversedNumber);
        }
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

}
