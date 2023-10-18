package com.raka.datastructures.array.rotation;

public class ReverseLeftRotation {

    public static void rotateArrayLeft(int[] array, int d) {
        int length = array.length;

        // reversed first d elements of the array
        reverseArray(array, 0, d - 1);

        // reversed last (length-d) elements of the array
        reverseArray(array, d, length - 1);

        // finally reversed the whole array
        reverseArray(array, 0, length - 1);
    }

    private static void reverseArray(int[] array, int start, int end) {     // reverse an array from start to end index
        int temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        System.out.println("original Array -");
        displayArray(array);

        int d = 7;
        rotateArrayLeft(array, d);

        System.out.println("Array rotated by " + d + "positions");
        displayArray(array);
    }
}


/**
 * eg. arr[] = {1, 2, 3, 4, 5, 6}
 * d = 2
 * reversing first d elements ( 0 to d-1)
 * arr[] = {2, 1, 3, 4, 5, 6}
 * <p>
 * reversing rest (length-d) elements (d to length-1)
 * arr[] = {2, 1, 6, 5, 4, 3}
 * <p>
 * reversing the whole array
 * arr[] = {3, 4, 5, 6, 1, 2}
 * <p>
 * hence, we got array rotated left by 2 positions
 */