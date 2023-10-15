package com.raka.datastructures.array.basics;

public class ArrayException {

    public static void main(String[] args) {
        int[] names = new int[5];

        // thows exception - ArrayIndexOutOfBoundsException
        System.out.println(names[5]);
    }
}
