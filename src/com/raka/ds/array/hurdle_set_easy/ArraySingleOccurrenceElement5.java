package com.raka.ds.array.hurdle_set_easy;

import java.util.Arrays;

/**
 * Find the element that appears once in an array where other elements appear twice
 * <p>
 * Approach - Using binary search
 * there are 2 halves separated by the singly occurred element
 * in the 1st half, if duplicates present then, the 1st instance of duplicate element is at an even index
 * in the 2nd half, if duplicates present then, the 1st instance of duplicate element is at an odd index
 * <p>
 * - sort the array
 * - set low = 0, high = length-2
 * inside while loop(low <= high)
 * - calculate mid = (low+high)/2
 * - checks arr[mid] == arr[mid^1] ? true : false
 * - if true, sets low = mid+1
 * -else false, sets high = mid-1
 * continue till the while loop is satisfied
 * finally low will be set to the index where the single occurrence element is present
 * - return arr[low]
 * <p>
 * Time complexity - O(nlogn)
 * Auxiliary space - O(1)
 * <p>
 * eg. arr[] = {7, 1, 3, 9, 2, 5, 9, 3, 8, 8, 2, 1, 7}
 * sorted array
 * arr[] =     {1, 1, 2, 2, 3, 3, 5, 7, 7, 8, 8, 9, 9}
 * length = 13
 * low = 0, high = 11(length-2)
 * <p>
 * inside while loop
 * <p>
 * first iteration
 * mid = (0+11)/2 = 5
 * arr[mid] = arr[5] = 3
 * arr[mid^1} = arr[5^1] = arr[4] = 3
 * 3 == 3 true
 * low = mid+1 = 5+1 = 6
 * high = 11
 * <p>
 * 2nd iteration
 * mid = (6+11)/2 = 8
 * arr[mid] = arr[8] = 7
 * arr[mid^1] = arr[8^1] = arr[9] = 8
 * 7==8 false
 * high = mid-1 = 8-1 = 7
 * low = 6
 * <p>
 * 3rd iteration
 * mid = (6+7)/2 = 6
 * arr[mid] = arr[6] = 5
 * arr[mid+1] = arr[6^1] = arr[7] = 7
 * 5==7 false
 * high = mid-1 = 6-1 = 5
 * low = 6
 * <p>
 * now, low <= high -> 6 <= 5 false
 * out of while loop
 * <p>
 * return arr[low] = arr[6] = 5
 */

public class ArraySingleOccurrenceElement5 {

    /*
    this method returns the elements that occurred only once in the array
    NOTE: this method assumes that array has only one element with single occurrence and rest with double occurrence
     */
    public static int singleOccurrenceElement(int[] array) {
        int length = array.length;
        /*
        as it is precaution to have only one element in array with single occurrence,
        if the array length is even, then there no element present in the array with single occurrence
         */
        if (length % 2 == 0) {
            return -1;
        } else {
            Arrays.sort(array);

            int low = 0, high = length - 2;
            int mid;

            while (low <= high) {
                mid = (low + high) / 2;
                if (array[mid] == array[mid ^ 1]) {    // XOR operation checking if mid is in left half of 2 halves talked about above
                    low = mid + 1;
                } else {
                    high = mid - 1;             // if mid is in right half
                }
            }

            return array[low];
        }
    }

    public static void main(String[] args) {
        int[] array = {7, 1, 3, 9, 2, 5, 9, 3, 8, 8, 2, 1, 7};

        int singleElement = singleOccurrenceElement(array);

        if (singleElement != -1) {
            System.out.println("Element with single occurrence in the array = " + singleElement);
        } else {
            System.out.println("There's no element with single occurrence present in the array");
        }
    }
}