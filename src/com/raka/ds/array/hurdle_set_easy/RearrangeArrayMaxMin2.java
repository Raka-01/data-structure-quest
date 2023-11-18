package com.raka.ds.array.hurdle_set_easy;

/**
 * Rearrange an array in maximum minimum form
 * (rearrange the array alternately so that first element should be a maximum value,
 * at second position minimum value, at third position second max,
 * at fourth position second min, and so on)
 * <p>
 * Approach -
 * - iterate through each index of array
 * - at index i,
 * - if i is even, find the largest element in the array (i to length) and swap that element with element at i
 * - if i is odd, find the smallest element in the array (i to length) and swap that element with element at i
 * <p>
 * Time complexity - O(n^2)
 * Auxiliary space - O(1)
 */

public class RearrangeArrayMaxMin2 {

    // rearrange elements of array in maximum minimum form
    public static void rearrangeMaxMin(int[] array) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {       // even positioned index
                int index = i;
                for (int j = i + 1; j < length; j++) {
                    if (array[index] < array[j]) {
                        index = j;
                    }
                }
                if (index != i) {
                    int temp = array[i];
                    array[i] = array[index];
                    array[index] = temp;
                }
            } else {              // odd positioned index
                int index = i;
                for (int j = i + 1; j < length; j++) {
                    if (array[index] > array[j]) {
                        index = j;
                    }
                }
                if (index != i) {
                    int temp = array[i];
                    array[i] = array[index];
                    array[index] = temp;
                }
            }
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
        int[] array = {72, 48, 27, 49, 91, 37, 23, 83, 49, 89, 92, 49, 67, 73, 27, 82, 91};

        System.out.println("Original Array - ");
        displayArray(array);

        rearrangeMaxMin(array);

        System.out.println("Updated array after rearranging elements in maximum minimum form - ");
        displayArray(array);
    }
}
