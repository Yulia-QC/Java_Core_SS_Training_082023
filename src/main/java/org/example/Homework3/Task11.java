package org.example.Homework3;
/*
We have two one-dimensional arrays with natural numbers. Create a program
that compares all numbers
with the same indexes from both arrays and writes in a third array the smaller of
the two numbers. At the end print the console the following:
- the content of all three arrays
- the sum of the three arrays
- the product of the elements of the last array
Example:
Input:
[18, 19, 32, 1, 3, 4, 5, 6, 7, 8]
[ 1, 2, 3, 4, 5, 16, 17, 18, 27, 11]
Output:
The content of all 3 arrays
[18, 19, 32, 1, 3, 4, 5, 6, 7, 8]
[1, 2, 3, 4, 5, 16, 17, 18, 27, 11]
[1, 2, 3, 1, 3, 4, 5, 6, 7, 8]
The sum of the 3 arrays: 103 + 104 + 40 = 247
The product of the elements of the third array: 120 960
 */

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[] arr1 = {18, 19, 32, 1, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {1, 2, 3, 4, 5, 16, 17, 18, 27, 11};
        int[] arr3 = new int[arr1.length];


        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = Math.min(arr1[i], arr2[i]);
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        int sum = calculateSum(arr1) + calculateSum(arr2) + calculateSum(arr3);
        System.out.println("The sum of the 3 arrays: " + sum);
        System.out.println("The product of the elements of the third array: " + calculateProduct(arr3));

    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static int calculateProduct(int[] arr) {
        int product = 1; //when calculating product initialize a value should not be 0!
        for (int num : arr) {
            product *= num;
        }
        return product;
    }
}
