package com.raka.datastructures.array.hurdle_set_easy;

import java.util.Arrays;

/**
 * Print all Distinct ( Unique ) Elements in given Array using Nested loop
 * <p>
 * Approach -
 * - sort the array so that all occurrences of every element becomes consecutive
 * - iterate through each element of the array  ( O(n) time)
 * - at each index, compare current element with next element
 * - if they are equal increment the counter variable i
 * - else they are not equal, hence print the element
 * - do the same with next element
 * <p>
 * Time complexity - O(nlogn)
 * Auxiliary space - O(1)
 */

public class ArrayDistinctElements2 {

    // display the uniques elements of the array to console
    public static void displayDistinctElements(int[] array) {
        int length = array.length;

        Arrays.sort(array);     // array is sorted in O(nlogn) time complexity using dual quick sort algorithm

        // iterate through each element of the array
        for (int i = 0; i < length; i++) {

            // increment counter i till we get current element & next element equal (i start with 0)
            while (i < length - 1 && array[i] == array[i + 1]) {
                i++;
            }
            System.out.print(array[i] + "    ");        // finally print one instance of that same element
        }
    }

    public static void main(String[] args) {
        int[] array = {7, 5, 1, 9, 7, 3, 7, 1, 2, 5, 2, 4, 9, 7, 5, 6, 2, 4, 8};

        displayDistinctElements(array);
    }
}
