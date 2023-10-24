package com.raka.datastructures.array.hurdle_set_easy;

public class Array2ndLargest4 {

    public static void display2ndLargestElement(int[] array){
        int length = array.length;

        if(length < 2){
            System.out.println("Array should contain at least 2 elements");
            return;
        }

        int first, second;
        first = second = Integer.MIN_VALUE;

        for(int i = 0; i < length; i++){
            // if element is greater than first, then it is the largest element in the array till current iteration
            if(array[i] > first){
                second = first;
                first  = array[i];
            // if element is greater than second and not equal to first, then it is 2nd largest element in array till current iteration
            } else if (array[i] > second && array[i] != first) {
                second = array[i];
            }
        }

        // checks if second is actually updated and got 2nd largest element
        if(second != Integer.MIN_VALUE){
            System.out.println("Second largest element in the array - " + second);
        }
        else {
            System.out.println("Second largest element is not present in the array");
        }
    }

    public static void main(String[] args) {
        int[] array = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        int[] array = {11, 11, 11, 11, 11};
//        int[] array = {12};
        display2ndLargestElement(array);

    }
}
