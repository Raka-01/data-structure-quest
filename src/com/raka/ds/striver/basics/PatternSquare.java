package com.raka.ds.striver.basics;

import java.util.Scanner;

/**
 * Striver 1.2
 * Print the following pattern :
 *      *  *  *  *  *
 *      *  *  *  *  *
 *      *  *  *  *  *
 *      *  *  *  *  *
 *      *  *  *  *  *
 */

public class PatternSquare {

    public static void patternSquare(int n){
        System.out.println("Pattern -");
        for (int  i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n - ");
        int n = sc.nextInt();

        patternSquare(n);
    }
}
