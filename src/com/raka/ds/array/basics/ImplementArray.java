package com.raka.ds.array.basics;

public class ImplementArray {

    public static void main(String[] args) {
        int[] numbersArray;             // declaration - a reference of array is created

        numbersArray = new int[5];      // instantiation - memory is allocated (5 x 4 = 20 bytes)

        // setting values at each position
        numbersArray[0] = 743;
        numbersArray[1] = 384;
        numbersArray[2] = 342;
        numbersArray[3] = 812;
        numbersArray[4] = 238;

        for (int i = 0; i < 5; i++) {     // accessing each element of array using loop
            System.out.println(numbersArray[i]);
        }
    }
}
