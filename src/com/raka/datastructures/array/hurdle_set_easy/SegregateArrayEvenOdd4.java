package com.raka.datastructures.array.hurdle_set_easy;

/**
 * Segregate Even and Odd numbers
 * write a method that segregates even and odd numbers
 * and method should put all even numbers first, and then odd numbers
 * In the output, the order of numbers can be changed
 * <p>
 * Approach -
 * - Start two pointers from left and right of the array
 * - Create a new array of same size as given
 * - If the element at left or right is even then put it in front of the array else at the end
 * <p>
 * Time complexity - O(n/2)
 * Auxiliary space - O(n)
 */
public class SegregateArrayEvenOdd4 {

    // segregate array with even elements at front and odd elements at end
    public static void segregateEvenOdd(int[] array) {
        int length = array.length;

        int[] temp = new int[length];       // new temp array of same length
        int p = 0, q = length - 1;        // temp array variables
        int i, j;                       // original array variables

        /*
        in one iteration, we are placing two elements, one from front of array and one from end of array
        to the front of temp array (if even element) or end of temp array (if odd element)
         */
        for (i = 0, j = length - 1; i < j; i++, j--) {
            // element from the front
            if (array[i] % 2 == 0) {
                temp[p] = array[i];
                p++;
            } else {
                temp[q] = array[i];
                q--;
            }
            // element from the end
            if (array[j] % 2 == 0) {
                temp[p] = array[j];
                p++;
            } else {
                temp[q] = array[j];
                q--;
            }
        }

        // copy all the elements from temporary array back to original array
        System.arraycopy(temp, 0, array, 0, length);
    }

    // display the array to the console
    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "    ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {72, 49, 17, 48, 72, 48, 66, 62, 48, 19, 48, 71, 62, 61, 51, 82, 48, 17};

        System.out.println("Original Array - ");
        displayArray(array);

        segregateEvenOdd(array);

        System.out.println("Array after segregation - ");
        displayArray(array);
    }
}
