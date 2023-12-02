package com.raka.ds.striver.basics.java;

/**
 * Striver 1.5
 * You are given an array. The task is to reverse the array and print it.
 */

public class ReverseArray {

    public static int[] reverseArray(int[] array) {
        int length = array.length;
        int[] reverseArray = new int[length];

        for (int i = 0; i < length; i++) {
            reverseArray[i] = array[length - 1 - i];
        }

        return reverseArray;
    }

    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {2, 7, 4, 9, 2, 6, 4};

        System.out.println("Original Array - ");
        displayArray(array);

        int[] reverseArray = reverseArray(array);

        System.out.println("Reversed Array - ");
        displayArray(reverseArray);
    }
}
