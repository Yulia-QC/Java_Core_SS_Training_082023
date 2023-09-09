package org.example.Homework3;

/*
Write a program that finds and outputs the longest sequence of identical
sequential elements in an array.
Example:
Input:
[1, 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 7, 7, 7, 7, 7, 7, 8, 8, 9, 10]
Output:
7, 7, 7, 7, 7, 7
 */
public class Task7 {
    public static void main(String[] args) {
        int arr1[] = {1, 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 7, 7, 7, 7, 7, 7, 8, 8, 9, 10};
        int maxLength = 1;
        int currentLength = 1;
        int longestIndex = 0;

        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] == arr1[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestIndex = i - maxLength + 1;
            }
        }
        for (int i = longestIndex; i < longestIndex + maxLength; i++) {
            System.out.print(arr1[i] + " ");

        }
    }
}
