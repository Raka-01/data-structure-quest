package com.raka.ds.array.hurdle_set_easy;

/**
 * Find Subarray with given sum
 * Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum
 * <p>
 * Approach - using 2 nested loop
 * - outer loop iterate through the array from start to end
 * - inner loop will start from current index of outer loop i to end of the array, to get all sub arrays
 * - for every index j in inner loop, update currentSum = currentSum + arr[j]
 * - if currentSum equals to given sum, display the subarray range
 * <p>
 * Time complexity - O(n^2)
 * Auxiliary space - O(1)
 */

public class ArraySumSubArray {

    // display the index range where the sub array is found with the given sum
    public static void displaySubarrayWithSum(int[] array, int sum) {
        int length = array.length;

        // iterate through each element of the array
        for (int i = 0; i < length; i++) {
            int currentSum = array[i];

            // if single element at index i equals the given sum
            if (currentSum == sum) {
                System.out.println("Subarray found at index " + i + " with given sum");
                return;
            } else {
                // iterate through each element from index i to end of array, finding the range of sub array
                for (int j = i+1; j < length; j++) {
                    currentSum = currentSum + array[j];

                    // if the sub array with given sum is found, display it to console
                    if (currentSum == sum) {
                        System.out.println("Subarray found from index " + i + " to " + j + " with given sum");
                        return;
                    }
                }
            }
        }
        System.out.println("No Subarray found with required sum");
    }

    public static void main(String[] args) {
        int[] array = {7, 2, 8, 4, 9, 7, 3, 4, 3, 1, 8, 9, 7, 6, 8};
        int sum = 18;

//        int[] array = {10, 2, -2, -20, 10};           // can handle negatives also
//        int sum = -10;

        displaySubarrayWithSum(array, sum);
    }
}
