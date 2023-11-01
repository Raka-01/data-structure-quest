package com.raka.datastructures.array.hurdle_set_easy;

import java.util.Arrays;

/**
 * Rearrange an array in maximum minimum form using Two Pointer Technique
 * (rearrange the array alternately so that first element should be a maximum value,
 * at second position minimum value, at third position second max,
 * at fourth position second min, and so on)
 *
 * Approach -
 * - use an auxiliary array
 * - maintain two pointers one to the leftmost(smallest) element and the other to the rightmost(largest) element
 * - move both pointers toward each other and alternatively copy elements at these pointers to the auxiliary array
 * - copy the auxiliary array back to the original array
 *
 * Time Complexity: O(n)
 * Auxiliary Space: O(n)
 */

public class RearrangeArrayMaxMin {

    // rearrange an array in maximum minimum form
    public static void rearrangeMaxMin(int[] array){
        Arrays.sort(array);             // uses dual-pivot quicksort algorithm - O(nlogn)

        int length = array.length;
        int[] temp = new int[length];
        int p = 0, q = length-1;        // p & q are the two pointers pointing start and end index of array resp.

        for(int i = 0; i < length; i++){
            if(i%2 == 0){                   // all the even positions (0, 2, 4, ...)
                temp[i] = array[q];         // stores larger elements
                q--;
            }
            else {                          // all the odd positions (1,3,5, ...)
                temp[i] = array[p];         // stores the smaller elements
                p++;
            }
        }

        // copy all the elements back to the original array
        for (int i = 0; i < length; i++){
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
        int[] array = {73, 29, 34, 18, 39, 89, 12, 37, 92, 49, 78, 45, 63, 67, 79, 10, 39, 78, 23, 43};

        System.out.println("Original Array - ");
        displayArray(array);

        rearrangeMaxMin(array);

        System.out.println("Updated array after rearranging elements in maximum minimum form - ");
        displayArray(array);
    }
}
