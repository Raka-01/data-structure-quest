package com.raka.ds.striver.array;

import java.util.Arrays;

/**
 * Given an array, find the second smallest and second-largest element in the array.
 * Print ‘-1’ in the event that either of them doesn’t exist.
 * <p>
 * Approach - Brute force
 * - sort the array
 * - initialize 2 variables, large and small with -1
 * - iterate through array from first to last
 * - store the current element in small if it is not equal to first element in the array, break
 * - iterate through array from last to first
 * - store the current element in large if it is not equal to last element in the array, break
 * - print both the variables, large and small
 * <p>
 * Time Complexity - O(n)
 * Auxiliary space - O(1)
 */

public class Array2ndLargestSmallestElement {

    public static void findElements(int[] array) {
        int length = array.length;

        if (length > 1) {
            Arrays.sort(array);
            int secondLargest = -1, secondSmallest = -1;

            for (int i = 1; i < length; i++) {
                if (array[i] != array[0]) {
                    secondSmallest = array[i];
                    break;
                }
            }

            for (int i = length - 2; i >= 0; i--) {
                if (array[i] != array[length - 1]) {
                    secondLargest = array[i];
                }
            }

            System.out.println("2nd largest element - " + secondLargest);
            System.out.println("2nd smallest element - " + secondSmallest);
        } else {
            System.out.println(-1 + "  " + -1);
        }

    }

    public static void main(String[] args) {
        int[] array = {82, 59, 18, 39, 59, 17, 45, 33, 61, 48, 78};

        System.out.println("Array elements - ");
        System.out.println(Arrays.toString(array));

        findElements(array);
    }
}
