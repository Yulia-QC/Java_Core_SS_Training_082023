package org.example.Homework4;

import java.util.Scanner;

/*
Write a program that accepts a single integer from the user.
The program calls the isOdd() method, which accepts an integer and returns a
boolean value.
The method to return true if the entered number is odd and false if it is even.
Store the result in a variable and print to the console with an appropriate
message.

 */
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int a = sc.nextInt();
        System.out.println(isOdd(a));

        sc.close();
    }

    public static boolean isOdd(int a) {
        boolean isOdd;
        if (a % 2 == 0) {
            isOdd = false;
            System.out.print(a + " is odd = ");
        } else {
            isOdd = true;
            System.out.print(a + " is odd = ");
        }
        return isOdd;
    }
}
