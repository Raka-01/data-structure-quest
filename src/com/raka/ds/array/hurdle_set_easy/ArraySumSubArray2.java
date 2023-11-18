package com.raka.ds.array.hurdle_set_easy;

/**
 * Find Subarray with given sum
 * Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum
 * <p>
 * Approach - similar to sliding window
 * - create two variables, one to store current sum initialized with 1st element, and other store the start index initialized with 0
 * - iterate through each element of the array from index 1 to end
 * - add elements to the currentSum until the sum is less than given sum
 * - if currentSum is greater than given sum, remove elements from start of the subarray being formed
 * - if currentSum == given sum, display the subarray range to the console
 * <p>
 * Time complexity - O(n)
 * outer loop runs n times, and the inner while loop adjusts the start and currentSum values,
 * but it doesn't result in additional iterations over the array
 * Auxiliary space - O(1)
 */

public class ArraySumSubArray2 {

    // display the index range where the sub array is found with the given sum
    public static void displaySubarrayWIthSum(int[] array, int sum) {
        int currentSum = array[0];      // adds elements from array to define the sub array range
        int start = 0;                  // keep track of start index of sub array
        int length = array.length;

        /*
        starts with i = 1 as element at 0 is already added to currentSum
        i <= length -> so that loop runs for n times
         */
        for (int i = 1; i <= length; i++) {

            /*
            currentSum >given sum, means current subarray is not the required one,
            so new one is formed by removing an element from start of sub array

            i is iterating from 1 to n, but elemnts are present from 0 to n-1, so i-1
            start < i-1, keeps subarray range in check, should not exceed the current index i-1

            keeps on removing 1st element of sub array if currentSum < sum
             */
            while (currentSum > sum && start < i - 1) {
                currentSum = currentSum - array[start];
                start++;
            }

            // sub array is found whose sum equals given sum
            if (currentSum == sum) {
                int p = i - 1;
                System.out.println("Subarray found from index " + start + " to " + p + " with given sum");
                return;
            }

            // keeps on adding element to the sub array in each iteration
            if (i < length) {
                currentSum = currentSum + array[i];
            }
        }
        System.out.println("No sub array found");
    }

    public static void main(String[] args) {
        int[] array = {7, 4, 8, 1, 8, 3, 7, 4, 5, 1, 1, 2, 5, 4, 9, 6};
        int sum = 18;

        displaySubarrayWIthSum(array, sum);
    }
}
