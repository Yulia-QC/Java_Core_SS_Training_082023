package org.example.Homework2;

/*
Display on the screen all even numbers between -30 to 30.
 */
public class Task4 {
    public static void main(String[] args) {


        for (int i = -30; i <= 30; i += 2) {
            if (i == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
