package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Striver 1.4
 * Given a number, print all the divisors of the number.
 * A divisor is a number that gives the remainder as zero when divided.
 * <p>
 * Approach -
 * - traverse till root of the given number
 * - if iterating variable is a divisor, then quotient on dividing the number with i is also a divisor
 * - ignore quotient if it is equal to i (perfect square case)
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(1)
 */

public class DivisorsOfNumber2 {

    public static void displayDivisors(int num) {
        if (num > 0) {
            System.out.println("Divisors of given number - ");
            for (int i = 1; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    System.out.print(i + "   ");

                    int quotient = num / i;
                    if (quotient != i){
                        System.out.print(quotient + "   ");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number = ");
        int num = scanner.nextInt();

        displayDivisors(num);
    }
}
