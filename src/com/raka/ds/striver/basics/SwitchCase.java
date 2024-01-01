package com.raka.ds.striver.basics;

import java.util.Scanner;

/**
 * Striver 1.1
 * There are 2 choice to choose from -
 *  - Choice 1 is to find the area of the circle with radius 'r'
 *  - Choice 2 is to find the area of the rectangle with dimensions 'l x b'
 *<p>
 * Ask the user to enter the choice then based on choice
 * ask th user to enter the radius of circle or dimensions of rectangle
 * and provide with the area of circle or rectangle
 */

public class SwitchCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choice - ");
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Rectangle");

        System.out.println("\nEnter your choice(1/2) - ");
        int choice = input.nextInt();

        switch (choice){
            case 1 -> {                 // area of circle
                System.out.println("Enter the radius of circle - ");
                double radius = input.nextDouble();

                double area = Math.PI * radius * radius;
                System.out.printf("Area of Circle - %.2f", area);
            }
            case 2 -> {                 // area of rectangle
                System.out.println("Enter the length of rectangle - ");
                double length = input.nextDouble();
                System.out.println("Enter the width of rectangle - ");
                double width = input.nextDouble();

                double area = length * width;
                System.out.printf("Area of Rectangle - %.2f", area);
            }
            default -> System.out.println("Invalid Choice");
        }
    }
}
