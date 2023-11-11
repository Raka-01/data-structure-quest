package com.raka.datastructures.array.hurdle_set_easy;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Find the element that appears once in an array where other elements appear twice
 * <p>
 * Approach - Using Hashing
 * - initialize 2 sum variables, one stores sum of all array elements, and other stores sum of unique array elements
 * - initialize a set that stores the array elements
 * - iterate through the array
 * - check if the current element is already present in the set
 * - if not add the element to sum(sum of unique array elements) and add that element to the set
 * - outside if, add the element to sum  variable (sum of all array elements)
 * - subtract the sum of array elements with duplicates from twice the product of the sum of array elements without duplicates
 * - this will give the desired element that occurred only once in the array
 * <p>
 * This method assumes that the array has only 1 element with single occurrence and others with double occurrence
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(n)
 */

public class ArraySingleOccurrenceElement4 {

    /*
    this method returns the elements that occurred only once in the array
    NOTE: this method assumes that array has only one element with single occurrence and rest with double occurrence
     */
    public static int singleOccurrenceElement(int[] array) {
        Set<Integer> set = new LinkedHashSet<>();
        int sum = 0, sumWithoutDuplicates = 0;

        // iterate through each element of the array
        for (int element : array) {
            // if set has not yet the current element, it means it occurred 1st time till current iteration(unique element)
            if (!set.contains(element)) {
                sumWithoutDuplicates = sumWithoutDuplicates + element;
                set.add(element);           // unique element is added to the set
            }
            sum = sum + element;
        }

        return ((2 * sumWithoutDuplicates) - sum);
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 2, 6, 5, 4, 7, 1, 7, 6, 8, 1, 3, 5, 4};

        int singleElement = singleOccurrenceElement(array);

        if (singleElement != 0) {
            System.out.println("Element with single occurrence in the array = " + singleElement);
        } else {
            System.out.println("No element with single occurrence is present in the array");
        }
    }
}
