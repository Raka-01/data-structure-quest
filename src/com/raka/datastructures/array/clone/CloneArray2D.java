package com.raka.datastructures.array.clone;

public class CloneArray2D {

    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4, 5}};

        int[][] cloneArray = array.clone();         // shallow clone

        System.out.println(cloneArray == array);    // false - arrays are different

        System.out.println(cloneArray[0] == array[0]);  // true - {1, 2} is a single array and reference is given to both
        System.out.println(cloneArray[1] == array[1]);  // similar as above

        System.out.println(cloneArray[0] + "      " + cloneArray[1]);   // reference is displayed
    }
}
