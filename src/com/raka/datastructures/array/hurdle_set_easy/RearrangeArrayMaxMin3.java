package com.raka.datastructures.array.hurdle_set_easy;

import java.util.Arrays;

/**   (I DON'T KNOW HOW TO REACH TO THIS MATHEMATICAL EXPRESSION)
 * Rearrange an array in maximum minimum form
 * (rearrange the array alternately so that first element should be a maximum value,
 * at second position minimum value, at third position second max,
 * at fourth position second min, and so on)
 *<p>
 * Approach -
 * even index : remaining maximum element.
 * odd index  : remaining minimum element.
 * max_index : Index of remaining maximum element (Moves from right to left)
 * min_index : Index of remaining minimum element (Moves from left to right)
 * Initialize: max_index = 'n-1'
 *             min_index = 0
 *             max_element = arr[max_index] + 1 //can be any element which is more than the maximum value in array
 * For i = 0 to n-1
 *  If 'i' is even
 *      arr[i] += arr[max_index] % max_element * max_element
 *      max_index--
 *  ELSE // if 'i' is odd
 *      arr[i] +=  arr[min_index] % max_element * max_element
 *      min_index++
 *<p>
 * Time Complexity: O(n)
 * Auxiliary Space: O(1)
 */

public class RearrangeArrayMaxMin3 {

    public static void rearrangeMaxMin(int[] arr, int n) {
        // initialize index of first minimum and first maximum element
        int max_idx = n - 1, min_idx = 0;

        // store maximum element of array
        int max_elem = arr[n - 1] + 1;

        // traverse array elements
        for (int i = 0; i < n; i++) {
            // at even index : we have to put maximum element
            if (i % 2 == 0) {
                arr[i] += (arr[max_idx] % max_elem) * max_elem;
                max_idx--;
            }

            // at odd index : we have to put minimum element
            else {
                arr[i] += (arr[min_idx] % max_elem) * max_elem;
                min_idx++;
            }
        }

        // array elements back to its original form
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] / max_elem;
    }

    // display the elements of the array to the console
    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {82, 49, 18, 48, 78, 37, 10, 30, 78, 57, 73, 58, 78, 47, 28};

        System.out.println("Original Array - ");
        displayArray(array);

        Arrays.sort(array);
        rearrangeMaxMin(array, array.length);

        System.out.println("Updated array after rearranging elements in maximum minimum form - ");
        displayArray(array);
    }
}
