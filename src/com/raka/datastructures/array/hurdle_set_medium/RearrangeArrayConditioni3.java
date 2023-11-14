package com.raka.datastructures.array.hurdle_set_medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Rearrange an array such that arr[i] = i
 * Given an array of elements of length N, ranging from 0 to N – 1.
 * All elements may not be present in the array.
 * If the element is not present then there will be -1 present in the array.
 * Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.
 * <p>
 * Approach - using hashset
 * - initialize an empty hashset
 * - add all the elements of array to the set, to which set stores only unique elements
 * - iterate through each index of the array
 * - if element i is present in the set, then set arr[i] = element i
 * - else put arr[i] = -1
 * - return the array
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(m), where m is unique elements in the array
 */

public class RearrangeArrayConditioni3 {

    // rearrange elements of array such that arr[i] = i
    public static void rearrangeElementsi(int[] array) {
        int length = array.length;

        Set<Integer> set = new HashSet<>();
        for (int element : array) {
            set.add(element);
        }

        for (int i = 0; i < length; i++) {
            if (set.contains(i)) {
                array[i] = i;
            } else {
                array[i] = -1;
            }
        }
    }

    // display the elements of the array to the console
    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "    ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};

        System.out.println("Original array - ");
        displayArray(array);

        rearrangeElementsi(array);

        System.out.println("Array after putting element i at index i - ");
        displayArray(array);
    }
}
