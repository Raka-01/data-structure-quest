package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Striver 1.5
 * Given a number ‘N’, find out the sum of the first N natural numbers.
 * <p>
 * Time complexity - O(1)
 */

public class Sum1stNNumbers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer n - ");
        int n = scanner.nextInt();

        if (n > 0) {
            int sum = n * (n + 1) / 2;

            System.out.println("Sum of 1st " + n + " natural numbers - " + sum);
        } else {
            System.out.println("Invalid Input");
        }
    }
}
