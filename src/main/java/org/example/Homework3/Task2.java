package org.example.Homework3;

import java.util.Arrays;

/*
    Write a program that reads an array and creates a new array from it. Half
of the elements of the new array must exactly be like the second half of the
original, and the other half are the same elements, but in reverse order. Bring
the new array to the screen.
Example:
Input:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Output:
[6, 7, 8, 9, 10, 10, 9, 8, 7, 6]

     */
public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] newArray = new int[arr1.length];

        System.arraycopy(arr1, arr1.length / 2, newArray, 0, arr1.length / 2);
        for (int i = 0; i < arr1.length / 2; i++) {
            newArray[arr1.length / 2 + i] = arr1[arr1.length - 1 - i];
        }

        System.out.println(Arrays.toString(newArray));
    }
}
