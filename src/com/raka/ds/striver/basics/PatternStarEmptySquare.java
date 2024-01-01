package com.raka.ds.striver.basics;

import java.util.Scanner;

/**
 * Striver 1.2
 * Print the following pattern : (for n = 4)
 *      *  *  *  *
 *      *        *
 *      *        *
 *      *  *  *  *
 */

public class PatternStarEmptySquare {

    public static void patternEmptySquare(int n){
        System.out.println("Pattern - ");
        for (int i = 0 ; i < n; i++){
            for (int j = 0 ; j < n; j++){
                if (i == 0 || i == n-1 || j == 0 || j == n-1){
                    System.out.print("*  ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n - ");
        int n = sc.nextInt();

        patternEmptySquare(n);
    }
}
