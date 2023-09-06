package org.example.Homework2;

import java.util.Scanner;

/*
Write a program that should do the following:
The program must accept (by the user) a number N from the interval [1-30].
Program to output the first N number of Fibonacci numbers.
Note: Fibonacci numbers starts with 0 and 1, and each subsequent member of
the sequence is obtained as the sum of the previous two.
Example:
Input:
10
Output:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/
public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter please a number N from the interval [1-30]: ");
        int number = sc.nextInt();
        if (number < 1 || number > 30) {
            System.out.println("Wrong number. Enter please a number N from the interval [1-30].");
        } else {
            int first = 0;
            int second = 1;
            if (number > 1) {
                System.out.print(", " + second);
                for (int i = 2; i < number; i++) {
                    int next = first + second;
                    System.out.print(", " + next);
                    first = second;
                    second = next;
                }
            }
        }
    }
}
