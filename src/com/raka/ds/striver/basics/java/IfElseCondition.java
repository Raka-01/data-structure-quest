package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Striver 1.1
 * User enters two numbers A and B
 * Compare the numbers and print the relation
 * Print 'smaller', 'greater', or 'equal' depending on A is smaller than B, A is greater than B or A is equal to B respectively
 */

public class IfElseCondition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number A - ");
        int a = input.nextInt();                // number A
        System.out.println("Enter number B - ");
        int b = input.nextInt();                // number B

        if (a > b){
            System.out.println("Greater");
        } else if (a < b) {
            System.out.println("Smaller");
        } else {
            System.out.println("Equal");
        }
    }
}
