package com.raka.ds.array.searching;

import java.util.Scanner;

public class SentinelLinearSearch {

    public static int searchElement(int[] array, int key) {
        int length = array.length;
        int last = array[length - 1];

        array[length - 1] = key;        // last element of array is replaced to key
        int i = 0;
        while (array[i] != key) {         // it stops iterating at the moment key element is found in array
            i++;
        }
        // checks if key is present or not
        if (i < length - 1 || last == key) {               // the moment 2nd condition is needed to check i is set to (length-1)
            return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {82, 91, 48, 72, 58, 49, 62, 59, 39, 10, 55, 93};

        System.out.println("Elements of array -");
        for (int element : array) {
            System.out.print(element + "   ");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the element to search -");
        int key = input.nextInt();                          // element to search

        int index = searchElement(array, key);
        if (index == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Found At Index " + index);
        }

    }
}

/**
 * Sentinel linear search avoids the conditional check for the end of the array in the loop
 * and terminate the loop early or as soon as we find the sentinel element
 * The last element of the array is replaced with the key value. this is sentinel element that eliminates the conditional checks
 * It results in slight improvement in the average case performance of the search algorithm
 */