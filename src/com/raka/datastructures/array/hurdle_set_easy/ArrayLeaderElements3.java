package com.raka.datastructures.array.hurdle_set_easy;

import java.util.Stack;

/**
 * Leaders in an array
 * An element is a leader if it is greater than all the elements to its right side
 * <p>
 * Approach -
 * - start from last index element
 * - initialize a max element variable with Integer.MIN_VALUE
 * - iterate through the array till we reach index 0
 * - in each iteration, keep a check on maximum value
 * - if we encounter a maximum value than previous maximum value, it is a leader
 * - store it in the stack
 * - finally, pop out element one by one
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(n)
 */

public class ArrayLeaderElements3 {

    // display all the leader elements from the array to the console
    public static void displayLeaderElements(int[] array){
        int length = array.length;
        int maxElement = Integer.MIN_VALUE;         // max element set to minimum value
        Stack<Integer> stack = new Stack<>();

        // iterating through each element of the array from right to left finding the maximum element till current iteration
        for (int i = length-1; i >= 0; i--){
            // if current element is the max element till current iteration, it is a leader element
            if (array[i] > maxElement){
                maxElement = array[i];          // max element is updated when a new one is found
                stack.push(array[i]);           // leader element is pushed into the stack
            }
        }

        System.out.println("Leader elements present in the array - ");
        // all the leader elements are displayed to console in order they are in the array
        while (!stack.empty()){
            System.out.print(stack.pop() + "    ");
        }
    }

    public static void main(String[] args) {
        int[] array = {82, 49, 17, 72, 49, 18, 49, 27, 68, 11, 29, 22, 27};

        displayLeaderElements(array);
    }
}
