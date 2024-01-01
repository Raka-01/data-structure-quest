package com.raka.ds.striver.basics;

import java.util.Scanner;

/**
 * Striver 1.1
 * Data type refers to the type of value a variable has and the way the computer interprets it.
 * <p>
 * Each data type has a different size.
 * Following are the data types avaiable -
 * - Integer
 * - Float
 * - Double
 * - Long
 * - String
 * - Character
 * - Boolean
 * <p>
 * Display the size of the data type given by the user
 */

public class DataType {

    // display the size of a given data type in bits
    public static void displayDataSize(String dataType) {
        if (dataType.equalsIgnoreCase("String")) {
            System.out.print("Size Not Fixed");
        } else if (dataType.equalsIgnoreCase("Integer") || dataType.equalsIgnoreCase("int")) {
            System.out.print("Size in bits - " + Integer.SIZE);
        } else if (dataType.equalsIgnoreCase("Float")) {
            System.out.print("Size in bits - " + Float.SIZE);
        } else if (dataType.equalsIgnoreCase("Double")) {
            System.out.print("Size in bits - " + Double.SIZE);
        } else if (dataType.equalsIgnoreCase("Long")) {
            System.out.print("Size in bits - " + Long.SIZE);
        } else if (dataType.equalsIgnoreCase("Character") || dataType.equalsIgnoreCase("char")) {
            System.out.print("Size in bits - " + Character.SIZE);
        } else if (dataType.equalsIgnoreCase("Boolean")) {
            System.out.print("Size in bits - " + 8);
        } else {
            System.out.print("Invalid data type");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Data Types available - Integer, Float, Double, String, Character, Boolean");
        System.out.println("Enter a data type - ");
        String dataType = input.next();

        displayDataSize(dataType);
    }
}
