package org.example.Homework3;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int left = 0;
        int right = array.length - 1;

        while (left < right) {

            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
        System.out.println("No additional array: " + Arrays.toString(array));


        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[array1.length - 1 - i];
        }
        System.out.println("With additional array: " + Arrays.toString(array2));


    }
}
