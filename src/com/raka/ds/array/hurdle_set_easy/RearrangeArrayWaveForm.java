package com.raka.ds.array.hurdle_set_easy;

import java.util.Arrays;

/**
 * Sort the array in wave form
 * Given an unsorted array of integers, sort the array into a wave array. An array arr[0..n-1] is sorted in wave form if:
 * arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..
 * <p>
 * Approach -
 * - Sort the array.
 * - Traverse the array from index 0 to N-1, and increase the value of the index by 2
 * - While traversing the array swap arr[i] with arr[i+1]
 * <p>
 * Time complexity - O(nlogn)
 * Auxiliary space - O(1)
 */

public class RearrangeArrayWaveForm {

    // rearrange the elements of the array in wave form
    public static void rearrangeWaveForm(int[] array) {
        int length = array.length;

        if (length > 1) {

            Arrays.sort(array);             // dual-pivot quick sort algorithm - O(nlogn)

            // swap the current element with the next adjacent element
            for (int i = 0; i < length - 1; i += 2) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
    }

    // display the elements of array to the console
    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "    ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {72, 49, 18, 39, 89, 23, 78, 47, 58, 72, 59, 89, 78, 72, 48, 57, 37, 57, 82};

        System.out.println("Original Array - ");
        displayArray(array);

        rearrangeWaveForm(array);

        System.out.println("Array after arranging elements in wave form - ");
        displayArray(array);
    }
}
