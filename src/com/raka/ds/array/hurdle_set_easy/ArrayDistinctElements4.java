package com.raka.ds.array.hurdle_set_easy;

import java.util.HashSet;

/**
 * Print all Distinct ( Unique ) Elements in given Array using Nested loop
 * <p>
 * Approach -
 * - use Hashing to solve this in O(n) time on average
 * - idea is to traverse the array from left to right and keeps track of visited elements in a hashtable
 * <p>
 * Time complexity - O(n), for-each loop iterates through each element in O(n) time
 * Auxiliary space - O(1)
 */

public class ArrayDistinctElements4 {

    // display all the unique elements of array to console
    public static void displayDistinctElements(int[] array) {
        // initialize an empty hashset
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Unique elements present in the array - ");
        // iterate through each element of the array
        for (int element : array) {                  // for-each loop takes O(n) time
            // check if the hashset already contains the element
            if (!set.contains(element)) {            // containment check in hashset takes O(1) time
                /*
                if not present in the hashtable, add it and print it to console
                adding the element to hashtable ensures that next time the same element will be avoided
                 */
                set.add(element);
                System.out.print(element + "   ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {8, 2, 6, 4, 9, 8, 6, 4, 8, 5, 3, 4, 1, 2, 6, 7, 4, 6, 3};

        displayDistinctElements(array);
    }
}
