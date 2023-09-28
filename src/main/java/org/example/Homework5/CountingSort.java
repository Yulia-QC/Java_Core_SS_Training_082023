package org.example.Homework5;

import java.util.Arrays;

/*
Counting sort is an algorithm for sorting
small integers.
Its main idea is to count the number of
different objects.
Runs in linear running time in the number
of items.
find min, max
create array where we have max+1(because of index starts from 0
if the counter 0 , we skit this value and create new sorted array
 */
public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {6,4,3,4,1,4,3,6,6,2,4,3,4};
        int[] arrNeg = {6,4,3,-4,1,4,-3,6,-6,2,4,3,4};
        System.out.println("Original array: "+ Arrays.toString(arr));
        countingSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println();

        System.out.println("Negative array: " + Arrays.toString(arrNeg));
        countingSortOptimized(arrNeg);
        System.out.println("Optimized: " + Arrays.toString(arrNeg));
    }

    public static void countingSort(int[] arr) {
        int  max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        int[] counterArr = new int[max + 1]; // 6+1

        System.out.println("Counter before: " + Arrays.toString(counterArr));

        for (int number:arr) {
            counterArr[number]++;
        }
        System.out.println("Counter after: " + Arrays.toString(counterArr));

        int inputArrIndex = 0;
        for(int i =0; i < counterArr.length; i++) {
            for(int j = counterArr[i]; j >0 ; j--) {
                arr[inputArrIndex] = i;
                inputArrIndex++;

            }
        }
    }
    public static void countingSortOptimized (int[] arr) {
        int  max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(String.format("Min: %d; Max: %d", min,max));

        int[] counterArr = new int[max - min +1]; // 6+1

        System.out.println("Counter before: " + Arrays.toString(counterArr));

        for (int number:arr) {
            counterArr[number - min]++;
        }
        System.out.println("Counter after: " + Arrays.toString(counterArr));

        int inputArrIndex = 0;
        for(int i =0; i < counterArr.length; i++) {
            for(int j = counterArr[i]; j >0 ; j--) {
                System.out.println("i: " + " inputArrIndex: " + inputArrIndex + " i+min: " + (i+min));
                arr[inputArrIndex] = i+min;
                inputArrIndex++;

            }
        }
    }
}
