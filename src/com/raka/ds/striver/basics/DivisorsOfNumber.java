package com.raka.ds.striver.basics;

import java.util.Scanner;

/**
 * Striver 1.4
 * Given a number, print all the divisors of the number.
 * A divisor is a number that gives the remainder as zero when divided.
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(1)
 */

public class DivisorsOfNumber {

    public static void displayDivisors(int num){
        if (num > 0){
            System.out.println("Divisors of given number - ");
            for (int i = 1; i <= num; i++){
                if (num%i == 0){
                    System.out.print(i + "   ");
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
