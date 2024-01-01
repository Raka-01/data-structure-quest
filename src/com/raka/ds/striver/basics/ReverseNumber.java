package com.raka.ds.striver.basics;

import java.util.Scanner;

/**
 * Striver 1.4
 * There is a song concert going to happen in the city.
 * The price of each ticket is equal to the number obtained
 * after reversing the bits of a given 32 bits unsigned integer 'n'.
 * Calculate the price of each ticket
 * <p>
 * eg. given number N = 12 is represented as 00000000000000000000000000001100 in its binary representation.
 * So after reversing the bits, it will become 0110000000000000000000000000000, which is equal to 805306368
 */

public class ReverseNumber {

    public static void reverse32Bits(int n) {
        int temp = n;
        int reverseNumber = 0;

        for (int i = 0; i < 32; i++) {
            /*
            returns the last bit of number n
            returns 1 when true means last bit of n is 1, and
            returns 0 when false means last bit of n is 0
             */
            int bit = temp & 1;

            reverseNumber = reverseNumber << 1;     // left shift reverse number making a bit space at 0th place

            /*
            0th place of reverseNumber is 0,
            so whatever the bit is placed at 0th place of reverseNumber
             */
            reverseNumber = reverseNumber | bit;

            // deleting the last bit from temp after placing it in reverseNumber
            temp = temp >> 1;
        }

        System.out.println("Reversed 32 bits of number " + n + " = " + Integer.toBinaryString(reverseNumber));
        System.out.println("Number after reversing the 32 bits of number " + n + " = " + reverseNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number - ");
        int n = sc.nextInt();

        reverse32Bits(n);
    }
}
