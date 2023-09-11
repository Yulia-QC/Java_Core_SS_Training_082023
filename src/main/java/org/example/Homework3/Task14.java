package org.example.Homework3;

import java.util.Scanner;

/*
Enter elements in a two-dimensional array of arbitrary dimension. Write a
program that outputs the values of the elements in a two-dimensional array
after it has been rotated by -90 degrees.
Example:
Input:
 1, 2, 3, 4
 5, 6, 7, 8
 9, 10, 11, 12
13, 14, 15, 16
Output:
4, 8, 12, 16
3, 7, 11, 15
2, 6, 10, 14
1, 5, 9, 13
 */
public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the values for the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] rotatedMatrix = rotateMatrix(matrix);
        System.out.println("Rotated Matrix: ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(rotatedMatrix[i][j]);
                if (j < rows - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        sc.close();

    }

    private static int[][] rotateMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] rotatedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedMatrix[cols - 1 - j][i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }
}
