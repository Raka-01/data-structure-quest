package com.raka.ds.array.hurdle_set_medium;

/**
 * Reorder an array according to given indexes
 * Given two integer arrays of the same size, “arr[]” and “index[]”,
 * reorder elements in “arr[]” according to the given index array.
 * <p>
 * Approach - Using Cyclic sort
 * - iterate through each element od index array
 * - while index i is not at its correct index i, i.e. index[i] != i
 * - store element and index present at index value present at index[i], i.e. index[index[i]] and arr[index[i]] in temp variables
 * - stores value & index present at index i to index[index[i]] position of resp. array
 * - place temp variables value to index[i] & arr[i]
 * <p>
 * Time complexity - O(n), the number of swaps is bounded by the length of array
 * each element is moved to its correct position at most once and once an element is in its correct position,
 * the while loop condition (index[i] != i) is false
 * Auxiliary space - O(1)
 */

public class ReorderArrayAsIndices3 {

    // rearrange the array elements according to their indices defined in index array
    public static void reorder(int[] array, int[] index) {
        int length = array.length;

        /*
         iterate through each element of the index array
         checking if element i is present at index i or not
         */
        for (int i = 0; i < length; i++) {
            /*
            if element i is not at index i of index array,
            swap current element continuously with element present at index of current element value of index array
            till element at index i is not equal to i
             */
            while (index[i] != i) {
                /*
                temporarily stores current index and current element at index i
                to temp variables, currentIndex & currentElement
                 */
                int currentIndex = index[index[i]];
                int currentElement = array[index[i]];

                /*
                place arr[i] and index[i] to its correct position index i
                 */
                array[index[i]] = array[i];
                index[index[i]] = index[i];

                /*
                copy currentElement and currentIndex to arr[i] and index[i]
                 */
                index[i] = currentIndex;
                array[i] = currentElement;
            }
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
        int[] array = {83, 59, 29, 82, 54, 44, 89, 43, 13, 90};
        int[] index = {4, 1, 8, 9, 2, 7, 3, 5, 6, 0};

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
