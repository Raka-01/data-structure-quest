package com.raka.datastructures.array.clone;

public class CloneArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};

        int[] cloneArray = array.clone();               // deep clone

        System.out.println(array == cloneArray);        // references are different i.e. 2 different arrays

        // displaying elements of clone array
        System.out.println("Clone Array -");
        for (int number : cloneArray) {
            System.out.print(number + "    ");
        }
    }
}
