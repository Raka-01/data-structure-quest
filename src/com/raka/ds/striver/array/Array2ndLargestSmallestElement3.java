package com.raka.ds.striver.array;

import java.util.Arrays;

/**
 * Given an array, find the second smallest and second-largest element in the array.
 * Print ‘-1’ in the event that either of them doesn’t exist.
 * <p>
 * Approach - Optimal
 * - initialize 4 variables, small & secondSmall to Integer.MAX_VALUE, large & secondLarge to Integer.MIN_VALUE
 * - iterate through each element in the array
 * - if element < small, then update secondSmall with small and small with element
 * - else if element < secondSmall, then update secondSmall with element
 * - if element > large, then update secondLarge with large and large with element
 * - else if element > secondLarge, then update secondLarge with element
 * <p>
 * Time Complexity - O(n), iterate through each element in the array
 * Auxiliary space - O(1)
 */

public class Array2ndLargestSmallestElement3 {

    public static void findElements(int[] array) {
        int length = array.length;

        // array cannot have 2nd largest or 2nd smallest if array size is 0 or 1
        if (length > 1) {
            int large = Integer.MIN_VALUE;      // holds the largest element
            int secondLarge = Integer.MIN_VALUE;    // holds the 2nd largest element
            int small = Integer.MAX_VALUE;      // holds the smallest element
            int secondSmall = Integer.MAX_VALUE;    // holds the 2nd smallest element

            for (int element : array){
                // in the case current element is smaller than current smallest, update secondSmall & small both
                if (element < small){
                    secondSmall = small;
                    small = element;
                } else if (element < secondSmall){
                    // in case current element is less than current secondSmallest, update secondSmall
                    secondSmall = element;
                }

                // in case current element is larger than current largest, update large & secondLarge both
                if (element > large){
                    secondLarge = large;
                    large = element;
                } else if (element > secondLarge){
                    // in case current element is larger than current secondLargest, update secondLarge
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
