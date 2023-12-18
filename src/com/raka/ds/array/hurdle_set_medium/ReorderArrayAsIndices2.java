package com.raka.ds.array.hurdle_set_medium;

/**
 * Reorder an array according to given indexes
 * Given two integer arrays of the same size, “arr[]” and “index[]”,
 * reorder elements in “arr[]” according to the given index array.
 * <p>
 * Approach - Using a temp[] array
 *  - create a temp array of length same as arr[]
 *  - iterate through each element of the arr[]
 *  - copy the elements into temp[] array according to indices stored in index[] array
 *  - copy back the temp[] array elements into the original array arr[]
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(n), temp[] array created
 */

public class ReorderArrayAsIndices2 {

    // rearrange the array elements according to their indices defined in index array
    public static void reorder(int[] array, int[] index) {
        int length = array.length;

        // temp array that holds elements from arr[] in their correct places
        int[] temp = new int[length];

        // copy the elements from arr[] into temp[] array according to the indices stored in index[]
        for (int i = 0; i < length; i++){
            temp[index[i]] = array[i];
        }

        // copy back the temp[] array elements into original array arr[]
        System.arraycopy(temp, 0, array, 0, length);
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
