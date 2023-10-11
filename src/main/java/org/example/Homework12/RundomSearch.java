package org.example.Homework12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RundomSearch {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for(int i =0; i < 20; i++) {
            numbers.add(random.nextInt(5001));
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to be found in the list: ");
        int searchNumber = sc.nextInt();

        int index = numbers.indexOf(searchNumber);
        if(index != -1) {
            System.out.println("The list contains the number " + searchNumber);
        }else {
            System.out.println("The lis does not contain number " + searchNumber);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if(num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Min number is: " + min);
        System.out.println("Max number is: " + max);
        System.out.println("All the elements of the list: " + numbers);
    }
}
