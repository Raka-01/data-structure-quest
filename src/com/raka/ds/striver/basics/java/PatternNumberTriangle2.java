package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Striver 1.2
 * Print the following pattern :
 *      1
 *      2  2
 *      3  3  3
 *      4  4  4  4
 *      5  5  5  5  5
 */

public class PatternNumberTriangle2 {

    public static void patternNumberTriangle(int n){
        System.out.println("Pattern - ");
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n - ");
        int n = sc.nextInt();

        patternNumberTriangle(n);
    }
}
