package com.raka.ds.striver.basics;

import java.util.Scanner;

/**
 * Striver 1.2
 * Print the following pattern : (for n = 4)
 *      1             1
 *      1 2         2 1
 *      1 2 3     3 2 1
 *      1 2 3 4 4 3 2 1
 */

public class PatternMirrorTriangle {

    public static void patternMirrorTriangle(int n) {
        System.out.println("Pattern - ");

        for (int i = 1; i <= n; i++){
            int j;
            // numbers
            for (j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            // spaces
            for (int k = 1; k <= 2*(n-i); k++){
                System.out.print("  ");
            }
            // reverse numbers
            for (j = j-1; j >= 1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n - ");
        int n = sc.nextInt();

        patternMirrorTriangle(n);
    }
}
