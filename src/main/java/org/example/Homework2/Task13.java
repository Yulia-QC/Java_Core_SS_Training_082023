package org.example.Homework2;

import java.util.Scanner;

/*
Write a program that accepts (by the user) a natural number N from the interval
[10-300].
The program should display in reverse order all the numbers that are multiples
of 7 and are smaller than N.
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number N from the interval [10-300]: ");
        int number = sc.nextInt();

        if (number < 10 || number > 300) {
            System.out.println("Wrong number. Enter a natural number N from the interval [10-300].");
        } else {
            for (int i = number - 1; i >= 10; i--) {
                if (i % 7 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}

