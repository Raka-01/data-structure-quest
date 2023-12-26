package com.raka.ds.array.hurdle_set_medium;

import java.util.Arrays;

/**
 * Search an element in a sorted and rotated Array
 * Given a sorted and rotated array arr[] of size N and a key, the task is to find the key in the array.
 * All the elements in the array are unique and different
 * <p>
 * Approach - By finding pivot element where array is rotated
 * - in a sorted and rotated array, the pivot element is the only element for which the next element to it is smaller than it
 * - use binary search to find the pivot element by calculating mid
 * - if value at mid-1 is greater than value at mid, return mid-1 index
 * - if value at mid+1 is smaller than value at mid, return mid-index
 * - this mid or mid-1 index is pivot index on which array is divided into 2 sub-arrays
 * - if key element is smaller than arr[0], search for key on the right half after pivot
 * - else key element is greater than or equal to arr[0], search for key on left half before pivot
 * <p>
 * Time complexity - O(logn), binary search takes logn comparisons to search for either pivot or key
 * Auxiliary space - O(1)
 */

public class SearchElementSortedRotatedArray {

    // search for a given key in the array
    public static int searchElement(int[] array, int key) {
        int length = array.length;

        int pivot = findPivot(array, 0, length - 1);  // return pivot index at which the array is rotated

        if (array[pivot] == key) {
            return pivot;
        } else if (array[0] <= key) {       // if key element is less than arr[0], means key is on the right half after pivot
            return binarySearch(array, 0, pivot - 1, key);
        }
        // if key is greater than equal to arr[0], means key is on left half before pivot
        return binarySearch(array, pivot + 1, length - 1, key);
    }

    // recursive approach to find the pivot element at which array is rotated
    public static int findPivot(int[] array, int low, int high) {
        // base cases
        if (high < low) {
            return -1;
        }
        if (low == high) {
            return low;
        }

        // using binary search to find the pivot element index
        int mid = low + (high - low) / 2;
        /*
         these 2 conditions will occur only at the pivot indexes
         */
        if (mid < high && array[mid] > array[mid + 1]) {     // array is sorted, so arr[mid] > arr[mid+1] will occur at pivot index
            return mid;
        } else if (mid > low && array[mid] < array[mid - 1]) {  // array is sorted, so arr[mid] < arr[mid-1] occur at pivot+1 index
            return (mid - 1);
        }
        /*
        if pivot index is not found in this recursive iteration,
        then call the next recursive iteration
        arr[] = {8, 9, 1, 2, 3, 4, 5, 6, 7}, here pivot is on left half of mid-index on 1st iteration
        arr[] = {3, 4, 5, 6, 7, 8, 9, 1, 2}, here pivot is on right half of mid-index on 1st iteration
         */
        if (array[mid] <= array[low]) {          // 3 < 8 -> true, 7 < 3 -> false => left half
            return findPivot(array, low, mid - 1);
        }
        /*
        arr[mid] >= arr[low]
        3 > 8 -> false, 7 > 3 -> true => right half
         */
        return findPivot(array, mid + 1, high);

    }

    // recursive approach to search for an element using binary search
    public static int binarySearch(int[] array, int low, int high, int key) {
        // base case
        if (high < low) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (array[mid] == key) {
            return mid;
        } else if (key > array[mid]) {
            // right half sub-array is taken for next recursive search as element[mid] < key
            return binarySearch(array, (mid + 1), high, key);
        }
        // left half sub-array is taken for next recursive search as element[mid] > key
        return binarySearch(array, low, (mid - 1), key);
    }

    public static void main(String[] args) {
//        int[] array = {3, 4, 5, 6, 7, 8, 9, 1, 2};
        int[] array = {8, 9, 1, 2, 3, 4, 5, 6, 7};

        System.out.println("Given Array - ");
        System.out.println(Arrays.toString(array));

        int key = 1;
        int index = searchElement(array, key);

        if (index != -1){
            System.out.println("The key " + key + " is found on index " + index + " of the array");
        }
        else {
            System.out.println("Element Not Found");
        }
    }
}
