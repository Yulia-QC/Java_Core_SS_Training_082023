package org.example.Homework5;

import java.util.Arrays;

/*
Radix sort LSD (Least Significant Digit),
is a non-comparative sorting algorithm that sorts integers or strings
by processing individual digits or characters from the least significant
digit to the most significant digit (or vice versa).

Radix Sort is like sorting numbers by looking at their digits one by one, from right to left.
Imagine you have a bunch of numbers written on cards, and you want to arrange them in order.

You start by looking at the rightmost digit of each number (the "ones" place) and group the cards based on that digit.
Then, you do the same for the next digit to the left (the "tens" place), and again, group the cards.
You keep doing this for all the digits until you reach the leftmost digit (the "thousands" place), making new groups each time.
By the end, all the cards are in order because you've sorted them by considering each digit's value.

example array: int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
Pass 1 (Sorting by the ones place - rightmost digit):
Look at the ones place of each number:
For numbers like 802 and 2, the ones place digit is 2.
For numbers like 24, the ones place digit is 4.
For numbers like 45 and 75, the ones place digit is 5.
For numbers like 66, the ones place digit is 6.
For numbers like 170 and 90, the ones place digit is 0.

Group the numbers based on their ones place digit:
Numbers with a ones place digit of 0: {170, 90}.
Numbers with a ones place digit of 2: {802, 2}.
Numbers with a ones place digit of 4: {24}.
Numbers with a ones place digit of 5: {45, 75}.
Numbers with a ones place digit of 6: {66}.

Put these groups back together in the array:
The array becomes: {170, 90, 802, 2, 24, 45, 75, 66}

Pass 2 (Sorting by the tens place):
Look at the tens place of each number:
For numbers like 802 and 2, the tens place digit is 0.
For numbers like 24, the tens place digit is 2.
For numbers like 45 and 75, the tens place digit is 4.
For numbers like 66, the tens place digit is 6.
For numbers like 170 and 90, the tens place digit is 7.

Group the numbers based on their tens place digit:
Numbers with a tens place digit of 0: {802, 2}.
Numbers with a tens place digit of 2: {24}.
Numbers with a tens place digit of 4: {45, 75}.
Numbers with a tens place digit of 6: {66}.
Numbers with a tens place digit of 7: {170, 90}.

Put these groups back together in the array:
The array becomes: {802, 2, 24, 45, 75, 66, 170, 90}

Pass 3 (Sorting by the hundreds place):
Since there are no numbers with a hundreds place digit in this array, there are no changes in this pass.

Pass 4 (Sorting by the thousands place):
Since there are no numbers with a thousands place digit in this array, there are no changes in this pass.

Finally, the array is fully sorted:
Sorted Array: {2, 2, 24, 45, 66, 75, 90, 170, 802}
 */
public class RadixSort {

    // A utility function to find the maximum value in the array
    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // A function to perform LSD Radix Sort
    public static void radixSort(int[] arr) {
        int n = arr.length;
        int max = getMax(arr);

        // Perform LSD Radix Sort for each digit position, where exp - exponent
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(arr, exp);
        }
    }

    // A helper function to perform counting sort based on a specific digit
    private static void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; // 10 digits (0-9)

        // Initialize count array
        Arrays.fill(count, 0);

        // Count occurrences of each digit in the current position
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // Update count array to store the position of each digit in the output
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array by placing elements in their sorted order
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy the sorted elements back to the original array
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Perform LSD Radix Sort
        radixSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
