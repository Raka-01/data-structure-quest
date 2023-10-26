package com.raka.datastructures.array.hurdle_set_easy;

import java.util.Arrays;

/**
 * Time Complexity - O(nlogn)       Time required to sort the array is O(nlogn)
 * Auxiliary Space - O(1)           No extra space needed
 */

public class Array2ndLargest {

    public static void display2ndLargestElement(int[] array){
        int length = array.length;

        if(length < 2){         // if array size is less than 2 then the array cannot have 2nd largest element
            System.out.println("Array does not contain atleast 2 elements");
            return;
        }

        Arrays.sort(array);             // uses dual-pivot quicksort algorithm, time complexity - O(nlogn)

        for (int i = length-2; i >= 0; i--){            // starts from 2nd last element towards first index of array

            if(array[i] != array[length-1]){    // if current element is not equal to last largest, then it will be 2nd largest
                System.out.println("Second largest element in the array - " + array[i]);
                return;
            }
        }

        System.out.println("There is no second largest element present in the array");  // means all the elements in array are same
    }

    public static void main(String[] args) {
        int[] array = {23, 57, 83, 49, 95, 67, 58, 83, 13, 54, 49, 87, 39, 95, 27, 59, 29, 95, 19, 59, 13, 82};
//        int[] array = {34, 34, 34};           // displays  no 2nd largest element in the array
//        int[] array = {34};                 // displays array does not contain atleast 2 elements
        display2ndLargestElement(array);
    }
}
