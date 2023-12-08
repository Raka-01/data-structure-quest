package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Given an integer N. Print the Fibonacci series up to the Nth term
 * <p>
 * Time complexity - O(n)
 */

public class FibonacciNumbers {

    public static void dispalyFibonacciNumbers(int n) {
        int f0 = 0, f1 = 1;

        System.out.println(n + " fibonacci numbers - ");
        int fn1 = f0;
        int fn2 = f1;
        int fn;
        System.out.print(f0 + "   " + f1 + "   ");
        for (int i = 0; i < n - 2; i++) {
            fn = fn1 + fn2;
            fn1 = fn2;
            fn2 = fn;
            System.out.print(fn + "   ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer n - ");
        int n = scanner.nextInt();

        if (n > 0) {
            dispalyFibonacciNumbers(n);
        } else {
            System.out.println("Not a positive integer");
        }
    }
}
