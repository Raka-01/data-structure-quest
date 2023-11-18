package com.raka.ds.array.rotation_1d;

public class OneByOneRightRotation {

    public static void rotateArrayRight(int[] array) {           // rotate the array by 1 index
        int first = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {          // shifts elements from index (0 to length-2) to (1 to length-1) resp.
            array[i] = array[i - 1];
        }
        array[0] = first;                       // set the last index element at first index
    }

    public static void rotateArrayRight(int[] array, int d) {    // rotate the array by 'd' index
        int n = 1;
        while (n <= d) {                      // rotate the array to right d times, single element at a time
            int first = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = first;
            n++;
        }
    }

    public static void displayArray(int[] array) {       // display the array to console
        for (int element : array) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {12, 48, 57, 59, 28, 59, 49, 82, 92, 10, 49, 74, 97, 78, 23};

        int[] cloneArray = array.clone();

        System.out.println("Original Array -");
        displayArray(array);

        rotateArrayRight(array);
        System.out.println("Array rotated right by 1 index - ");
        displayArray(array);

        int d = 3;
        rotateArrayRight(cloneArray, d);
        System.out.println("Array rotated right by " + d + " index");
        displayArray(cloneArray);
    }
}

