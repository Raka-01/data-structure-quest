package com.raka.ds.array.hurdle_set_easy;

import java.util.Arrays;

/**
 * Find the element that appears once in an array where other elements appear twice
 * <p>
 * Approach -
 * - sort the array
 * - every element except one appear twice
 * - start with index 0
 * - compare current element with next element
 * - current element = next element, increment the counter by 2
 * - else return that element as this has occurred only once
 * <p>
 * Time complexity - O(nlogn)
 * Auxiliary space - O(1)
 */

public class ArraySingleOccurrenceElement7 {

    /*
    this method returns the elements that occurred only once in the array
    NOTE: this method assumes that array has only one element with single occurrence and rest occur twice
     */
    public static int singleOccurrenceElement(int[] array) {
        if (array.length % 2 == 0) {
            return -1;
        } else {
            Arrays.sort(array);

            int i;
            // iterating through each element of the array
            for (i = 0; i < array.length - 1; i++) {
                // if next element = current element, then it has occurs twice, so increment twice to skip the next element also
                if (array[i] == array[i + 1]) {
                    i++;
                } else {
                    return array[i];        // if next element is not equals to current element, then it has occurred once, hence return current element
                }
            }
            /*
            array is of odd length, and till now no value is returned
            means all element has occurred twice till now,
            hence last element must have occurred only once
             */
            return array[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 8, 4, 3, 8, 7, 3, 2, 4, 5, 1, 7};

        int singleElement = singleOccurrenceElement(array);

        if (singleElement != -1) {
            System.out.println("Element that has occurred only once in the array = " + singleElement);
        } else {
            System.out.println("No element is present in the array that has occurred only once in the array");
        }
    }
}
