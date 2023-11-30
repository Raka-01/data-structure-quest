package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Striver 1.5
 * Given the value of integer n, return an array containing integers 1 to n in ascending order
 * <p>
 * Time complexity - O(n)
 */

public class AddNumbers1ToN {

    public static void addIntegers(int[] array, int n) {
        if (n == 0) {
            return;
        }

        array[n - 1] = n;
        addIntegers(array, n - 1);
    }

    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "   ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of n - ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        addIntegers(array, n);

        System.out.println("Elements of the array - ");
        displayArray(array);
    }
}
