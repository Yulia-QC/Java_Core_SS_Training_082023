package org.example.Homework4;

import java.util.Scanner;

/*
Write a program where the user must enter a single word (string).
The program to check if the entered string is a palindrome.
Note: Palindrome – a word that is read left-to-right and right-to-left in the same
way.
Example:
Input:
kayak
wow
test
Output:
kayak is palindrome.
wow is palindrome.
test is not a palindrome.

 */
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();

        boolean isPalindrome = true;

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println(word + " is palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
        sc.close();

    }
}
