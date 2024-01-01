package com.raka.ds.striver.basics;

import java.util.Scanner;

/**
 * Striver 1.5
 * Given a number ‘N’, find out the sum of the first N natural numbers.
 * <p>
 * Time complexity - O(n)
 */

public class Sum1stNNumbers3 {

    public static int sumNNumbers(int n){
        if (n == 0){
            return 0;
        }

        return n + sumNNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer n - ");
        int n = scanner.nextInt();

        if (n > 0){
            int sum =  sumNNumbers(n);
            System.out.println("Sum of 1st " + n + " natural numbers - " + sum);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
