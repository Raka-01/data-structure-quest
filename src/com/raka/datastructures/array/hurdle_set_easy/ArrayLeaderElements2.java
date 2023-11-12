package com.raka.datastructures.array.hurdle_set_easy;

/**
 * Leaders in an array
 * An element is a leader if it is greater than all the elements to its right side
 * <p>
 * Approach -
 * - start from last index element
 * - initialize a max element variable with Integer.MAX_VALUE
 * - iterate through the array till we reach index 0
 * - in each iteration, keep a check on maximum value
 * - if we encounter a maximum value than previous maximum value, it is a leader
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(1)
 */

public class ArrayLeaderElements2 {

    // display all the leader elements from the array to console
    public static void displayLeaderElements(int[] array) {
        int length = array.length;
        int maxElement = Integer.MIN_VALUE;     // max element set to minimum value

        System.out.println("Leader elements present in the array - ");
        // iterating through each element of the array from right to left finding the maximum element till current iteration
        for (int i = length - 1; i >= 0; i--) {
            // if current element is the max element till current iteration, it is a leader element
            if (array[i] > maxElement) {
                maxElement = array[i];          // max element is updated when a new one is found
                System.out.print(array[i] + "   ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {72, 48, 85, 27, 48, 26, 75, 66, 22, 59, 67, 11, 23};

        displayLeaderElements(array);
    }
}
