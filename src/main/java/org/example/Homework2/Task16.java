package org.example.Homework2;

import java.util.Scanner;

/*
Write a program that should do the following:
The program must accept (by the user) a number N from the interval [10-30000].
The program to check if the number entered is a palindrome.
Note: What is a palindrome? A palindrome is a number that is read the same
way front to back and back to front. Example: The number 28682 is a
palindrome.
 */
public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N from the interval [10-30000]: ");
        int n = sc.nextInt();

        if (n < 10 || n > 30000) {
            System.out.println("Wrong number. The number should be from the interval [10-30000].");
        } else {
            if (isPalindrome(n)) {
                System.out.println(n + " is a palindrome.");
            } else {
                System.out.println(n + " is not a palindrome.");
            }
        }
    }

    public static boolean isPalindrome(int n) {
        int originalNumber = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        return originalNumber == reverse;

    }
}
