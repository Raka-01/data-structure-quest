package com.raka.ds.array.hurdle_set_medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Reorder an array according to given indexes
 * Given two integer arrays of the same size, “arr[]” and “index[]”,
 * reorder elements in “arr[]” according to the given index array.
 * <p>
 * Approach - Using array of pairs and Comparator's compare() function
 * - create an array of pairs of arr[] length
 * - associate elements from arr[] to their respective indices from index[] array
 * - sort the array of pairs based on indices(2nd element) using comparator
 * - copy the rearranged elements back to arr[]
 * <p>
 * Time complexity - O(nlogn), due to Arrays.sort() method
 * Auxiliary space - O(n), pairs[] array used to store pairs of elements and indices
 */

public class ReorderArrayAsIndices {

    // Comparator function to sort pairs based on the second element in pair
    static class PairComparator implements Comparator<int[]> {

        @Override
        public int compare(int[] pair1, int[] pair2) {
            return Integer.compare(pair1[1], pair2[1]);
        }
    }

    // rearrange the array elements according to their indices defined in index array
    public static void reorder(int[] array, int[] index) {
        int length = array.length;
        // 2D array to store pairs(element, index)
        int[][] pairs = new int[length][2];

        // fill the pairs array with elements and their respective index
        for (int i = 0; i < length; i++) {
            pairs[i][0] = array[i];
            pairs[i][1] = index[i];
        }

        // sorting the pairs array based on second element(index)
        Arrays.sort(pairs, new PairComparator());

        // copy the sorted elements back to the original array
        for (int i = 0; i < length; i++) {
            array[i] = pairs[i][0];
        }

    }

    // display the array elements to the console
    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {42, 15, 38, 29, 50, 18, 59, 77};
        int[] index = {5, 2, 7, 4, 6, 0, 1, 3};

        System.out.println("Original Array - ");
        displayArray(array);
        System.out.println("Indices given - ");
        displayArray(index);
        System.out.println();

        reorder(array, index);

        System.out.println("Reordered Array - ");
        displayArray(array);
    }
}
