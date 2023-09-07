package org.example.Homework2;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

//        for(int index = 1; index <=100; index=+10) {
//            System.out.println(index);
//        }

//        for(int index = 100; index >=0; index=-10) {
//            System.out.println(index);
//        }

        //11 but should be 11
        //19               99
        int a = 1;

        while (a < 10) {
            int b = 1;
            while (b < 10) {
                System.out.println(a + " " + b);
                b++;
            }
            a++;
        }
        //11
        //99
//        System.out.println("-----------------------------");
//
//        for(int aa = 1; aa < 10; aa++) {
//            for (int bb = 1; bb < 10; bb++) {
//                System.out.println(aa + " " + bb);
//                if (aa == 3){
//                    break;
//                }
//            }
//        }

//        System.out.println("-----------------------------");
//        for (int aa = 0, bb = 10; aa <= bb; aa++, bb--) {
//            if(aa == 2 || aa == 4) {
//                continue;
//            }
//            System.out.println(aa + " " + bb);
//            if(aa == 3) {
//                break;
//            }


//        }
    }
}
