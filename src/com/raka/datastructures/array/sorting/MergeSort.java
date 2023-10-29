package com.raka.datastructures.array.sorting;

public class MergeSort {

    // merge two sub-arrays into a merged array without losing the correct order of their elements
    private static void mergeSubArrays(int[] array, int l, int m, int r) {
        int sizeLeft = m - l + 1;           // size of sub-array l to m
        int sizeRight = r - m;              // size of sub-array m+1 to r

        // temporary arrays to store the sub-arrays
        int[] tempLeft = new int[sizeLeft];
        int[] tempRight = new int[sizeRight];

        // copy the elements of left and right sub arrays
        for (int i = 0; i < sizeLeft; i++) {
            tempLeft[i] = array[l + i];           // leftTemp sub-array starts at index l of original array
        }
        for (int j = 0; j < sizeRight; j++) {
            tempRight[j] = array[m + 1 + j];        // rightTemp sub-array starts at index m+1 of original array
        }

        // merge the two sub-arrays

        int i = 0, j = 0;       // initial indices for left & right sub-arrays
        int k = l;              // initial index for merged sub-array

        /*
        loop continues till one of left and right sub-array reaches its end index
        tempLeft and tempRight sub-arrays are already sorted
        we just need to merge the two sub-arrays by placing elements at their correct index according to the order
         */
        while (i < sizeLeft && j < sizeRight) {
            if (tempLeft[i] <= tempRight[j]) {
                array[k] = tempLeft[i];
                i++;
            } else {
                array[k] = tempRight[j];
                j++;
            }
            k++;
        }

        /*
        copy any left elements from left sub-array to merged sub-array
        (caused when right sub-array reaches its end index in above while loop)
         */
        while (i < sizeLeft) {
            array[k] = tempLeft[i];
            i++;
            k++;
        }

        /*
        copy any left elements from right sub-array to merged sub-array
        (caused when left sub-array reaches its end index in above while loop)
         */
        while (j < sizeRight) {
            array[k] = tempRight[j];
            j++;
            k++;
        }

    }

    // sort the array using merge sort
    public static void mergeSort(int[] array, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSort(array, l, m);
            mergeSort(array, m + 1, r);

            mergeSubArrays(array, l, m, r);
        }
    }

    // display array to the console
    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "    ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {82, 49, 12, 48, 81, 39, 48, 82, 38, 11, 91, 89, 87, 67, 77, 52, 32, 72, 21};

        System.out.println("Original Array - ");
        displayArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted Array - ");
        displayArray(array);
    }
}
