package com.raka.ds.striver.basics;

import java.util.Scanner;

/**
 * Striver 1.2
 * Print the following pattern : n = 5
 *      **********
 *      ****  ****
 *      ***    ***
 *      **      **
 *      *        *
 *      *        *
 *      **      **
 *      ***    ***
 *      ****  ****
 *      **********
 */

public class PatternStarDesign {

    public static void patternTriangle(int n){
        System.out.println("Pattern - ");

        for (int  i = 0; i < n; i++){
            // stars
            for (int j = n; j > i; j--){
                System.out.print("*");
            }

            // spaces
            for (int j = 0; j < 2*i; j++){
                System.out.print(" ");
            }

            // stars
            for (int j = n; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int  i = 0; i < n; i++){
            // stars
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }

            // spaces
            for (int j = 0; j < 2*(n-i-1); j++){
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j <= i; j++){
                System.out.print("*");
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
