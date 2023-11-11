package com.raka.datastructures.array.hurdle_set_easy;

/**
 * Find the element that appears once in an array where other elements appear multiple times
 * <p>
 * Approach - XOR operation of elements
 *  - XOR of a number with itself is 0
 *  - XOR of a number with 0 is number itself
 *  - XOR of two different numbers is result of XOR of the binary representation of those 2 numbers
 *<p>
 * XOR operation is commutative and associative, so order of elements does not affect the result
 * This method assumes that the array has only 1 element with single occurrence and others with double occurrence
 *<p>
 *  Time complexity - O(n)
 *  Auxiliary space - O(1)
 */

public class ArraySingleOccurrenceElement2 {

    /*
    this method returns the elements that occurred only once in the array
    NOTE: this method assumes that array has only one element with single occurrence and rest with double occurrence
     */
    public static int singleOccurrenceElement(int[] array){
        int result = array[0];

        // iterate through each element of the array
        for (int i = 1; i < array.length; i++){
            result = result ^ array[i];             // XOR operation
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 6, 2, 4, 5, 3, 7, 4, 2, 5, 1, 3, 9, 6, 9};

        int singleElement = singleOccurrenceElement(array);

        if (singleElement != 0){
            System.out.println("Element in the array that occurred only once = " + singleElement);
        }
        else {
            System.out.println("There no element in the array that occurred only once in the array");
        }
    }
}
