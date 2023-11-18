package com.raka.ds.array.hurdle_set_medium;

/**
 * Rearrange an array such that arr[i] = i
 * Given an array of elements of length N, ranging from 0 to N – 1.
 * All elements may not be present in the array.
 * If the element is not present then there will be -1 present in the array.
 * Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.
 * <p>
 * Approach - using nested loops
 * - iterate through each element of the array in outer loop
 * - for each index, find if there is element i for index i through inner loop j
 * - if i==arr[j], swap elements at index i and j
 * - if there is any index i for which -1 is used instead of element i, -1 will automatically be placed at that position
 * <p>
 * Time complexity - O(n^2)
 * Auxiliary space - O(1)
 */

public class RearrangeArrayConditioni {

    // rearrange the array elements such that arr[i] = i
    public static void rearrangeElementsi(int[] array) {
        int length = array.length;

        // iterate through each element in the array
        for (int i = 0; i < length; i++) {
            // checks if element i is present in the array with this loop
            for (int j = 0; j < length; j++) {
                // if element i is found for index i, swap elements at i and j
                if (array[j] == i) {
                    int temp = array[i];
                    array[i] = i;
                    array[j] = temp;
                    break;
                }
            }
        }
    }

    // display the elements of the array to the console
    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "    ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {19, 7, 0, 3, -1, -1, 12, -1, 1, -1, 11, 10, 9, -1, 13, 16, -1, 14, 17, 4};

        System.out.println("Original array - ");
        displayArray(array);

        rearrangeElementsi(array);

        System.out.println("Array after putting element i at index i - ");
        displayArray(array);
    }
}
