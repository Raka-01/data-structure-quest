package com.raka.datastructures.array.hurdle_set_easy;

/**
 * Sort the array in wave form
 * Given an unsorted array of integers, sort the array into a wave array. An array arr[0..n-1] is sorted in wave form if:
 * arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..
 * <p>
 * Approach -
 * - Traverse all even positioned elements of the input array
 * - If the current element is smaller than the previous odd element, swap the previous and current
 * - If the current element is smaller than the next odd element, swap next and current
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(1)
 */

public class RearrangeArrayWaveForm2 {

    // swap the elements at given indices
    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    // rearrange the elements of the array in wave form
    public static void rearrangeWaveForm(int[] array) {
        int length = array.length;

        if (length > 1) {

            // checking the even positioned elements if they are smaller than its adjacent elements (0-based indexing)
            for (int i = 0; i < length - 1; i += 2) {
                // if current even positioned element is smaller than its previous adjacent element
                if (i > 0 && array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                }
                // if current even positioned element is smaller than its next adjacent element
                if (i < length - 1 && array[i] < array[i + 1]) {
                    swap(array, i, i + 1);
                }
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
        int[] array = {83, 59, 28, 45, 58, 78, 28, 58, 38, 58, 22, 49, 98, 59, 55};

        System.out.println("Original Array - ");
        displayArray(array);

        rearrangeWaveForm(array);

        System.out.println("Array after arranging elements in wave form - ");
        displayArray(array);
    }
}
