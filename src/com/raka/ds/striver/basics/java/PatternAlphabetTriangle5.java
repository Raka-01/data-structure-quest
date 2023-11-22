package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Striver 1.2
 * Print the following pattern : (for n = 5)
 *      E
 *      D E
 *      C D E
 *      B C D E
 *      A B C D E
 */

public class PatternAlphabetTriangle5 {

    public static void patternAlphabetTriangle(int n) {
        System.out.println("Pattern - ");
        int k = 64 + n;                     // 'A' starts at ASCII 65 - decides the highest alphabet according to n
        for (int i = 0; i < n; i++){
            int p = k;
            for (int j = 0; j <= i; j++){
                System.out.print((char) p + " ");
                p++;                        // alphabet increases in a row
            }
            k--;                            // alphabet decreases in a column
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
