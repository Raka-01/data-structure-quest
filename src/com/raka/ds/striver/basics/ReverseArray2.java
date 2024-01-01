package com.raka.ds.striver.basics;

/**
 * Striver 1.5
 * You are given an array. The task is to reverse the array and print it.
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(1)
 */

public class ReverseArray2 {

    public static void reverseArray(int[] array) {
        int length = array.length;
        int i = 0;
        int j = length - 1;

        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
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

        reverseArray(array);

        System.out.println("Reversed Array - ");
        displayArray(array);
    }
}
