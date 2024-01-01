package com.raka.ds.striver.array;

import java.util.Arrays;

/**
 * Given an array, we have to find the largest element in the array
 * <p>
 * Approach - Optimal
 * - initialize a max variable with first element of array
 * - iterate through each element in the array
 * - if current index's element is greater than max value, store it in max value
 * - finally, return the max value
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(1)
 */

public class ArrayLargestElement2 {

    // return the largest element present in the array
    public static int findLargest(int[] array) {
        int max = array[0];     // variable to store the max element till current iteration

        for (int i = 1; i < array.length; i++){
            // if element at current index is greater than max value
            if (array[i] > max){
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] array = {82, 49, 18, 33, 82, 48, 67, 73, 82, 11, 92, 49};

        System.out.println("Array elements - ");
        System.out.println(Arrays.toString(array));

        int element = findLargest(array);
        System.out.println("Largest element in the array - " + element);
    }
}
