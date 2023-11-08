package com.raka.datastructures.array.hurdle_set_easy;

import java.util.Arrays;

public class ArrayPossibleTriangles2 {

    // count the possible number of triangles taking array elements as sides
    public static int countPossibleTriangles(int[] array) {
        int length = array.length;

        Arrays.sort(array);         // array is sorted to efficiently count possible triangles

        int count = 0;              // keeps track of possible triangles

        // length-2 is to leave room for other 2 pointers j and k
        for (int i = 0; i < length - 2; i++) {
            int k = i + 2;
            // inner loop is responsible for comparing two elements of the array
            for (int j = i + 1; j < length; j++) {

                /*
                  Triangle Inequality Check -
                  while loop iterates over k and checks if sum of elements at indices j and k
                  is greater that element at index k
                  If this condition is met,
                  it means that you have found a valid combination of sides for a triangle,
                  and k is incremented to consider other possibilities (between j and k)
                 */
                while (k < length && array[i] + array[j] > array[k]) {
                    k++;
                }
                /*
                  Count Valid Triangles
                  After the while loop, if k is greater than j,
                  it means that there were valid combinations,
                  and the count of triangles is incremented by k - j - 1.
                  The -1 is needed to avoid counting the element at index k itself
                 */
                if (k > j) {
                    count = count + (k - j - 1);
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] array = {3, 6, 1, 2, 8, 4, 7};

        int count = countPossibleTriangles(array);
        System.out.println("Total number of possible triangles - " + count);
    }
}