package com.raka.ds.array.hurdle_set_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given an array arr[] of size N, the task is to rotate the array by d position to the right
 *
 * Approach - Reversal Algorithm  (refer to resources)
 *
 * Time complexity - O(n)
 * Auxiliary space - O(1)
 */

public class ArrayRotationRight {

    // rotate the array right by d positions
    public static void rightRotateList(List<Integer> array, int d){
        int size = array.size();

        if (size > 1){
            d = d % size;

            // reverse the whole list
            Collections.reverse(array);

            // reverse the first d elements
            for (int i = 0; i < d/2; i++){
                int temp = array.get(i);
                array.set(i, array.get(d - 1 - i));
                array.set(d - 1 - i, temp);
            }

            // reverse the last size-d elements
            for (int i = d; i < (size + d)/2; i++){
                int temp = array.get(i);
                array.set(i, array.get(size + d - 1 - i));
                array.set(size + d - 1 - i, temp);
            }
        }
    }

    // display the list to the console
    public static void displayList(List<Integer> array){
        for (int element : array){
            System.out.print(element + "    ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

        System.out.println("Original List - ");
        displayList(array);

        int d = 8;
        rightRotateList(array, d);

        System.out.println("List after right rotation by " + d + " positions");
        displayList(array);

    }
}
