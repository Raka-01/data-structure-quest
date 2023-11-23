package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Striver 1.4
 * Given a number check if it is a palindrome.
 * An integer is considered a palindrome when it reads the same backward as forward
 */

public class PalindromeNumber {

    public static boolean isPalindrome(int n){
        int reverseNumber = 0;
        int temp = n;

        while (temp > 0){
            int digit = temp%10;                // catching each digit of number 'n' from last
            reverseNumber = (reverseNumber*10) + digit;     // build the reverse number of number 'n'
            temp = temp/10;
        }

        return n == reverseNumber;              // returning reverse number is equal to number 'n' ot not
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number - ");
        int n = sc.nextInt();

        if (isPalindrome(n)){
            System.out.println("It is palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
