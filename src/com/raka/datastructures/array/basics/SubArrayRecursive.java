package com.raka.datastructures.array.basics;

/**
 * Time complexity - O(2^n)
 * Auxiliary space - O(2^n)
 */
public class SubArrayRecursive {

    // display the sub-arrays of array using recursive approach
    public static void displaySubArrays(int[] array, int start, int end){

        if(end == array.length){                // checks if we have reached the end of array
            return;
        } else if (start > end) {               // starts new sub-array by increment the end and starts from 0 if start index crosses end index
            displaySubArrays(array, 0, end+1);      // like aub-array from 0 to 3 is done then start with 0 to 4
        } else {
            System.out.print("[");
            for (int i = start; i < end; i++){      // display the current sub-array elements
                System.out.print(array[i] + ",  ");
            }
            System.out.println(array[end] + "]");

            displaySubArrays(array, start+1, end);      // when done with sub-array 0 to 3, then start with index 1 to 3
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};

        System.out.println("Sub-arrays : ");
        displaySubArrays(array, 0, 0);          // starting with sub-array from index 0 to 0
    }
}
