package com.raka.ds.array.hurdle_set_medium;

/**
 * Reorder an array according to given indexes
 * Given two integer arrays of the same size, “arr[]” and “index[]”,
 * reorder elements in “arr[]” according to the given index array.
 * <p>
 * Approach -
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(n), temp[] array created
 */

public class ReorderArrayAsIndices3 {

    //    result = (original + update%z*z)  ..
    private static void reorder(int[] array, int[] index) {
        int z = findMax(array) + 1;
        for (int i = 0; i < array.length; i++) {
            array[index[i]]
                    = array[index[i]] % z + array[i] % z * z;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] / z;
        }
    }

    private static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int element : array) {
            if (max < element)
                max = element;
        }
        return max;
    }

    private static void displayArray(int[] array) {
        for (int element : array){
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {23, 12, 20, 10, 23, 39, 22, 91, 30};
        int[] index = {4, 0, 1, 2, 3, 7, 5, 6, 8};

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
