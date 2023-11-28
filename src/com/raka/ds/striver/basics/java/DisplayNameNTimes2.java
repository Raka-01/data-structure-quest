package com.raka.ds.striver.basics.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Striver 1.5
 * Print your Name N times using recursion
 * <p>
 * Time complexity - O(n)
 */

public class DisplayNameNTimes2 {

    public static void addNameNtimes(int n, List<String> list) {
        if (n == 0) {
            return;
        }
        list.add("Radhe Radhe");
        addNameNtimes(n - 1, list);
    }

    public static void displayList(List<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of n - ");
        int n = scanner.nextInt();

        List<String> list = new ArrayList<>();
        addNameNtimes(n, list);

        System.out.println("Displaying 'Radhe Radhe' " + n + " times -");
        displayList(list);
    }
}
