package com.raka.ds.striver.basics;

import java.util.Scanner;

/**
 * Striver 1.4
 * Calculate the GCD of two given numbers
 * <p>
 * Time complexity - O(n)
 * where n is smallest of 2 numbers
 */
public class GCDofNumber {

    public static int calculateGCD(int num1, int num2) {
        int gcd = 1;

        /*
        starts with 2 as 1 is always a divisor
         */
        for (int i = 2; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;
        System.out.println("Enter number1 = ");
        num1 = sc.nextInt();

        System.out.println("Enter number2 = ");
        num2 = sc.nextInt();

        int gcd = calculateGCD(num1, num2);
        System.out.println("GCD of the given 2 numbers  - " + gcd);
    }
}
