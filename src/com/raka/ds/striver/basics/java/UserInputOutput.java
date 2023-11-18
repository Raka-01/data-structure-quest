package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Striver 1.1
 * Write a program that takes a character as input and prints 1, 0 and -1 based on the condition
 *  - 1, if character is an uppercase alphabet (A - Z)
 *  - 0, if character is a lowercase letter (a - z)
 *  - -1, if character is not an alphabet
 */


public class UserInputOutput {

    /*
    display 1, 0 or -1 based on the condition that
    the character is an uppercase alphabet, lowercase alphabet or any other character
     */
    public static void displayResult(char character){
        if (character >= 65 && character <=90){         // conditional check for uppercase alphabet
            System.out.println(1);
        } else if (character >= 97 && character <= 122) {   // conditional check for lowercase alphabet
            System.out.println(0);
        }
        else {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char character = input.next().charAt(0);

        displayResult(character);
    }
}
