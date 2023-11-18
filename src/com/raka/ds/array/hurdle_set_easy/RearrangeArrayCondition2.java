package com.raka.ds.array.hurdle_set_easy;

/**
 * Rearrange the elements in array such that even positioned are greater than odd positioned elements
 * (Array is 1-based indexed)
 * Given an array A of n elements, sort the array according to the following relations :
 * A[i] >= A[i-1], if i is even,  ∀ 1 <= i < n
 * A[i] <= A[i-1], if i is odd ,  ∀ 1 <= i < n
 * <p>
 * Approach -
 * - traverse the array from the first element till n-1
 * - swap the element with the next one if the condition is not satisfied
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(1)
 */

public class RearrangeArrayCondition2 {

    public static void rearrangeCondition(int[] array){
        int length = array.length;

        for (int i = 1; i < length; i++){
            if(i%2 == 0){               // odd-positioned index (1-based)
                if(array[i] > array[i-1]){      // smaller element of two is placed at index i
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                }
            }
            else {                      // even-positioned index (1-based)
                if(array[i] < array[i-1]){      // larger element of two is placed at index i
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                }
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
        int[] array = {62, 39, 29, 82, 48, 12, 89, 71, 39, 89, 78, 86, 39, 67, 81, 30};

        System.out.println("Original Array - ");
        displayArray(array);

        rearrangeCondition(array);

        System.out.println("Updated array after rearranging elements according to above condition - ");
        displayArray(array);
    }
}
