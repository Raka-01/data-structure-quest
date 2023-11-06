package com.raka.datastructures.array.hurdle_set_easy;

import java.util.*;

/**
 * Count the number of possible triangles
 * Given an unsorted array of positive integers,
 * find the number of triangles that can be formed with three different array elements as three sides of triangles.
 * For a triangle to be possible from 3 values, the sum of the two values (or sides)
 * must be greater than the third value (or third side).
 * <p>
 * Approach - Brute Force Method
 * - Run three nested loops, each loop starting from the index of the previous loop to the end of the array
 * i.e. run first loop from 0 to n, loop j from i to n, and k from j to n
 * - Check if array[i] + array[j] > array[k], i.e. sum of two sides is greater than the third
 * - Check condition 2 for all combinations of sides by interchanging i, j, k
 * - If all three conditions match, then increase the count
 * <p>
 * Time complexity - O(n^3)
 * Auxiliary space - O(1)
 */

public class ArrayPossibleTriangles {

    // find and store all the possible triangles from the elements of array as sides
    public static Map<String, List<Integer>> findTriangles(int[] array) {
        Map<String, List<Integer>> triangles = new LinkedHashMap<>();   // map that will store the sides of possible triangle
        int length = array.length;
        int p = 1;                      // it counts the total number of possible triangles

        for (int i = 0; i < length; i++) {           // index of array element as side one
            for (int j = i; j < length; j++) {           // index of array element as side two
                for (int k = j; k < array.length; k++) {    // index of array element as side three
                    /*
                    this flag will only be tru if all the three conditions will be true
                    1. side1 + side2 > side3
                    2. side1 + side3 > side2
                    3. side2 + side3 > side1
                     */
                    boolean flag = (array[i] + array[j] > array[k]) &&
                            (array[i] + array[k] > array[j]) &&
                            (array[j] + array[k] > array[i]);
                    if (flag) {
                        List<Integer> sides = new ArrayList<>(Arrays.asList(array[i], array[j], array[k])); // list of the sides
                        Collections.sort(sides);
                        boolean isAlreadyAdded = false;     // check if the sides are already present in the map
                        for (List<Integer> triangle : triangles.values()) {
                            if (triangle.equals(sides)) {
                                isAlreadyAdded = true;
                                break;
                            }
                        }
                        if (!isAlreadyAdded) {
                            triangles.put("Triangle-" + p, sides);      // sides are added to map if they are not already present
                            p++;
                        }
                    }
                }
            }
        }
        return triangles;
    }

    // display the array to the console
    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "    ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {8, 4, 2, 3, 9, 1, 7};

        System.out.println("Array of elements - ");
        displayArray(array);

        Map<String, List<Integer>> triangles = findTriangles(array);
        System.out.println("Total number of possible triangles with array elements as sides - " + triangles.size());

        System.out.println("Triangles - ");
        triangles.entrySet().forEach(System.out::println);      // each entry set(possible triangle) of map is displayed to console

    }
}
