package com.raka.datastructures.array.hurdle_set_easy;

/**
 * Segregate Even and Odd numbers
 * write a method that segregates even and odd numbers
 * and method should put all even numbers first, and then odd numbers
 * In the output, the order of numbers can be changed
 * <p>
 * Approach -
 * Lomuto partition
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(1)
 */

public class SegregateArrayEvenOdd {

    /*
    rearrange array with even elements at front and odd elements at end
    order of even and odd elements in itself doesn't matter
    (but it doesn't lose its order in this function)
     */
    public static void segregateEvenOdd(int[] array) {
        int length = array.length;

        int j = -1;
        // this mainly swaps all even elements to the left of the array
        for (int i = 0; i < length; i++) {
            // it either swaps even element with odd element or itself
            if (array[i] % 2 == 0) {
                j++;                // first iteration, j = 0
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }

    // display the elements of the array to the console
    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {72, 59, 29, 58, 72, 71, 49, 17, 72, 82, 49, 18, 72, 39, 49, 33};

        System.out.println("Original Array - ");
        displayArray(array);

        segregateEvenOdd(array);

        System.out.println("Array after segregating even and odd - ");
        displayArray(array);
    }
}
