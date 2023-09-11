package org.example.Homework3;
/*
Write a program that accepts two integers from the user.
Then create an array with 10 elements in the following way:
- The first 2 elements of the array are the entered number.
- Each subsequent element of the array is equal to the sum of the
previous 2 elements in the array and if the index is:
o even multiply the sum by 3
o odd divide the sum by 2
Example:
Input:
Example 1: 1
Example 2: 3
Output:
Example 1: [1, 1, 6, 3, 27, 15, 126, 70, 588, 329]
Example 2: [3, 3, 18, 10, 84, 47, 393, 220, 1839, 1029]
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        int arr1[] = new int[10];
        arr1[0] = a*3;
        arr1[1] = b/2;

        for (int i = 2; i < arr1.length; i++) {
            if (i % 2 == 0) {
                arr1[i] = (arr1[i - 2] + arr1[i - 1]) * 3;
            } else {
                arr1[i] = (arr1[i - 2] + arr1[i - 1]) / 2;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
