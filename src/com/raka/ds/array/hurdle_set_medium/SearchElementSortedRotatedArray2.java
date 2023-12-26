package com.raka.ds.array.hurdle_set_medium;

import java.util.Arrays;

/**
 * Search an element in a sorted and rotated Array
 * Given a sorted and rotated array arr[] of size N and a key, the task is to find the key in the array.
 * All the elements in the array are unique and different
 * <p>
 * Approach - using direct binary search
 *  - use a while loop(low <= high) to search the key
 *  - calculate the mid-index, mid = (low + high)/2
 *  - if key is present at mid, return mid
 *  - if value at low is less than value at mid, then arr[low to mid] is sorted
 *      - if key is present in between arr[low] and arr[mid], set high = mid-1
 *      - else low = mid+1
 *  - else arr[mid to high] is sorted
 *      - if key is present in between arr[mid] and arr[high], set low = mid+1
 *      - else high = mid-1
 *  - finally return -1, if element not found
 * <p>
 * Time complexity - O(logn), binary search takes logn comparisons to search for the element
 * Auxiliary space - O(1)
 */

public class SearchElementSortedRotatedArray2 {

    // search for a given key in the array
    public static int searchElement(int[] array, int low, int high, int key) {
        while(low <= high){
            int mid = low + (high - low)/2;
            if (array[mid] == key){
                return mid;
            }

            /*
            if arr[low ... mid] first sub-array is sorted
             */
            if (array[low] <= array[mid]) {
                /*
                checks if key lies in first half(sorted) or the other half(unsorted)
                 */
                if (key >= array[low] && key < array[mid]) {
                    // if key lies in first half, reduce the search space to 1st half
                    high = mid - 1;
                }
                else {
                    /*
                    if key is not present in first sorted half, then
                    reduce the search space to 2nd half
                     */
                    low = mid + 1;
                }
            }
            else {
                /*
                if first half is not sorted then
                second half arr[mid ... high] must be sorted
                 */
                if (key > array[mid] && key <= array[high]){
                    // if key is present in 2nd half, reduce the search space to 2nd half
                    low = mid + 1;
                }
                else {
                    // else reduce the search space to 1st half
                    high = mid - 1;
                }
            }
        }
        // if key is not found in the array, then return -1
        return -1;
    }

    public static void main(String[] args) {
//        int[] array = {3, 4, 5, 6, 7, 8, 9, 1, 2};
        int[] array = {8, 9, 1, 2, 3, 4, 5, 6, 7};

        System.out.println("Given Array - ");
        System.out.println(Arrays.toString(array));

        int key = 0;
        int index = searchElement(array, 0, array.length-1, key);

        if (index != -1){
            System.out.println("The key " + key + " is found on index " + index + " of the array");
        }
        else {
            System.out.println("Element Not Found");
        }
    }
}
