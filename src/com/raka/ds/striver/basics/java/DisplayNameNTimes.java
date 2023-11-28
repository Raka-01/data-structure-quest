package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Print your Name N times using recursion
 */

public class DisplayNameNTimes {

    public static void displayNameNTimes(int k, int n){
        if (k > n){
            return;
        }
        System.out.println("Radhe Radhe");
        k++;
        displayNameNTimes(k, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of n - ");
        int n = scanner.nextInt();

        displayNameNTimes(1, n);
    }
}
