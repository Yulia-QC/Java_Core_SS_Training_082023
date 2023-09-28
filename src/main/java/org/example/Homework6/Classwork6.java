package org.example.Homework6;

import java.util.Arrays;
import java.util.Locale;

/*
Write a method to reverse a number. To do this, use a recursion.
Example:
Input:
2854
Output:
4582
______________________
Write a method to output the factorial of a number entered by the user. Use
recursion.
Example:
Input:
5
Output:
120
--------------------------
Write a method that counts how many times each English letter occurs in a given
character string. Store the results in an array.
Example:
Input:
AaaEbBCc deD
Output:
a-3
b-2
c-2
d-2
e-2
f-0
…
z-0
 */
public class Classwork6 {
    public static void main(String[] args) {

        System.out.println(makeRecurtion(2854, 0));
        System.out.println(makeFactorial(15));
        String input = "AaaEbBCc deDx";
        contChars(input);

    }
    public static int makeRecurtion(int a, int result) {
        System.out.println("... " + a + " result: " + result);
        // condition
        if (a > 0) {
            int lastDigit = a % 10; // 2
            result = result*10 + lastDigit; //4*10 + 5 -> 45*10 + 8-> 458 -> 458*10 + 2 = 4582

            // recursive call + update
            return makeRecurtion(a / 10, result); //285 28 2
        }
        System.out.println("end!");
        return result; //bottom
    }

    public static long makeFactorial(long input) {
        //condition
        if(input > 0) {
            // recursive point
            return input * makeFactorial(input - 1);
        }
        // bottom
        return 1;
    }

    public static void contChars(String input) {
        input = input.replaceAll("\\W","").toLowerCase();
        int[] counting = new int[26];

        for(int i = 0; i < input.length(); i++) {
           counting[input.charAt(i) - 'a']++;
        }

        for(int i =0; i < counting.length; i++) {
            int count = counting[i];
            if(count > 0) {
            System.out.println((char)(i + 'a') + "-" + count);
            }
        }


    }
}
