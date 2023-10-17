package com.raka.datastructures.array.rotation;

public class LeftRotationOneByOne {

    public static void rotateArrayLeft(int[] array) {            // rotate the array left by index 1
        int last = array[0];
        for (int i = 0; i < array.length - 1; i++) {              // shifts elements at index (1 to n-1) to (0 to n-2)
            array[i] = array[i + 1];
        }
        array[array.length - 1] = last;                           // sets the first index element at last index
    }

    public static void rotateArrayLeft(int[] array, int d) {     // rotate the array left by 'd' index
        int n = 1;
        while (n <= d) {
            int last = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = last;
            n++;
        }
    }

    public static void displayArray(int[] array) {           // display array to console
        for (int element : array) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {29, 58, 18, 19, 40, 20, 18, 40, 58, 73, 56, 69};

        int[] cloneArray = array.clone();

        System.out.println("Original array -");
        displayArray(array);

        rotateArrayLeft(array);
        System.out.println("Original array rotated left by 1 -");
        displayArray(array);

        int d = 4;
        rotateArrayLeft(cloneArray, d);
        System.out.println("Original array rotated left by " + d);
        displayArray(cloneArray);
    }
}

