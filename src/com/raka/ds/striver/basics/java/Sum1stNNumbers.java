package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Striver 1.5
 * Given a number ‘N’, find out the sum of the first N natural numbers.
 * <p>
 * Time complexity - O(n)
 */

public class Sum1stNNumbers {

    public static int sumNNumbers(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer n - ");
        int n = scanner.nextInt();

        if (n > 0) {
            int sum = sumNNumbers(n);
            System.out.println("Sum of 1st " + n + " natural numbers - " + sum);
        } else {
            System.out.println("Invalid input");
        }
    }
}
