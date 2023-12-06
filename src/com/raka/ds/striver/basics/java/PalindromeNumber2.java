package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Striver 1.5
 * Given a string check if it is a palindrome.
 * A string is considered a palindrome when it reads the same backward as forward
 */

public class PalindromeNumber2 {
    public static boolean isPalindrome(String s, int first, int last){
        if (first >= last){
            return true;
        }

        if (s.charAt(first) != s.charAt(last)){
            return false;
        }

        return isPalindrome(s, first+1, last-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string - ");
        String s = sc.next();

        if (isPalindrome(s, 0, s.length()-1)){
            System.out.println("It is palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
