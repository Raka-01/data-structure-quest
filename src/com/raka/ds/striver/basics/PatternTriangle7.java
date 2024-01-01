package com.raka.ds.striver.basics;

import java.util.Scanner;

/**
 * Striver 1.2
 * Print the following pattern :
 *      1
 *      0  1
 *      1  0  1
 *      0  1  0  1
 *      1  0  1  0  1
 */

public class PatternTriangle7 {

    public static void patternTriangle(int n) {
        System.out.println("Pattern - ");
        int start;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) start = 1;        // even index row start with 1 (0-based indexing)
            else start = 0;                 // odd index row start with 0 (0-based indexing
            for (int j = 0; j <= i; j++) {
                System.out.print(start + "  ");
                start = 1 - start;          // flip between 0 and 1
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n - ");
        int n = sc.nextInt();

        patternTriangle(n);
    }
}
