package com.raka.ds.array.basics;

public class TraverseArray {

    public static void main(String[] args) {
        int[] array = {23, 17, 38, 81, 39, 10, 18, 47, 91, 39};

        System.out.println("Traversing through the array");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + " -  " + array[i]);
        }

    }
}
