package com.raka.ds.striver.basics.java;

/**
 * Striver 1.5
 * You are given an array. The task is to reverse the array and print it.
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(1)
 */

public class ReverseArray3 {

    public static void reverseArray(int[] array, int low, int high) {
        if (low < high){
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;

            reverseArray(array, low+1, high-1);
        }
    }

    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Original Array - ");
        displayArray(array);

        reverseArray(array, 0, array.length-1);

        System.out.println("Reversed Array - ");
        displayArray(array);
    }
}
