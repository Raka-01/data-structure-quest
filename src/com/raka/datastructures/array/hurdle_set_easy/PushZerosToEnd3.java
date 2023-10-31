package com.raka.datastructures.array.hurdle_set_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Move all zeroes to end of array without affecting the order of non-zero elements
 *
 * Approach - traverse the whole array and will count the number of zeros present in the array.
 * While counting, delete the zero from the array.
 * After completing the above process, push back the count number of zeros into the array
 *
 * Time complexity - O(n)
 * Auxiliary space - O(1)
 */

public class PushZerosToEnd3 {

    public static void pushZerosToEnd(List<Integer> array) {
        int count = 0;

        // iterate through each element of the list get count of zeros in the list
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == 0) {
                array.remove(i);        // remove the zero element if found
                i--;
                count++;
            }
        }

        // add count number of zeros to the list
        while (count > 0) {
            array.add(0);
            count--;
        }

    }

    // display the elements of the list to the console
    public static void displayList(List<Integer> array) {
        for (int element : array) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 8, 7, 0, 9, 0, 0, 7, 4, 0, 3, 3, 0, 3, 2, 5, 4, 0, 0, 0, 5, 5, 7, 2));

        System.out.println("Original ArrayList - ");
        displayList(array);

        pushZerosToEnd(array);

        System.out.println("Modified arraylist after pushing all zeros to end of list - ");
        displayList(array);
    }
}
