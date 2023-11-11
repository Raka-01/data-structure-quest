package com.raka.datastructures.array.hurdle_set_easy;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Find the element that appears once in an array where other elements appear twice
 * <p>
 * Approach -
 * - create a sum variable that stores the sum of all the elements
 * - create another sum variable that stores the sum of array elements without duplicates
 * - then subtract the sum of array elements with duplicates from twice the product of the sum of array elements without duplicates
 * - this will give the desired element that occurred only once in the array
 * <p>
 * Example:
 * let arr[] = {7, 3, 5, 4, 5, 3, 4}
 * Required no = 2*(sum_of_array_without_duplicates) - (sum_of_array)
 * = 2*(7 + 3 + 5 + 4) - (7 + 3 + 5 + 4 + 5 + 3 + 4)
 * = 2*     19         -      31
 * = 38 - 31
 * = 7 (required answer)
 * <p>
 * This method assumes that the array has only 1 element with single occurrence and others with double occurrence
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(n)
 */

public class ArraySingleOccurrenceElement3 {

    /*
    this method returns the elements that occurred only once in the array
    NOTE: this method assumes that array has only one element with single occurrence and rest with double occurrence
     */
    public static int singleOccurrenceElement(int[] array) {
        Set<Integer> set = new LinkedHashSet<>();
        int arraySum = 0, setSum = 0;

        // iterate through each element of the array, takes O(n) time
        for (int element : array) {
            arraySum = arraySum + element;
            set.add(element);               // adding element to LinkedHashSet takes O(1) time on average
        }

        // iterate through each unique element of the array, takes O(n) time
        for (int element : set) {
            setSum = setSum + element;
        }

        return ((2 * setSum) - arraySum);
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 5, 6, 1, 2, 8, 3, 6, 1, 5, 8, 7};

        int singleElement = singleOccurrenceElement(array);

        if (singleElement != 0) {
            System.out.println("Element with single occurrence in the array = " + singleElement);
        } else {
            System.out.println("No element with single occurrence is present in the array");
        }
    }
}
