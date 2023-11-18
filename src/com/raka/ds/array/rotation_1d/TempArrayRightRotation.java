package com.raka.ds.array.rotation_1d;

public class TempArrayRightRotation {

    // rotate the original array to the right by d positions
    public static void rotateArrayRight(int[] array, int d) {
        int length = array.length;              // length of original array

        d = d % length;                        // if number of positions to rotate exceeds length of array

        // copy the elements from index length-d of original array to start index of temporary array
        int[] temp = new int[length];           // temporary array
        int j = length - d;                       // sets the index of original array
        for (int i = 0; i < d; i++) {             // sets index of temporary array
            temp[i] = array[j];
            j++;
        }

        // copy the rest of the elements
        j = 0;
        for (int i = d; i < length; i++) {
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

        int d = 20;
        rotateArrayRight(array, d);

        System.out.println("Array rotated right by " + d + " positions - ");
        displayArray(array);
    }
}
