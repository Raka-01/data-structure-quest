package com.raka.datastructures.array.sorting;

public class QuickSort {

    // supporting method used to swap two elements in the array
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // partition the array/sub-array into two parts by returning the pivot element index (correctly placed element in the array)
    private static int partition(int[] array, int low, int high) {
        // sets the last element of array/sub-array as pivot
        int pivot = array[high];

        /*
        index of smaller element while comparing for swapping
        that's why it is the right position of the pivot element found so far in the loop
         */
        int i = low - 1;            // always sets the index one less outside of array(-1)/sub-array(low-1)

        // iterating from low to high-1 to find smaller elements than pivot
        for (int j = low; j <= high - 1; j++) {     // j sets the index of larger element while swapping with element at i

            // comparing current element with pivot gives the correct position of pivot element till current iteration
            if (array[j] < pivot) {
                i++;                // in first iteration, sets i to index low - a valid index of sub-array(low)/array(0)
                swap(array, i, j);
            }
        }
        // lastly swaps the pivot element with the element at correct pivot position, hence pivot element is correctly placed
        swap(array, i + 1, high);

        return i + 1;         // pivot index is returned for further partition
    }

    // sort the array/sub-arrays using quick sort  (recursive algorithm)
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {

            // pi - partitioning index - divides the array into two parts according to pivot index returned from the method
            int pi = partition(array, low, high);

            /*
            quicksort the two sub-arrays before and after partitioning index
            as element at partitioning index(pivot index returned) is placed at its correct position
             */
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
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
        int[] array = {62, 49, 18, 82, 48, 78, 98, 13, 26, 62, 47, 61, 34, 22, 91, 43};

        System.out.println("Original Array - ");
        displayArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted Array - ");
        displayArray(array);
    }
}
