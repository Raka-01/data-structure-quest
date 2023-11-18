package com.raka.ds.array.hurdle_set_easy;

import java.util.Arrays;

/**
 * Count the number of possible triangles
 * Given an unsorted array of positive integers,
 * find the number of triangles that can be formed with three different array elements as three sides of triangles.
 * For a triangle to be possible from 3 values, the sum of the two values (or sides)
 * must be greater than the third value (or third side).
 *<p>
 * Approach -
 *  - sort the array in asc order
 *  - run a nested loop, outer loop runs from start to end
 *      and inner one runs from index+1 of outer loop to end
 *      counter for outer loop - i
 *      counter for inner loop - j
 *  - take another variable k = i+2
 *  - two pointers i and j, where array[i] and array[j] represent two sides of the triangles
 *  - For a fixed i and j, find the count of third sides which will satisfy the conditions of a triangle
 *      i.e find the largest value of array[k] such that array[i] + array[j] > array[k]
 *  - when we get the largest value, then the count of the third side is k – j, add it to the total count
 *<p>
 *  Time complexity - O(n^2)
 *      - it looks more because of 3 nested loops, but k is initialized only once in outermost loop
 *      - innermost loop executes at most O(n) time for every iteration of the outermost loop,
 *          because k starts from i+2 and goes up to n for all values of j
 *  Auxiliary space - O(1)
 *      - No extra space needed, so space complexity is constant
 */
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