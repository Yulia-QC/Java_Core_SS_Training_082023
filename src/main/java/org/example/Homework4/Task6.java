package org.example.Homework4;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/*
Write a program where the user must enter a string that contains letters and
numbers.
The program should output all the numbers from the string, as well as the sum
of the numbers.
Example:
Input:
test12ing45how-12this65works
Output:
12
45
-12
65
The sum of all numbers is: 110
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string that contains letters and numbers: ");
        String str = sc.nextLine();
        int sum = 0;


        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(str);

        System.out.println("Numbers found in the string:");

        while (matcher.find()) {
            String numberStr = matcher.group();
            int number = Integer.parseInt(numberStr);
            System.out.println(number);
            sum += number;
        }
        System.out.println("The sum of all numbers is: " + sum);

        sc.close();

    }
}
