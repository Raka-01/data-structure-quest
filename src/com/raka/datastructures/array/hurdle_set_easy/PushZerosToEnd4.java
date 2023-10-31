package com.raka.datastructures.array.hurdle_set_easy;

/**
 * Move all zeroes to end of array without affecting the order of non-zero elements
 * <p>
 * Approach -
 * take an array of the same size as the original array and run a for loop on the original array.
 * In that for loop, if the element does not equal 0, then place that element in the new array
 * (have a count of elements in the temporary array using a variable j)
 * Then add 0 in that new array from index j till length of new array.
 * Then copy elements of this new array into our original array
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(n) for new temp array
 */

public class PushZerosToEnd4 {

    // move all zeros of the array to the end of the array
    public static void pushZerosToEnd(int[] array) {
        int length = array.length;

        int[] temp = new int[length];       // a temporary array of same length is created
        int j = 0;
        // first, copy all non-zero elements to the temporary array
        for (int i = 0; i < length; i++) {
            if (array[i] != 0) {
                temp[j] = array[i];
                j++;
            }
        }

        // fill all rest space in the array with zeros, as that will be the count of zeros in the original array
        while (j < length) {
            array[j] = 0;
            j++;
        }

        // copy back all elements from temporary array to original array
        for (int i = 0; i < length; i++) {
            array[i] = temp[i];
        }
    }

    // display the elements of the array to the console
    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {9, 0, 3, 9, 4, 9, 2, 1, 0, 0, 4, 0, 0, 4, 4, 8, 0, 2, 4, 3, 0, 4, 0, 7, 0};

        System.out.println("Original Array - ");
        displayArray(array);

        pushZerosToEnd(array);

        System.out.println("Updated array after pushing all zeros to end - ");
        displayArray(array);
    }
}
