package org.example.Homework3;

import java.util.Arrays;

/*
Write a program that creates an array with 10 elements and initializes each of
the elements with a value equal to the index of the element multiplied by 4. Print
the array in the console.
Example:
Output:
[0, 4, 8, 12, 16, 20, 24, 28, 32, 36]

 */
public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 4;
        }
        System.out.println(Arrays.toString(array));
    }
}
