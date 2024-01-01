package com.raka.ds.striver.basics;

import java.util.Scanner;

/**
 * Striver 1.4
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^(31) - 1], then return 0.
 */

public class ReverseNumber2 {

    public static int reverseNumber(int num){
        int temp = num;
        int reverseNumber = 0;

        while (temp > 0){
            int digit = temp % 10;

            /*
            condition (reverseNumber > Integer.MAX_VALUE / 10) checks whether the multiplication of
            reverseNumber by 10 will result in an overflow beyond the maximum value of a 32-bit signed integer (Integer.MAX_VALUE).
            a precautionary check to ensure that the reversed integer does not exceed the valid range before adding the next digit.

            condition (reverseNumber == Integer.MAX_VALUE / 10 && digit > 7)
            specifically checks whether adding the next digit (digit) to the reversed integer
            would cause it to exceed Integer.MAX_VALUE
             */
            if (reverseNumber > Integer.MAX_VALUE || (reverseNumber == Integer.MAX_VALUE && digit > 7)){
                return 0;
            }
            if (reverseNumber < Integer.MIN_VALUE || (reverseNumber == Integer.MIN_VALUE && digit < -8)){
                return 0;
            }

            reverseNumber = (reverseNumber * 10) + digit;

            temp = temp / 10;
        }

        return reverseNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer - ");
        int num = sc.nextInt();

        int reverseNumber = reverseNumber(num);
        if (reverseNumber != 0){
            System.out.println("Reverse of the number - " + reverseNumber);
        }
        else {
            System.out.println("Overflow occurred");
        }
    }
}

/*
This code will not run when a number greater, then Integer.MAX and less than Integer.MIN value is entered
The code will throw an exception of InputMismatchException
 */