package org.example.Homework4;

import java.util.Scanner;

/*
Write a program that accepts two integers from the user.
The program calls the getTotal() method, which takes two integers and returns
their sum.
Store the result in a variable and print to the console.
 */
public class Task7 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        int total = getTotal(a, b);
        System.out.println("SUM of the input integers is: " + total);

        sc.close();
    }

    private static int getTotal(int a, int b) {
        return a + b;
    }
}
