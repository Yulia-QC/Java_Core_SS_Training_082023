package org.example.Homework3;
/*
Write a program that reads an array and print whether it is mirrored. The
following arrays are mirrored:
[4 6 6 4]
[3]
[23 4 4 23]
[7 1 12 6 3 6 12 1 7]
 */

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {7, 1, 12, 6, 3, 7, 12, 1, 7};
        boolean isMirrored = true;


        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                isMirrored = false;
                break;
            }
        }
        if (isMirrored) {
            System.out.println("Array is mirrored");
        } else {
            System.out.println("Array is not mirrored");
        }
    }
}
