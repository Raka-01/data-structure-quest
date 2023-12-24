package com.raka.ds.array.hurdle_set_easy;

import java.util.Arrays;

/**
 * Sort an array which contain 1 to n values
 * You have given an array which contain 1 to n element,
 * your task is to sort this array in an efficient way and without replace with 1 to n numbers.
 * <p>
 * Approach - Using cyclic sort
 * - traverse the array
 * - check if current element is in its correct position
 * - else swap the current element to the element at its correct position
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(1)
 */

public class ArraySort1toN {

    // sort the array elements to its current index so that values and indices match
    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            // get the correct index of current element
            int correct = array[i] - 1;

            // checks if the current element is in its correct position i
            if (array[correct] != array[i]) {
                // swap the element if current element and index does not match
                int temp = array[correct];
                array[correct] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {6, 4, 5, 2, 3, 1, 8, 7, 9};

        System.out.println("Original Array - ");
        System.out.println(Arrays.toString(array));

        sort(array);

        System.out.println("Sorted Array - ");
        System.out.println(Arrays.toString(array));
    }
}
