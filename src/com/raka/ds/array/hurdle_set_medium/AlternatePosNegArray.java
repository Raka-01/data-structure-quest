package com.raka.ds.array.hurdle_set_medium;

/**
 * An array contains both positive and negative numbers in random order.
 * Rearrange the array elements so that positive and negative numbers are placed alternatively.
 * A number of positive and negative numbers need not be equal.
 * If there are more positive numbers they appear at the end of the array.
 * If there are more negative numbers, they too appear at the end of the array.
 * <p>
 * Approach - Using QuickSort Partition method
 * - first separate positive and negative numbers using the partition process of QuickSort
 * - In partition, consider 0 as the pivot element so all negative numbers are placed before positive numbers
 * - start from the first negative number and first positive number
 * - swap every alternate negative number with the next positive number
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(1)
 */

public class AlternatePosNegArray {

    // arrange positive and negative elements in alternate order in the array
    public static void rearrange(int[] array) {
        int length = array.length;
        int low = -1;           // index for negative element to place
        int temp;

        // separates out negatives from positive elements and place them at front
        for (int i = 0; i < length; i++) {
            // finds a negative element and swap with positive element present at from front of array
            if (array[i] < 0) {      // 0 is pivot element
                low++;
                temp = array[low];
                array[low] = array[i];
                array[i] = temp;
            }
        }

        // sets index at 1st positive element and 1st negative element
        int pos = low + 1;
        int neg = 0;

        // rearrange array in +ve, -ve, +ve, -ve order
        while (pos < length && neg < pos && array[neg] < 0) {
            temp = array[neg];
            array[neg] = array[pos];
            array[pos] = temp;
            pos++;
            neg = neg + 2;
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
        int[] array = {-3, 5, 6, 8, -2, -9, 6, 3, 8, -1, -7, -6, 4, -6, -3};

        System.out.println("Original Array - ");
        displayArray(array);

        rearrange(array);

        System.out.println("Rearranged Array - ");
        displayArray(array);
    }
}
