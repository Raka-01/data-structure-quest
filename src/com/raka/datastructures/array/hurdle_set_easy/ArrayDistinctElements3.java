package com.raka.datastructures.array.hurdle_set_easy;

import java.util.Set;
import java.util.TreeSet;

/**
 * Print all Distinct ( Unique ) Elements in given Array using Nested loop
 * <p>
 * Approach -
 * - initialize a sorted set
 * - iterate through each element of the array
 * - add each element to the set, this will store only one instance of every element of array to set
 * - display the set to console
 * <p>
 * Time complexity - O(nlogn), insertion operation of elements into tree
 * Auxiliary space - O(n)
 */

public class ArrayDistinctElements3 {

    // display unique elements of the array to console
    public static void displayDistinctElements(int[] array) {
        /*
        Set will only store one instance of every element even if the same element is added many times
         */
        Set<Integer> set = new TreeSet<>();

        // each element of array is added to the set
        for (int element : array) {
            set.add(element);       // inserting an element into a TreeSet takes O(nlogn) time
        }

        System.out.println("Unique elements present in the array - ");
        // each element of the set is displayed to console
        for (Integer element : set) {
            System.out.print(element + "    ");
        }
    }

    public static void main(String[] args) {
        int[] array = {8, 4, 6, 2, 4, 1, 5, 3, 7, 5, 2, 8, 9, 6, 8, 5, 6, 3, 4, 3, 4};

        displayDistinctElements(array);
    }
}
