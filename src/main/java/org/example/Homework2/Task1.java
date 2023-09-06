package org.example.Homework2;

import java.util.Scanner;

/*
Write a program that should do the following:
- To read a char from the keyboard.
- If Y / y char is entered, the program must print "Yes" in the console
- When N / n char is entered, the program must print "No" in the console
- Use Switch state
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char inputChar = Character.toLowerCase(sc.next().charAt(0));

        switch (inputChar) {
            case 'y':
                System.out.println("Yes");
                break;
            case 'n':
                System.out.println("No");
                break;
            default:
                System.out.println("Wrong input. Enter Y/y or N/n please.");
        }

    }
}

