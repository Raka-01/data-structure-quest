package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Striver 1.2
 * Print the following pattern : (for n = 5)
 *      ABCDE
 *      ABCD
 *      ABC
 *      AB
 *      A
 */

public class PatternAlphabetTriangle2 {

    public static void patternAlphabetTriangle(int n) {
        System.out.println("Pattern - ");
        for (int i = 0; i < n; i++) {
            int k = 65;
            for (int j = i; j < n; j++) {
                System.out.print((char) k);
                k++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n - ");
        int n = sc.nextInt();

        patternAlphabetTriangle(n);
    }
}
