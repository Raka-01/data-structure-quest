package com.raka.ds.striver.basics;

import java.util.Scanner;

/**
 * Striver 1.4
 * Given a number, check whether it is prime or not.
 * A prime number is a natural number that is only divisible by 1 and by itself.
 * <p>
 * Approach - factors of a number exists in pair, one before and one after the sqrt(number)
 * - starts from 2 and iterate till sqrt(number)
 * - if i divides number, return false
 * - finally, at end return true  - will be returned if flow will reach to the end
 * <p>
 * Time complexity - O(sqrt(n))
 * Auxiliary space - O(1)
 */

public class PrimeNumber2 {

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
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
