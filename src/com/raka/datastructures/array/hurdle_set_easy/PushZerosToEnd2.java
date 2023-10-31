package com.raka.datastructures.array.hurdle_set_easy;

/**
 * Move all zeroes to end of array
 *Approach - use 0 as pivot element and whenever we see a non-zero element
 * we will swap it with the pivot element.
 * So all the non-zero element will come at the beginning
 *
 * Time complexity = O(n)
 * Auxiliary space = O(1)
 */
public class PushZerosToEnd2 {

    // pushes all zeros in the array to the end of the array
    public static void pushZerosToEnd(int[] array){
        int length = array.length;

        int j = 0;
        for(int i = 0; i < length; i++){
            // first non-zero element will be swapped first, so order will not be lost
            if(array[i] != 0){
                // swap arr[i] and arr[j] & increment j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }
        }
    }

    // display elements of the array to the console
    public static void displayArray(int[] array){
        for (int element : array){
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {9, 2, 3, 0, 0, 1, 0, 0, 3, 0, 1, 0, 3, 5, 6, 0, 0, 0, 4, 4, 2, 1};

        System.out.println("Original Array - ");
        displayArray(array);

        pushZerosToEnd(array);

        System.out.println("Updated array after pushing all zeros to end - ");
        displayArray(array);
    }
}
