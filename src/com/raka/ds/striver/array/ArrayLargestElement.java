package com.raka.ds.striver.array;

import java.util.Arrays;

/**
 * Given an array, we have to find the largest element in the array
 * <p>
 * Approach - Brute Force
 * - sort the array in ascending order
 * - last element in the array will be the largest element
 * <p>
 * Time complexity - O(nlogn)
 * Auxiliary space - O(1)
 */

public class ArrayLargestElement {

    // return the largest element present in the array
    public static int findLargest(int[] array) {
        Arrays.sort(array);         // uses dual pivot quick sort algorithm - O(nlogn)

        return array[array.length - 1];
    }

    public static void main(String[] args) {
        int[] array = {82, 49, 18, 33, 82, 48, 67, 73, 82, 11, 92, 49};

        System.out.println("Array elements - ");
        System.out.println(Arrays.toString(array));

        int element = findLargest(array);
        System.out.println("Largest element in the array - " + element);
    }
}
