package org.example.Homework3;

/*
A sequence of natural numbers we will call zigzag if the following conditions are
met for its elements:
N1 < N2 > N3 < N4 > N5 < … > Ni < Nj > … < Nn
or
N1 > N2 < N3 > N4 < N5 > … < Ni > Nj < … > Nn
Write a program that checks whether a sequence of numbers entered into a
one-dimensional array meet the above requirements.
Example:
Input:
[1, 6, 3, 7, 2, 9, -2, 12, 5]
[1, 2, 3, 4, 5, 6, 7, 8, 9]
Output:
Zigzag
Not a Zigzag
 */
public class Task10 {
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 7, 2, 9, -2, 12, 5};

        boolean isZigzag1 = true; // N1 < N2 > N3 < N4 > N5 < … > Ni < Nj > … < Nn
        boolean isZigzag2 = true; // N1 > N2 < N3 > N4 < N5 > … < Ni > Nj < … > Nn

// N1 < N2 > N3 < N4 > N5 < … > Ni < Nj > … < Nn
        for (int index = 0; index < arr.length - 1; index++) {
            if (index % 2 == 0) {
                if (!(arr[index] < arr[index + 1])) {   // N1 < N2 > N3 < N4 > N5 < … > Ni < Nj > … < Nn
                    isZigzag1 = false;
                    break;
                }
                if (!(arr[index] > arr[index + 1])) {
                    isZigzag1 = false;
                    break;
                }
            } else {
                if (!(arr[index] > arr[index + 1])) {  // N1 > N2 < N3 > N4 < N5 > … < Ni > Nj < … > Nn
                    isZigzag2 = false;
                    break;
                }
                if (!(arr[index] < arr[index + 1])) {
                    isZigzag2 = false;
                    break;
                }
            }
        }

        if (isZigzag1 || isZigzag2) {
            System.out.println("Zigzag");
        } else {
            System.out.println("Not Zigzag");
        }


    }
}





