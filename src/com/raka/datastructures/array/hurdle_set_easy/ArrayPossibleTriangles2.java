package com.raka.datastructures.array.hurdle_set_easy;

import java.util.Arrays;

public class ArrayPossibleTriangles2 {

    // count the possible number of triangles taking array elements as sides
    public static int countPossibleTriangles(int[] array) {
        int length = array.length;

        Arrays.sort(array);

        int count = 0;

        for (int i = 0; i < length - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < length; j++) {

                while (k < length && array[i] + array[j] > array[k]) {
                    k++;
                }
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

/**
 * count = 0
 * i = 0 to n-2
 *      k = i+2
 *      j = i+1 to n
 *          while k < n && arr[i] + arr[j] > arr[k]  -> k++
 *          k > j  -> count = count + (k - j - 1)
 *<p>
 * eg. arr[] = {3, 6, 1, 2, 8, 4, 7}
 * n = 7
 * arr.sort = {1, 2, 3, 4, 6, 7, 8}
 * i = 0    arr[i] = 1
 *      k = i+2 = 2     arr[k] = 3
 *      j = i+1 = 1     arr[j] = 2
 *          2<7 && 1 + 2 > 3   -> false
 *          2>1  -> true  -> count = 0+(2-1-1) = 0
 *<p>
 *      j = 2       arr[j] = 3
 *          3<7 && 1+3 > 3      -> true
 *              k++ 3 then 4, then 5, then 6, then 7 then while -> false, k = 7, arr[k] = 7
 *          7>2  -> true  -> count = 0+(7-2-1) = 4
 * continue
 */