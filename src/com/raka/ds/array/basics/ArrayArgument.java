package com.raka.ds.array.basics;

public class ArrayArgument {

    public static void sum(int[] array) {        // method accepting an array as argument
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Sum of numbers in the array - " + sum);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 34, 28, 34, 53};

        sum(numbers);       // passing an array to the method
    }
}
