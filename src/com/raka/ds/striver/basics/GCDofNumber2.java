package com.raka.ds.striver.basics;

import java.util.Scanner;

/**
 * Striver 1.4
 * Calculate the GCD of two given numbers
 * <p>
 * Approach - Euclidean theorem to calculate GCD
 * The Euclidean Algorithm for finding GCD(A,B) is as follows:
 * - If A = 0 then GCD(A,B)=B, since the GCD(0,B)=B, and we can stop.  (base condition)
 * - If B = 0 then GCD(A,B)=A, since the GCD(A,0)=A, and we can stop.  (base condition)
 * - Write A in quotient remainder form (A = B⋅Q + R)
 * - Find GCD(B,R) using the Euclidean Algorithm since GCD(A,B) = GCD(B,R)
 * <p>
 * So, gcd(a, b) = gcd(b, a%b)
 * - b==0 is the base condition.When base condition is hit return a, as gcd(a,0) is equal to a.
 * - Recursively call gcd(b,a%b) function till the base condition is hit.
 * <p>
 * eg . GCD(270,192) = GCD(192,78) = GCD(78,36) = GCD(36,6) = GCD(6,0) = 6
 * <p>
 * Time complexity - O(logɸ(min(a, b))), where ɸ = 1.61
 * Auxiliary space - O(1)
 */

public class GCDofNumber2 {

    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateGCD(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number1 = ");
        int num1 = scanner.nextInt();

        System.out.println("Enter number2 = ");
        int num2 = scanner.nextInt();

        int gcd = calculateGCD(num1, num2);
        System.out.println("GCD of the given 2 numbers = " + gcd);
    }
}
