package com.raka.ds.striver.basics.java;

import java.util.Scanner;

/**
 * Striver 1.4
 * Given a number, check if it is Armstrong Number or Not
 *<p>
 * Time complexity - O(n), where n is number of digits in the number
 * Auxiliary space - O(1)
 */

public class ArmstrongNumber {

    public static boolean checkArmstrong(int num){
        int temp = num;

        int count = 0;      // count the number of digits in number
        while (temp != 0){
            count++;
            temp = temp/10;
        }

        int sum = 0;        // add the power of each digit of number raised to count
        temp = num;
        while (temp != 0){
            int digit = temp%10;        // catches each digit of number
            sum = sum + (int)Math.pow(digit, count);

            temp = temp/10;
        }

        return (num == sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number = ");
        int num = scanner.nextInt();

        if (checkArmstrong(num)){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not Armstrong number");
        }
    }
}
