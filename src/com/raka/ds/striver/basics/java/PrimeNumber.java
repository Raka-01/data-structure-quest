package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Striver 1.4
 * Given a number, check whether it is prime or not.
 * A prime number is a natural number that is only divisible by 1 and by itself.
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(1)
 */

public class PrimeNumber {

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive number - ");
        int num = scanner.nextInt();

        if (num > 0) {
            if (isPrime(num)) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not A Prime Number");
            }
        } else {
            System.out.println("Not a positive number");
        }
    }
}
