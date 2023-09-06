package org.example.Homework2;

/*
Write a program that aims to output all natural three-digit numbers that do not
have the same digits.
 */
public class Task12 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int digit1 = i % 10;
            int digit2 = (i / 10) % 10;
            int digit3 = (i / 100) % 10;

            if (digit1 != digit2 && digit1 != digit3 && digit2 != digit3) {
                System.out.println(i);
            }
        }
    }
}
