package com.raka.ds.striver.basics;

import java.util.Scanner;

/**
 * Striver 1.5
 * Given a number n,  displays its factorial
 * <p>
 * Time complexity - O(n)
 */

public class FactorialOfNumber2 {

    public static int factorial(int num){
        if (num == 1){
            return 1;
        }

        return num * factorial(num-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer - ");
        int num = scanner.nextInt();

        if (num > 0) {
            int factorial = factorial(num);
            System.out.println("Factorial of given number - " + factorial);
        } else {
            System.out.println("Not a positive integer");
        }
    }
}
