package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * There is a number 'N'
 * Find the number of digits of 'N' that evenly divides 'N'
 * A digit evenly divides 'N' if it leaves no remainder when dividing it.
 */

public class DigitDividesN {

    public static void countDigitDividesN(int n){
        int temp = n;
        int count = 0;

        while (temp > 0){
            int digit = temp % 10;          // catches last digit of the number 'n' in each iteration
            if (n%digit == 0){
                count++;
            }
            temp = temp/10;                 // removes the last digit from number 'n' in each iteration
        }

        System.out.println("Total count of digits in " + n + " that divides it = " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number - ");
        int n = sc.nextInt();

        countDigitDividesN(n);
    }
}
