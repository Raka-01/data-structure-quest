package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Given the value of integer n, return an array containing integers n to 1 in descending order
 * <p>
 * Time complexity - O(n)
 */

public class AddNumbersNTo1 {

    public static void addNumbersNTo1(int[] array, int n) {
        if (n == 0) {
            return;
        }

        array[array.length - n] = n;

        addNumbersNTo1(array, n - 1);
    }

    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "   ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer - ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        addNumbersNTo1(array, n);

        System.out.println("Elements of the array - ");
        displayArray(array);
    }
}
