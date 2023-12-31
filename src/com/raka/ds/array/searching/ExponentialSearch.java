package com.raka.ds.array.searching;

import java.util.Scanner;

public class ExponentialSearch {

    public static int searchElement(int[] array, int key) {
        int length = array.length;

        if (array[0] == key) {            // checking if first element equals key
            return 0;
        }

        int endIndex = 1;
        while (endIndex < length - 1 && array[endIndex] < key) {        // while index range less than length-1, and element at last index of range less than key
            endIndex = endIndex * 2;                // doubles the search range by extending the last index
        }

        int lb = endIndex / 2;            // since element is not found in previous range, so it must be after half of current range
        int ub = Math.min(endIndex, length - 1);      // checks for out of bound index
        int mid;

        while (lb <= ub) {
            mid = lb + (ub - lb) / 2;     // mid index is calculated
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {      // mid element is smaller than key - 2nd half
                lb = mid + 1;
            } else if (array[mid] > key) {      // mid element is larger than key - 1st half
                ub = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {12, 13, 17, 19, 22, 24, 28, 29, 34, 39, 41, 45, 49, 55, 59, 60, 67, 70, 77};

        System.out.println("Elements of array - ");
        for (int element : array) {
            System.out.print(element + "   ");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the element to search -");
        int key = input.nextInt();

        int index = searchElement(array, key);
        if (index == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element " + key + " Found At Index " + index);
        }
    }
}
