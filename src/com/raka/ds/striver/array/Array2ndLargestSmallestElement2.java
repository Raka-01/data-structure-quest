package com.raka.ds.striver.array;

import java.util.Arrays;

/**
 * Given an array, find the second smallest and second-largest element in the array.
 * Print ‘-1’ in the event that either of them doesn’t exist.
 * <p>
 * Approach - Better approach
 * - iterate through each element in the array
 * - find the smallest and the largest element
 * - again iterate through each element in the array
 * - search 2nd largest and 2nd smallest with the help of largest and smallest element
 * <p>
 * Time Complexity - O(n), iterate through each element in the array
 * Auxiliary space - O(1)
 */

public class Array2ndLargestSmallestElement2 {

    public static void findElements(int[] array) {
        int length = array.length;

        // array cannot have 2nd largest or 2nd smallest if array size is 0 or 1
        if (length > 1) {
            int large = Integer.MIN_VALUE;      // holds the largest element
            int secondLarge = Integer.MIN_VALUE;    // holds the 2nd largest element
            int small = Integer.MAX_VALUE;      // holds the smallest element
            int secondSmall = Integer.MAX_VALUE;    // holds the 2nd smallest element

            // iterate through each element and finds the smallest and largest element
            for (int element : array){
                small = Math.min(small, element);
                large = Math.max(large, element);
            }

            // iterate through each element and finds 2nd smallest and 2nd largest element
            for (int element : array){
                // element will be 2nd smallest if it is smaller than current 2nd smallest and not equal to smallest
                if (element < secondSmall && element != small){
                    secondSmall = element;
                }
                // element will be 2nd largest if it is larger than current 2nd largest and not equal to largest
                if (element > secondLarge && element != large){
                    secondLarge = element;
                }
            }

            // in case all the elements are same, there will be no 2nd largest or 2nd smallest
            if (secondSmall != Integer.MAX_VALUE){
                System.out.println("Second Smallest element in the array - " + secondSmall);
            }
            else {
                System.out.println("Second smallest element does not exist");
            }
            if (secondLarge != Integer.MIN_VALUE){
                System.out.println("Second largest element in the array - " + secondLarge);
            }
            else{
                System.out.println("Second largest element does not exist");
            }

        } else {
            System.out.println(-1 + "  " + -1);
        }

    }

    public static void main(String[] args) {
        int[] array = {82, 59, 18, 39, 59, 17, 45, 33, 61, 48, 78};
//        int[] array = {21, 22};
//        int[] array = {82, 17, 45};

        System.out.println("Array elements - ");
        System.out.println(Arrays.toString(array));

        findElements(array);
    }
}
