package org.example.Homework3;

import java.util.Scanner;

/*
You have a square two-dimensional array of natural numbers whose values are
entered from the console (by the user). The program should print the sum of
each of the diagonals of the array.
Example:
Input:
1, 4, 6, 3
5, 9, 7, 2
4, 8, 1, 9
2, 3, 4, 5
Output:
The main diagonal sum is: 16
The second diagonal sum is: 20
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter the value for the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][n - 1 - i];
        }
        System.out.println("The main diagonal sum is: " + mainDiagonalSum);
        System.out.println("The second diagonal sum is: " + secondaryDiagonalSum);
        sc.close();

    }
}



