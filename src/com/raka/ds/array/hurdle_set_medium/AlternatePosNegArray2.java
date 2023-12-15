package com.raka.ds.array.hurdle_set_medium;

/**
 * An array contains both positive and negative numbers in random order.
 * Rearrange the array elements so that positive and negative numbers are placed alternatively.
 * A number of positive and negative numbers need not be equal.
 * If there are more positive numbers they appear at the end of the array.
 * If there are more negative numbers, they too appear at the end of the array.
 * <p>
 * Approach - Using temporary arrays
 * - count either of positive or negative elements in array
 * - create 2 temp array, one to hold positive elements, and other to hold negative elements
 * - copy positive and negative elements to respective temp array
 * - iterate through original array
 * - copy the positive and negative elements from temp arrays back to original array alternatively
 * <p>
 * This approach maintains the relative order of the elements in the array while rearranging
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(1)
 */

public class AlternatePosNegArray2 {

    // arrange positive and negative elements in alternate order in the array
    public static void rearrange(int[] array) {
        int length = array.length;

        int count = 0;
        // count the negative elements in array
        for (int element : array) {
            if (element < 0) {
                count++;
            }
        }

        int[] neg = new int[count];     // array to store negative elements
        int[] pos = new int[length - count];      // array to store positive elements

        int j = 0, k = 0;           // j -> -ve index, k -> +ve index
        // copy negative and positive elements to respective temporary arrays
        for (int element : array) {
            if (element < 0) {
                neg[j] = element;
                j++;
            } else {
                pos[k] = element;
                k++;
            }
        }

        j = 0;
        k = 0;
        int i = 0;
        // rearranging elements in array in alternate positive negative order
        while (j < neg.length && k < pos.length) {
            array[i++] = pos[k++];
            array[i++] = neg[j++];
        }

        // copy the rest of elements from temporary array to original array
        while (k < pos.length) {
            array[i++] = pos[k++];
        }
        while (j < neg.length) {
            array[i++] = neg[j++];
        }
    }

    // display the array to the console
    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {-3, 5, 6, 8, -2, -9, 6, 3, 8, -1, -7, -6, 4, -6, -3, -5, -6, 7};

        System.out.println("Original Array - ");
        displayArray(array);

        rearrange(array);

        System.out.println("Rearranged Array - ");
        displayArray(array);
    }
}
