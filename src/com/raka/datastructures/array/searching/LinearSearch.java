package com.raka.datastructures.array.searching;

import java.util.Scanner;

public class LinearSearch {

    public static int searchElement(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int countDuplicates(int[] array, int key) {
        int count = 0;

        for (int element : array) {
            if (element == key) {
                count++;
            }
        }
        return count;
    }

    public static int[] searchAllOccurrences(int[] array, int key) {
        int[] indices;

        int count = countDuplicates(array, key);
        indices = new int[count];

        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                indices[k] = i;
                k++;
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        int[] array = {13, 72, 47, 72, 48, 82, 47, 36, 63, 73, 72};

        System.out.println("Elements of the array - ");
        for (int element : array) {
            System.out.print(element + "   ");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the element to search - ");
        int key = input.nextInt();

        // searching for 1st occurrence of the key
        int index = searchElement(array, key);
        if (index == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Found At Index " + index);
        }

        // searching for all occurrences of key
        int[] indices = searchAllOccurrences(array, 72);
        if (indices.length > 0) {
            System.out.println("Indices of occurrences of key 72 in the array -");
            for (int value : indices) {
                System.out.print(value + "   ");
            }
        } else {
            System.out.println("Element Not Found");
        }
    }
}
