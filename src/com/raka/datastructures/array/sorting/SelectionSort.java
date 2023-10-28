package com.raka.datastructures.array.sorting;

/**
 * Time Complexity - O(n^2)
 */

public class SelectionSort {

    // sort the array using selection sort
    public static void selectionSort(int[] array) {
        int length = array.length;
        int index;              // stores the index with which swapping is done (where smallest element is present)

        for (int i = 0; i < length - 1; i++) {        // catches the current index at which swapping is done
            index = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[index]) {        // update the index if smaller element than element at index is found
                    index = j;
                }
            }
            // swapping is done
            if (index != i) {            // if index remains i means no smallest element than current element is found
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }
    }

    // display the array to the console
    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {18, 39, 82, 49, 82, 10, 85, 67, 49, 74, 20, 49, 82, 12, 70, 81, 82, 20};

        System.out.println("Original Array - ");
        displayArray(array);

        selectionSort(array);

        System.out.println("Sorted Array - ");
        displayArray(array);
    }
}
