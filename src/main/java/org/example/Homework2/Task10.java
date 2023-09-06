package org.example.Homework2;

import java.util.Scanner;

/*
Write a program that should do the following:
To read a positive number entered by the user.
The program to determine whether the number is prime.
Note: What is a prime number? Number that is divisible only by 1 and itself.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number.");
                break;
            }
        }
        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number.");
        } else {
            System.out.println(n + " is the prime number!");
        }
    }
}


