package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Striver 1.2
 * Print the following pattern : (for n = 5)
 *          A
 *         ABA
 *        ABCBA
 *       ABCDCBA
 *      ABCDEDCBA
 */

public class PatternAlphabetTriangle4 {

    public static void patternAlphabetTriangle(int n) {
        System.out.println("Pattern - ");
        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            int k = 65;
            // alphabets
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print((char) k);
                if (j < i) k++;
                else k--;
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
