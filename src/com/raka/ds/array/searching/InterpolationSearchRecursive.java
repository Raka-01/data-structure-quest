package com.raka.ds.array.searching;

/**
 * Array must be uniformly distributed
 */
public class InterpolationSearchRecursive {

    public static int searchElement(int[] array, int lo, int hi, int key) {
        int pos;

        if (lo < hi && array[lo] <= key && array[hi] >= key) {

            // instead of dividing array into half, it makes a data points more close to the key
            pos = lo + ((hi - lo) / (array[hi] - array[lo])) * (key - array[lo]);       // probe position formula

            if (array[pos] == key) {
                return pos;
            } else if (array[pos] < key) {
                lo = pos + 1;                       // sub-array sets to 2nd part
                return searchElement(array, lo, hi, key);
            } else if (array[pos] > key) {
                hi = pos - 1;                       // sub-array sets to 1st part
                return searchElement(array, lo, hi, key);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};

        System.out.println("Original Array - ");
        for (int element : array) {
            System.out.print(element + "   ");
        }

        int key = 18;

        int index = searchElement(array, 0, array.length - 1, key);
        if (index == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("\nElement " + key + " Found At Index " + index);
        }
    }
}
