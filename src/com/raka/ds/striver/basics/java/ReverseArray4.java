package com.raka.ds.striver.basics.java;

import java.util.Arrays;
import java.util.Collections;

/**
 * Striver 1.5
 * You are given an array. The task is to reverse the array and print it.
 * (using Integer wrapper class is must to use the Collections.reverse() method)
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(1)
 */

public class ReverseArray4 {

    public static void reverseArray(Integer[] array) {
        Collections.reverse(Arrays.asList(array));
    }

    public static void displayArray(Integer[] array) {
        for (int element : array) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.println("Original Array - ");
        displayArray(array);

        reverseArray(array);

        System.out.println("Reversed Array - ");
        displayArray(array);
    }
}
