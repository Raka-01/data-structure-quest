package com.raka.ds.striver.basics;

import java.util.Scanner;

/**
 * Striver 1.5
 * Print your Name N times using recursion
 * <p>
 * Time complexity - O(n)
 */

public class DisplayNameNTimes {

    public static void displayNameNTimes(int k, int n) {
        if (k > n) {
            return;
        }
        System.out.println("Radhe Radhe");
        k++;
        displayNameNTimes(k, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of n - ");
        int n = scanner.nextInt();

        displayNameNTimes(1, n);
    }
}
