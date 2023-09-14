package org.example.Homework4;

import java.util.Scanner;

/*
Write a program that accepts a single integer from the user (as a string).
The program calls the factorial() method, which accepts an integer and returns
the factorial of the given number.
Store the result in a variable and print to the console with an appropriate
message.
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String str = sc.next();
        int num = Integer.parseInt(str);
        System.out.println("Factorial of " + num + " is " + factorial(num));

        sc.close();
    }

    public static int factorial(int n) {
        int result = 1;
        if (n == 0 || n == 1) {
            result = 1; //Factorial of 0 and 1 is 1
        }
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
