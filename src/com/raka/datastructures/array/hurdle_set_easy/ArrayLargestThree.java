package com.raka.datastructures.array.hurdle_set_easy;

/**
 * Time complexity - O(n)
 */
public class ArrayLargestThree {

    public static void displayLargestThreeElements(int[] array){
        int first, second, third;
        if (array.length < 3){
            System.out.println("Array size is less than 3");
            return;
        }

        first = second = third = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            if(array[i] > first){
                third = second;
                second = first;
                first = array[i];
            } else if (array[i] > second && array[i] != first) {
                third = second;
                second = array[i];
            } else if (array[i] > third && array[i] != second) {
                third = array[i];
            }
        }
        System.out.println("Three largest element in the array - " + first + "   " + second + "   " + third);
    }

    public static void main(String[] args) {
        int[] array = {24, 53, 12, 97, 67, 94, 53, 48, 59, 60, 83, 49, 94, 68, 35, 65, 54};

        displayLargestThreeElements(array);
    }
}
