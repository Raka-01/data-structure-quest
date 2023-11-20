package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Striver 1.2
 * Print the following pattern :
 *      *  *  *  *  *  *  *  *  *
 *         *  *  *  *  *  *  *
 *            *  *  *  *  *
 *               *  *  *
 *                  *
 */

public class PatternTriangle4 {

    public static void patternTriangle(int n){
        System.out.println("Pattern - ");

        for (int i = n-1; i >= 0; i--){         // for n=5, i = 4, 3, 2, 1, 0

            // space
            for (int j = n-1; j > i; j-- ){     // for n=5, j runs for 0, 1, 2, 3, 4 with each i
                System.out.print("   ");
            }

            // star
            for (int j = 0; j < (2*i + 1); j++){    // for n=5, j runs for 9, 7, 5, 3, 1 with each i
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
