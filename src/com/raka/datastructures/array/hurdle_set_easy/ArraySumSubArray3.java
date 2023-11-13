package com.raka.datastructures.array.hurdle_set_easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Find Subarray with given sum
 * Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum
 * <p>
 * Approach - using hashmap to store cumulative sum till current index
 * - initialize an empty hashmap and currentSum variable to 0
 * - make an entry in map with current sum = 0 and -1 ( marks the start index)
 * - iterate through each element in the array keeping track of current element at i
 * - add each element at i to currentSum in each iteration
 * - put the cumulative sum till current index and current index to map as key and value resp
 * - at each iteration check if (currentSum - sum) is present as cumulative sum in the map keys
 * - if present then display the subarray from index of that (cumulative sum + 1) to current index
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(n)
 */

public class ArraySumSubArray3 {

    // display the index range where the sub array is found with the given sum
    public static void displaySubarrayWithSum(int[] array, int sum) {
        int length = array.length;
        Map<Integer, Integer> map = new HashMap<>();    // stores (key, value) -> (cumulative sum, index i)
        int currentSum = 0;
        map.put(currentSum, -1);            // initial entryset if sub array found from start index

        // iterate through each element in the array
        for (int i = 0; i < length; i++) {
            // adding each element to currentSum creating new cumulative sum for every index
            currentSum = currentSum + array[i];

            // if map contains the required cumulative sum(currentSUm - sum) then sub array is present
            if (map.containsKey(currentSum - sum)) {
                System.out.println("Sub array found from index " + (map.get(currentSum - sum) + 1) + " to " + i + " with given sum");
                return;
            }

            // put (key, value) cumulative sum(currentSum) and its current index to the map
            map.put(currentSum, i);
        }

        System.out.println("No sub array found with given sum");
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 2, 4, 5, 7, 2, 1, 4, 3, 1, 9, 9, 6, 8, 4, 2, 3};
        int sum = 33;

        displaySubarrayWithSum(array, sum);
    }
}