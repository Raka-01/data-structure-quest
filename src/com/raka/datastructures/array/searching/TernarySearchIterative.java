package com.raka.datastructures.array.searching;

import java.util.Scanner;

public class TernarySearchIterative {

    public static int searchElement(int[] array, int key) {
        int lb = 0;                                 // lower bound
        int ub = array.length - 1;                  // upper bound

        while (lb <= ub) {
            int mid1 = lb + (ub - lb) / 3;            // 1st middle index
            int mid2 = ub - (ub - lb) / 3;            // 2nd middle index

            if (array[mid1] == key) {
                return mid1;
            } else if (array[mid2] == key) {
                return mid2;
            } else if (array[mid1] > key) {           // sets the search space to 1st one-third part
                ub = mid1 - 1;
            } else if (array[mid2] < key) {            // sets the search space to 3rd one-third part
                lb = mid2 + 1;
            } else {                                    // sets the search space to 2nd one-third part
                lb = mid1 + 1;
                ub = mid2 - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {12, 19, 22, 23, 25, 27, 33, 38, 42, 47, 50, 51, 59, 66};

        System.out.println("Elements in the array - ");
        for (int element : array) {
            System.out.print(element + "   ");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the element to search - ");
        int key = input.nextInt();                  // element to search

        int index = searchElement(array, key);
        if (index == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Found At Index " + index);
        }
    }
}

/**
 * Time complexity - O(log n base 3)
 * Space complexity - O(1)
 */