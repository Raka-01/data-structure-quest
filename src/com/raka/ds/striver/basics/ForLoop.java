package com.raka.ds.striver.basics;

import java.util.Scanner;

/**
 * The nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the formula -
 * F(n) = F(n-1) + F(n-2)
 * where, F(1) = F(2) = 1
 *<p>
 * Provided 'n', find out the nth Fibonacci number. Handle edge cases like n=1, n=2 by using conditionals
 * Indexing starts from 1
 */

public class ForLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Which fibonacci number you want - ");
        int n = input.nextInt();
        int fn, fn1, fn2;
        fn2 = fn1 = 1;
        fn = fn2 + fn1;

        if (n == 1){
            System.out.println("Fibonacci number at 1 = 1");
        } else if (n ==2) {
            System.out.println("Fibonacci number at 2 = 1");
        }
        else {
            for (int i = 4; i <= n; i++){
                fn2 = fn1;                      // f(n-2)
                fn1 = fn;                       // f(n-1)

                fn = fn1 + fn2;                 // f(n)
            }
            System.out.println("Fibonacci number at " + n + " = " + fn);
        }
    }
}
