package org.example.Homework2;

import java.util.Scanner;
/*
Write a program that should do the following:
To read a natural numbers entered by the user.
When number 0 is entered, the program should stop reading more numbers
from the console.
To output the smallest and largest number of all entered numbers.
 */

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter a natural number (0 to stop): ");
            int number = sc.nextInt();

            if (number == 0) {
                break;
            }

            if (number < 0) {
                System.out.println("Please enter a natural number greater than or equal to 0.");
                continue;
            }

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }
        System.out.println("Smallest number is: " + min);
        System.out.println("Largest number is: " + max);
    }

}

