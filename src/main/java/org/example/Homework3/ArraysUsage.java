package org.example.Homework3;

public class Arrays {
    public static void main(String[] args) {
        int[]array1 = {5,21,33};
        int array2[];
        array2 = new int[10];


//        System.out.println(array1);

//        System.out.println(array2);

//        System.out.println(array1.length);
//        System.out.println(array2.length);

        array2[0] = 10;
        array2[1] = -5;
//        array2[-1] = 6;

        System.out.println("For loop");
        for(int i=0; i< array1.length;i++){
            System.out.print("Element " + i + "=" + array1[i]);
        }

        System.out.println("For loop versa");
        for(int i=array1.length-1; i >= 0;i--){
            System.out.println("Element " + i + "=" + array1[i]);
        }

        System.out.println("While loop");
        int i =0;
        while (i < array1.length) {
            System.out.println("While loop Element " + i + " = " + array1[i]);
            i++;
        }

        System.out.println("Do-While loop");
        int j= 0;
        do {
            System.out.println("Do-while loop Element " + j + array1[j]);
            j++;
        }while (j <array1.length);

        System.out.println("For each loop");
        for(int number : array1) {
            System.out.println(number);
        }
    }
}
