package com.raka.ds.striver.basics;

import java.util.Scanner;

/**
 * Striver 1.2
 * Print the following pattern :
 *      1
 *      2  3
 *      4  5  6
 *      7  8  9  10
 *      11  12  13  14  15
 */

public class PatternNumberTriangle4 {

    public static void patternTriangle(int n){
        int k = 1;
        System.out.println("Pattern - ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(k + "  ");
                k++;
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
