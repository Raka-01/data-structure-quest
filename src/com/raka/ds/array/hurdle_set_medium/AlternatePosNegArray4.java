package com.raka.ds.array.hurdle_set_medium;

import java.util.Arrays;

/**
 * An array contains both positive and negative numbers in random order.
 * Rearrange the array elements so that positive and negative numbers are placed alternatively.
 * A number of positive and negative numbers need not be equal.
 * If there are more positive numbers they appear at the end of the array.
 * If there are more negative numbers, they too appear at the end of the array.
 * <p>
 * Approach -
 * - count the number of positive and negative integers
 * - sort the array
 * - if negatives < positives, then swap one negative with one positive starting from index 0
 * - else reverse the array, then swap one positive with one negative starting from index 1
 * <p>
 * This approach do not maintain the relative order of elements in the array as we are sorting the array
 * <p>
 * Time complexity - O(nlogn), due to sorting step
 * Auxiliary space - O(1)
 */

public class AlternatePosNegArray4 {

    // arrange positive and negative elements in alternate order in the array
    public static void rearrange(int[] array) {
        int neg = 0;
        int pos = 0;

        for (int element : array) {
            if (element < 0) {
                neg++;
            } else {
                pos++;
            }
        }

        System.out.println("pos " + pos + ", neg " + neg);
        Arrays.sort(array);
        if (neg <= pos) {
            alternateNegatives(array, neg);
        } else {
            reverse(array);
            alternatePositives(array, pos);
        }
    }

    public static void reverse(int[] array) {
        int low = 0;
        int high = array.length - 1;

        while (low < high) {
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }
    }

    public static void alternateNegatives(int[] array, int neg) {
        for (int i = 0; i <= neg; i += 2) {
            int temp = array[i];
            array[i] = array[neg + i];
            array[neg + i] = temp;
        }
    }

    public static void alternatePositives(int[] array, int pos) {
        for (int i = 1; i <= pos; i += 2) {
            int temp = array[i];
            array[i] = array[pos + i - 1];
            array[pos + i - 1] = temp;
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
//        int[] array = {-9, -8, -7, -6, -5, -4, -3, 1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("Original Array - ");
        displayArray(array);

        rearrange(array);

        System.out.println("Rearranged Array - ");
        displayArray(array);
    }
}
