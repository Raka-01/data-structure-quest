package com.raka.datastructures.array.hurdle_set_easy;

/**
 * Move all zeroes to end of array
 *
 * Time complexity = O(n)
 * Auxiliary space = O(1)
 */
public class PushZerosToEnd {

    public static void pushZerosToEnd(int[] array){
        int length = array.length;
        int count = 0;

        // iterating through each element of the array
        for (int i = 0; i < length; i++){
            // for every non-zero elements in the array copy that element at index count of the array and count is incremented
            if(array[i] != 0){
                array[count] = array[i];
                count++;
            }
        }

        /*
        since all non-zero elements are copied to front of array till index count-1,
        so now elements from index count to length-1 will be 0
         */
        while (count < length){
            array[count] = 0;
            count++;
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
        int[] array = {1, 0, 8, 7, 0, 7, 0, 0, 8, 4, 4, 3, 0, 2, 0, 0, 2, 5, 6, 7, 0, 8};

        System.out.println("Original Array - ");
        displayArray(array);

        pushZerosToEnd(array);

        System.out.println("Updated array after pushing all zeros to end - ");
        displayArray(array);
    }
}
