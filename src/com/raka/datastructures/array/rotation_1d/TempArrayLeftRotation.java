package com.raka.datastructures.array.rotation_1d;

public class TempArrayLeftRotation {

    public static void rotateArrayLeft(int[] array, int d) {         // rotate the array left by d positions
        int length = array.length;                  // length of array

        d = d % length;                            // if number of rotations exceeded the length

        // copy the elements left of index d of original array to index length-d of temporary array
        int[] temp = new int[length];               // initialize a temporary array with array length
        int j = 0;                                  // sets original array index
        for (int i = length - d; i < length; i++) {     // sets temporary array index
            temp[i] = array[j];
            j++;
        }

        // copy the rest elements of original array to temporary array
        j = d;                                      // sets original array index for remaining elements
        for (int i = 0; i < length - d; i++) {          // sets temporary array index for copying remaining elements
            temp[i] = array[j];
            j++;
        }

        // copy the temporary array to original array
        for (int i = 0; i < length; i++) {
            array[i] = temp[i];
        }
    }

    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {26, 48, 71, 49, 17, 49, 61, 12, 42, 89, 78, 87, 34, 56, 74};

        System.out.println("Original Array - ");
        displayArray(array);

        int d = 8;
        rotateArrayLeft(array, d);

        System.out.println("Array rotated by " + d + " positions - ");
        displayArray(array);
    }
}
