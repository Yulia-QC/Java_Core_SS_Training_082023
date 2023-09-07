package org.example.Homework2;

/*
Write a program to output to the console the multiplication table till 10.
Example:
Output:
1 * 1 = 1
1 * 2 = 2
…………
10 * 10 = 100

 */
public class Task14 {
    public static void main(String[] args) {
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.println(a + " * " + b + " = " + a * b);
            }
        }
    }
}
