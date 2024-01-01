package com.raka.ds.striver.basics;

import java.util.Scanner;

/**
 * Striver 1.2
 * Print the following pattern :
 *      1
 *      1  2
 *      1  2  3
 *      1  2  3  4
 *      1  2  3  4  5
 */

public class PatternNumberTriangle {

    public static void patternNumberTriangle(int n){
        System.out.println("Pattern - ");
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + "  ");
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
