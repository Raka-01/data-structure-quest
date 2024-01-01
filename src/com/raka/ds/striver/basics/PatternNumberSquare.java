package com.raka.ds.striver.basics;

import java.util.Scanner;

/**
 * Striver 1.2
 * Print the following pattern : (for n = 4)
 *      4  4  4  4  4  4  4
 *      4  3  3  3  3  3  4
 *      4  3  2  2  2  3  4
 *      4  3  2  1  2  3  4
 *      4  3  2  2  2  3  4
 *      4  3  3  3  3  3  4
 *      4  4  4  4  4  4  4
 *      (7x7) -> (2n-1)x(2n-1)
 *<p>
 *      subtracting 4 from each value in pattern
 *      0  0  0  0  0  0  0
 *      0  1  1  1  1  1  0
 *      0  1  2  2  2  1  0
 *      0  1  2  3  2  1  0
 *      0  1  2  2  2  1  0
 *      0  1  1  1  1  1  0
 *      0  0  0  0  0  0  0
 *      these values at each position is min of that position from (left, right, top, bottom)
 */

public class PatternNumberSquare {

    public static void patternSquare(int n) {
        System.out.println("Pattern - ");

        for (int i = 0; i < 2*n -1; i++){
            for (int j = 0; j < 2*n -1; j++){
                int top = i;
                int left = j;
                int bottom = (2*n-2)-i;
                int right = (2*n-2)-j;
                int value = n - Math.min(Math.min(left, right), Math.min(top, bottom));
                System.out.print(value + "  ");
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
