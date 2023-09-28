package org.example.Homework5;

import java.util.Arrays;

/*
Swap adjacent elements if the next
element is greater
 Used for small arrays
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12,87,8,15,65,2,98,-4,544};
        System.out.println(Arrays.toString(bubbleSort(arr)));
        System.out.println(Arrays.toString(bubbleSortOptimized(arr)));

    }
    public static int[] bubbleSort(int[] myArr){
        int countAllIterations = 0;
        for(int index = 0; index < myArr.length; index++) {
            int iterations = 0;
            for( int inner = 0; inner< myArr.length - 1; inner++) {
                iterations++;
                if(myArr[inner] > myArr[inner + 1]) {
                        int temp = myArr[inner];
                        myArr[inner] = myArr[inner + 1];
                        myArr[inner+1] = temp;
                }
            }
            countAllIterations += iterations;
        }
        System.out.println("Iterations: " + countAllIterations);
        return myArr;
    }
    public static int[] bubbleSortOptimized(int[] myArr){
        int countAllIterations = 0;
        for(int index = 0; index < myArr.length; index++) {
            int iterations = 0;
            boolean hasSwap = false; // add boolean if no swapping
            for( int inner = 0; inner< myArr.length - 1; inner++) {
                iterations++;
                if(myArr[inner] > myArr[inner + 1]) {
                    int temp = myArr[inner];
                    myArr[inner] = myArr[inner + 1];
                    myArr[inner+1] = temp;
                    hasSwap = true; // make boolean true if swapping is done
                }
            }
            countAllIterations += iterations;
            if(!hasSwap) {  // brake check if no swapping
                break;

            }
        }
        System.out.println("Iterations: " + countAllIterations);
        return myArr;
    }
}
