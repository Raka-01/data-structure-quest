package com.raka.datastructures.array.basics;

import java.util.Scanner;

public class TraverseArray2 {

    public static void main(String[] args) {
        int[] array;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of array - ");
        int size = input.nextInt();

        array = new int[size];

        System.out.println("Enter elements -");
        for (int i = 0; i < size; i++){
            System.out.println("Index " + i + " -  ");
            array[i] = input.nextInt();
        }

        System.out.println("Traversing through the array - ");
        for (int i = 0; i < size; i++){
            System.out.println("Element at index " + i + " -  " + array[i]);
        }
    }
}