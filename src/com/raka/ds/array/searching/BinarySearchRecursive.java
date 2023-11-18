package com.raka.ds.array.searching;

import java.util.Scanner;

public class BinarySearchRecursive {

    public static int searchElement(int[] array, int lb, int ub, int key) {
        if (lb <= ub) {                   // case '=' when lb == ub as set and called from within the method
            int mid = lb + (ub - lb) / 2;

            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                lb = mid + 1;
                return searchElement(array, lb, ub, key);       // calling this method on the 2nd half
            } else if (array[mid] > key) {
                ub = mid - 1;
                return searchElement(array, lb, ub, key);       // calling this method on 1st half
            }
        }
        return -1;
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

        int index = searchElement(array, 0, array.length - 1, key);
        if (index > -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element Not Found");
        }
    }
}

/**
 * Time Complexity: O(log N)
 * Auxiliary Space: O(log N)
 * <p>
 * having a return statement in both the else if branches make the code slightly more clear
 * and prevent further execution of the recursive calls when a match has been found
 */

/**
 * having a return statement in both the else if branches make the code slightly more clear
 * and prevent further execution of the recursive calls when a match has been found
 */