package org.example.Homework3;

import java.util.Scanner;

/*
Write a program that read the array and find the largest number multiple of 5 in
the array.
Example:
Input:
[1, 4, 5, 2, 7, 10, 14, 55, 17, 25, 15, 12]
Output:
55

 */
public class Task1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 2, 7, 10, 14, 55, 17, 25, 15, 12};

        int max = Integer.MIN_VALUE;
        for (int number : arr1) {
            if ((number % 5) == 0 && number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}
