package com.raka.ds.array.hurdle_set_easy;

/**
 * Segregate Even and Odd numbers
 * write a method that segregates even and odd numbers
 * and method should put all even numbers first, and then odd numbers
 * In the output, the order of numbers can be changed
 * <p>
 * Approach -
 * - initialize two index variables - left = 0, right = n-1
 * - keep incrementing left index until we see an odd number
 * - keep decrementing right index until we see an even number
 * - if left < right then swap arr[left] and arr[right]
 * <p>
 * Time Complexity: O(n)
 * Auxiliary Space: O(1)
 */

public class SegregateArrayEvenOdd2 {

    // rearrange array to put even elements at left and odd elements at right
    public static void segregateEvenOdd(int[] array) {
        int length = array.length;

        int left = 0, right = length - 1;

        while (left < right) {           // keeps left index from crossing right index

            // increment left till we are getting even element - sets left to index of odd element
            while (array[left] % 2 == 0 && left < right) {     // 2nd condition keeps left in array's range
                left++;
            }

            // decrement right till we are getting odd element - sets right to index of even element
            while (array[right] % 2 == 1 && left < right) {    // 2nd condition keeps right in array's range
                right--;
            }

            // swaps the odd element at left and even element at right
            if (left < right) {          // finally check if left index is less than right
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;         // incremented to find next odd element
                right--;        // decremented to find next even element
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
        int[] array = {74, 29, 45, 29, 49, 83, 56, 12, 81, 89, 74, 17, 88, 59, 72, 59};

        System.out.println("Original Array - ");
        displayArray(array);

        segregateEvenOdd(array);

        System.out.println("Array after segregating even and odd - ");
        displayArray(array);
    }
}
