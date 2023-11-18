package com.raka.ds.array.rotation_1d;

public class JugglingLeftRotation {

    public static void rotateArrayLeft(int[] array, int d) {
        int length = array.length;          // length of array
        d = d % length;                       // sets the number of rotations within array length

        int gcd = gcd(length, d);           // find the greatest common divisor of distance and length
        int temp, j, k;
        for (int i = 0; i < gcd; i++) {       // iterate through 1st set of array
            temp = array[i];                // stores the value at i
            j = i;                          // j sets the index where element will be stored always(current index)
            while (true) {
                k = (j + d) % length;       // k sets the index from where value will be taken to store at index j
                if (k == i) {                 // checks for if all the positions have been shifted except for last index of set
                    break;
                }
                array[j] = array[k];        // sets the value at k(next index in set) to current index of set j
                j = k;                      // changes the value of j to next index of the set
            }
            array[j] = temp;                // sets the value at last index of set to value stored in temp(value that was at i)
        }
    }

    private static int gcd(int a, int b) {      // calculates gcd of two numbers
        if (b == 0) {                         // point when one of value becomes zero(as remainder)
            return a;                       // then next element will be gcd
        } else {
            return gcd(b, a % b);         // alternatively changing a and b to divide each with the other similar to maths calculation
        }
    }

    public static void displayArray(int[] array) {      // display the array to console
        for (int element : array) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {29, 48, 28, 49, 59, 28, 21, 93, 98, 77, 43, 23, 56, 87, 93, 65, 98, 12, 32, 86};

        System.out.println("Original Array - ");
        displayArray(array);

        int d = 15;
        rotateArrayLeft(array, d);

        System.out.println("Array rotated right by " + d + " positions - ");
        displayArray(array);
    }
}
