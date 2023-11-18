package com.raka.ds.array.hurdle_set_easy;

/**
 * Print all Distinct ( Unique ) Elements in given Array using Nested loop
 * <p>
 * Approach -
 * - use 2 nested loops
 * - outer loop iterate through each element of the array picking one element at a time
 * - inner loop checks if current element is present in left side of it
 * - if present, ignores the element, else print the element
 * <p>
 * Time complexity - O(n^2)
 * Auxiliary space - O(1)
 */

public class ArrayDistinctElements {

    // display all the distinct elements present in the array
    public static void displayDistinctElements(int[] array) {
        int length = array.length;

        System.out.println("Distinct elements present in the array - ");
        for (int i = 0; i < length; i++) {

            int j;
            for (j = 0; j < i; j++) {        // i will iterate through each element of the array
                /*
                 if element is found before the current index starting from 0 to i-1,
                 break it setting j less than i
                 */
                if (array[i] == array[j]) {
                    break;
                }
            }
            /*
            i will only be equal to j when the same element is not found in the array from 0 till current index
             */
            if (i == j) {
                System.out.print(array[i] + "    ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {7, 8, 2, 5, 3, 4, 1, 4, 2, 7, 4, 7, 4, 8, 3, 3, 2, 8, 5, 6};

        displayDistinctElements(array);
    }
}
