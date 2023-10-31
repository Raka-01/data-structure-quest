package com.raka.datastructures.array.hurdle_set_easy;

import java.util.Arrays;

/**
 * Rearrange the elements in array such that even positioned are greater than odd positioned elements
 * (Array is 1-based indexed)
 * Given an array A of n elements, sort the array according to the following relations :
 * A[i] >= A[i-1], if i is even,  ∀ 1 <= i < n
 * A[i] <= A[i-1], if i is odd ,  ∀ 1 <= i < n
 * <p>
 * Approach -
 * - Sort the array
 * - assign the largest [n/2] elements(last n/2 elements) to the even positions
 * - assign rest of the elements to the odd positions
 * <p>
 * Time complexity - O(nlogn)
 * Auxiliary space - O(n)
 */

public class RearrangeArrayCondition {

    // rearrange the array according to above given condition
    public static void rearrangeCondition(int[] array) {
        Arrays.sort(array);         // sort the array using dual-pivot quicksort algorithm - O(nlogn)

        int length = array.length;
        int[] temp = new int[length];       // temporary array of same length is created
        int i = 0, j = length - 1;

        for (int k = 0; k < length; k++) {
            if (k % 2 == 0) {          // odd-positioned indices (1-based)
                temp[k] = array[i]; // first(smallest) n/2 elements are assigned
                i++;
            } else {                  // even-positioned indices (1-based)
                temp[k] = array[j]; // last(largest) n/2 elements are assigned
                j--;
            }
        }

        // copy all the elements of temporary array back to original array
        System.arraycopy(temp, 0, array, 0, length);
    }

    // display the elements of the array to the console
    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {73, 54, 27, 48, 71, 12, 47, 71, 49, 78, 23, 87, 14, 78, 71, 29};

        System.out.println("Original Array - ");
        displayArray(array);

        rearrangeCondition(array);

        System.out.println("Updated array after rearranging elements according to above condition - ");
        displayArray(array);
    }
}
