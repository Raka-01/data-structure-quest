package com.raka.ds.array.hurdle_set_easy;

import java.util.Arrays;

/**
 * Count the number of possible triangles
 * Given an unsorted array of positive integers,
 * find the number of triangles that can be formed with three different array elements as three sides of triangles.
 * For a triangle to be possible from 3 values, the sum of the two values (or sides)
 * must be greater than the third value (or third side).
 *
 * Approach -
 *  - sort the array
 *  - take 3 variables - l = start, r = end, i = element starting from end of array
 *  - traverse the array from end(n-1) to 1
 *  - for each iteration, keep value of l = 0 and r = i-1
 *  - since array is sorted, if a triangle is formed with arr[l] and arr[r]
 *      then triangles can also be formed from a[l+1], a[l+2]…..a[r-1], arr[r] and a[i]
 *      calculated using (r-l) then decrement r and continue till l < r
 *  - if a triangle is not formed with arr[l] and arr[r] then increment l and continue till l < r
 *  - hence, overall complexity of iterating through all array elements reduces
 *
 *  Time complexity - O(n^2)
 *  Auxiliary space - O(1)
 */

public class ArrayPossibleTriangles3 {

    // count the total number of possible triangles taking array elements as sides
    public static int countPossibleTriangles(int[] array){
        Arrays.sort(array);
        int length = array.length;
        int count = 0;          // keeps the count of total possible triangles

        for (int i = length-1; i >= 1; i--){
            int l = 0, r = i - 1;
            while (l < r){
                if (array[l] + array[r] > array[i]){
                    /*
                    If it is possible with a[l], a[r] and a[i]
                    then it is also possible with a[l+1]..a[r-1], a[r] and a[i]
                     */
                    count = count + (r-l);

                    // then checks for other possible solutions
                    r--;
                }
                else {
                    // if not possible, check for higher values of l
                    l++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] array = {7, 4, 2, 8, 6, 9, 1};

        System.out.println("Elements of the array - ");
        for (int element : array){
            System.out.print(element + "    ");
        }

        int count = countPossibleTriangles(array);

        System.out.printf("\nTotal number of possible triangles  - %d", count);
    }
}
