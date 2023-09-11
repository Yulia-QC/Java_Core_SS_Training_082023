package org.example.Homework3;
/*
Write a program that reads array with 10 numbers and exchanged places of
elements with indexes:
- 0 and 1, 8 and 9 via third variable
- 2 and 3 by addition / subtraction
- 4 and 5 by multiplication
- 6 and 7 by bitwise operations (optional) or by third variable
Example:
Input:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Output:
[2, 1, 4, 3, 6, 5, 8, 7, 10, 9]
 */

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        temp = arr[8];
        arr[8] = arr[9];
        arr[9] = temp;

        arr[2] = arr[2] + arr[3];
        arr[3] = arr[2] - arr[3];
        arr[2] = arr[2] - arr[3];

        arr[4] = arr[4] * arr[5];
        arr[5] = arr[4] / arr[5];
        arr[4] = arr[4] / arr[5];

        // XOR operation is swapping bits
        // initial values in bits: arr[6] = 0111, arr[7] = 1000, XOR comparing the bits of two numbers and setting the corresponding bits in the result to 1 if the bits in the operands are different, and 0 if they are same
        arr[6] = arr[6] ^ arr[7]; // arr[6] = 1111
        arr[7] = arr[6] ^ arr[7]; // arr[7] = 0111
        arr[6] = arr[6] ^ arr[7]; // arr[6] = 1000

        System.out.println(Arrays.toString(arr));


    }
}
