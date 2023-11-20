package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Striver 1.2
 * Print the following pattern :
 *      *  *  *  *  *
 *      *  *  *  *
 *      *  *  *
 *      *  *
 *      *
 */

public class PatternTriangle2 {

    public static void patternTriangle(int n){
        System.out.println("Pattern - ");
        for (int i = n; i > 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*  ");
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
