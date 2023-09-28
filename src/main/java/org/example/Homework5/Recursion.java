package org.example.Homework5;
/*
when function calls itself.
10 -> 10+9+8+...
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(sum(10));

    }

    public static int sum(int number) {
        if (number > 0) {


            return number + sum(number - 1);
        }
        return 0;
    }
}
