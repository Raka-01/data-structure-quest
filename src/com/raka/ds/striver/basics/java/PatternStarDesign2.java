package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Striver 1.2
 * Print the following pattern : n = 5
 *      *
 *      *  *
 *      *  *  *
 *      *  *  *  *
 *      *  *  *  *  *
 *      *  *  *  *
 *      *  *  *
 *      *  *
 *      *
 */

public class PatternStarDesign2 {

    public static void patternTriangle(int n){
        System.out.println("Pattern - ");

        for (int  i = 1; i <= (2*n -1); i++){
            int stars = i;                      // for n=5, stars = 1, 2, 3, 4, 5
            if (i > n) stars = 2*n - i;         // i=6 > 5 -> stars = 4, 3, 2, 1
            for (int j = 1; j <= stars; j++){
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
