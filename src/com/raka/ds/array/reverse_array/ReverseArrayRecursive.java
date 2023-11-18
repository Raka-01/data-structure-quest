package com.raka.ds.array.reverse_array;

import java.util.Scanner;

public class ReverseArrayRecursive {

    public static void reverseArray(int[] array, int start, int end) {
        if (start >= end)
            return;

        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        start++;
        end--;
        reverseArray(array, start, end);
    }

    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "   ");
        }
    }

    public static void main(String[] args) {
        int[] array;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of array - ");
        int size = input.nextInt();

        array = new int[size];

        System.out.println("Enter elements -");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + " -  ");
            array[i] = input.nextInt();
        }

        System.out.println("Original array");
        displayArray(array);

        reverseArray(array, 0, array.length - 1);         // this method will make changes in original array

        System.out.println();
        System.out.println("Reverse Array - ");
        displayArray(array);
    }
}

/**
 * Time complexity = O(n)
 * Space complexity = O(n)
 */