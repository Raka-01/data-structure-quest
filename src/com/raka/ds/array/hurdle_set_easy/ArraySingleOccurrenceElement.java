package com.raka.ds.array.hurdle_set_easy;

/**
 * Find the element that appears once in an array where other elements appear multiple times
 * <p>
 * Approach - Brute Force - check every element if it appears once or not
 * - initialize a nested loop with variable i(outer) and j(inner) both initialized at start index
 * - inside i, initialize a counter variable that count the total number of occurrence of every element
 * - inside inner loop j, check the occurrence of each element and increment counter
 * - after inside loop, inside outer loop checks if occurrence of each element is one or more
 * - if element with occurrence 1 is found, return that element
 * - else return -1;
 * <p>
 * Time complexity - O(n^2)
 * Auxiliary space - O(1)
 */

public class ArraySingleOccurrenceElement {

    // return the element that occurs exactly one time in the array
    public static int singleOccurrenceElement(int[] array) {

        int count;          // counts the occurrence of each element

        for (int elementi : array) {
            count = 0;
            for (int elementj : array) {
                // inside this loop, if this conditions true only once then count == 1 and that value is returned
                if (elementi == elementj) {
                    count++;
                }
            }
            if (count == 1) {
                return elementi;
            }
        }

        return -1;      // if no element with single occurrence is found
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 7, 4, 6, 8, 5, 8, 2, 5, 2, 1, 8, 4, 6, 3, 7};

        int singleElement = singleOccurrenceElement(array);

        if (singleElement != -1) {
            System.out.println("Element that exists single time in array = " + singleElement);
        } else {
            System.out.println("No element with single occurrence is found in the array");
        }
    }
}
