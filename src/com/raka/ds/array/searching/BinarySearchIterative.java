package com.raka.ds.array.searching;

import java.util.Scanner;

public class BinarySearchIterative {

    public static int searchElement(int[] array, int key) {
        int lb = 0;                     // lower bound
        int ub = array.length - 1;      // upper bound
        int mid;

        while (lb < ub) {                 // checking if lower bound is less than upper bound
            mid = lb + (ub - lb) / 2;     // mid index is calculated
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {      // mid element is smaller than key - 2nd half
                lb = mid + 1;
            } else if (array[mid] > key) {      // mid element is larger than key - 1st half
                ub = mid - 1;
            }
        }
        return -1;                      // key not found
    }

    public static void main(String[] args) {
        int[] array = {10, 12, 13, 17, 18, 22, 25, 29, 35, 38, 44, 48, 55};

        System.out.println("Original array - ");
        for (int element : array) {
            System.out.print(element + "   ");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element to search");
        int key = input.nextInt();

        int index = searchElement(array, key);
        if (index > -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element found at index " + index);
        }
    }
}

/**
 * Time Complexity: O(log N)
 * Auxiliary Space: O(1)
 */
