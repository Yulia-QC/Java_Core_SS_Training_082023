package org.example.Homework5;

import java.util.Arrays;
/*
Useful for very unsorted arrays.
pivot - is last number
if the elem is grater or equal to pivot it moving to left, less - left side.
Until we have everything sorted.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 4, 2};
        System.out.println("Array Before Quick Sort\n" + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array After Quick Sort\n" + Arrays.toString(arr));
    }
    private static void quickSort (int[] arr, int begin, int end) {
        if (begin >= end) {
            return;
        }

        int pivotIndex = partition(arr, begin, end);
        // {1, 3, 6, -1, 2, 0}
        // {0, 3, 6, -1, 2, 1}
        // {-2, -1, 0, 3, 6, 2, 1} pivotIndex = partition(arr, begin, end);
        // {-1, -2} & {3, 6, 2, 1} pivotIndex = arr[1]
        quickSort(arr, 0, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, end);



    }



    private static int partition(int[] arr, int begin, int end) {
        int pivotIndex = begin;
        int pivot = arr[end];



        for (int i = begin; i < end; i++) {
            if (pivot >= arr[i]) {
                int temp = arr[pivotIndex]; // arr[0] -> 1
                arr[pivotIndex] = arr[i];
                arr[i] = temp;



                pivotIndex++;
            }
        }
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[end];
        arr[end] = temp;



        return pivotIndex;
    }
}
