package com.raka.ds.array.sorting;

/**
 * Time complexity - O(n^2) - worst/average case,  O(n) - best case
 */

public class InsertionSort {

    // sort an array using insertion sort
    public static void insertionSort(int[] array) {
        int length = array.length;

        // outside loop iterate through each element of the array
        for (int i = 1; i < length; i++) {    // started with index 1 as one element(at index 0) is always sorted
            int key = array[i];             // stores the current element
            int j = i - 1;

            // shifts elements of index 0 - (i-1) that are greater than current element to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;           // stores the key at its correct position
        }
    }

    // display array to the console
    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "    ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {72, 49, 19, 30, 92, 49, 59, 82, 59, 32, 67, 90, 78, 81, 11, 45};

        System.out.println("Original Array - ");
        displayArray(array);

        insertionSort(array);

        System.out.println("Sorted Array - ");
        displayArray(array);
    }
}
