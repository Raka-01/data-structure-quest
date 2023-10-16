package com.raka.datastructures.array.reverse_array;

import java.util.Scanner;

public class ReverseArray {

    public static void reverseArray(int[] array){       // reference of array is given as argument, any change will reflect in original array
        int start = 0;
        int end = array.length - 1;

        while(start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    public static void displayArray(int[] array){
        for (int element : array) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array - ");
        int size = input.nextInt();             // asking for size from the user

        array = new int[size];                  // array is initialized with that size

        System.out.println("Enter elements -"); // user is asked to enter elements in the array
        for (int i = 0; i < size; i++){
            System.out.println("Index " + i + " -  ");
            array[i] = input.nextInt();
        }

        System.out.println("Original array");   // original array is displayed on console
        displayArray(array);

        reverseArray(array);                    // original array = reverse array

        System.out.println("Reverse Array - "); // reverse array is displayed on console
        displayArray(array);
    }
}

/**
 * Time complexity = O(n)
 * Space complexity = O(1)
 */
