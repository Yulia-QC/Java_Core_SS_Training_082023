package org.example.Homework2;

import java.util.Scanner;
/*
Write a program that should do the following:
To read a positive integer (n) entered by the user.
Display the first n number of numbers that are divisible by 3.
Example:
Input:
9
Output:
3, 6, 9, 12, 15, 18, 21, 24, 27

 */

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer please: ");
        int a = sc.nextInt();

        if (a <= 0) {
            System.out.println("Enter a positive integer please");
        } else {
            System.out.println("Numbers divisible by 3: ");

            for (int i = 3; a > 0; i+=3) {
                if (i % 3 == 0) {
                    System.out.println(i);
                    a--;
                }
            }
        }
    }
}
