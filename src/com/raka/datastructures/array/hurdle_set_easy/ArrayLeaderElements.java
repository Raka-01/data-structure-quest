package com.raka.datastructures.array.hurdle_set_easy;

/**
 * Leaders in an array
 * An element is a leader if it is greater than all the elements to its right side
 * <p>
 * Approach - Use 2 nested loops
 * - outer loop iterate through 0 to length-1 and pick each element one by one
 * - inner loop compares the picked element to all the elements on its right side
 * - if picked element is greater than all the elements to its right side
 * - it is a leader
 * <p>
 * Time complexity - O(n^2)
 * Auxiliary space - O(1)
 */

public class ArrayLeaderElements {

    // display all the leader elements from the array to console
    public static void displayLeaderElements(int[] array) {
        int length = array.length;

        System.out.println("All the leaders in the array - ");
        // iterate through each element of the array comparing each element to all elements on right side
        for (int i = 0; i < length; i++) {           // i holds the current element index
            int j;
            for (j = i + 1; j < length; j++) {         // j iterate through all the right side elements
                if (array[j] > array[i]) {
                    break;
                }
            }
            // if j pass through each element to the end without being broken, element at i is a leader
            if (j == length) {
                System.out.print(array[i] + "    ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {73, 69, 28, 18, 74, 38, 47, 74, 66, 28, 59, 15, 49};

        displayLeaderElements(array);

    }
}
