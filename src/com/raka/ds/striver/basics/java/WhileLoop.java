package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Striver 1.1
 * User input an integer 'n' and
 * print the sum of all its even digits and sum of all its odd digits separately.
 */

public class WhileLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number - ");
        int num = input.nextInt();

        int sumOdd = 0, sumEven = 0;

        while (num > 0) {
            int digit = num % 10;           // catches each digit from last

            if (digit % 2 == 0) {
                sumEven = sumEven + digit;
            } else {
                sumOdd = sumOdd + digit;
            }

            num = num / 10;                 // removes last digit from number
        }

        System.out.println("Sum of even numbers - " + sumEven);
        System.out.println("Sum of odd numbers - " + sumOdd);

    }
}
