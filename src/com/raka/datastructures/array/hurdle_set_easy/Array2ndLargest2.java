package com.raka.datastructures.array.hurdle_set_easy;

public class Array2ndLargest2 {

    public static void display2ndLargestElement(int[] array){
        int length = array.length;

        if(length < 2){         // Only array with size>=2 can contain 2nd largest element
            System.out.println("Array should contain atleast 2 elements");
            return;
        }

        int largest, second;
        largest = second = Integer.MIN_VALUE;       // largest and second initialized with Integer minimum value

        for(int i = 0; i < length; i++){
            if(array[i] > largest){
                largest = array[i];             // finds the largest element in the array
            }
        }

        for(int i = 0; i < array.length; i++){
            if(array[i] != largest){
                second = Math.max(second, array[i]);        // find the largest element not equal to largest element - 2nd largest
            }
        }

        if(second == Integer.MIN_VALUE){        // no element is assigned to second i.e. 2nd largest element is not present
            System.out.println("There is no 2nd largest element in the array");
        }
        else {
            System.out.println("Second largest element in the array - " + second);
        }
    }

    public static void main(String[] args) {
        int[] array = {43, 59, 93, 28, 29, 58, 93, 93, 27, 58, 68, 82, 45, 59};
//        int[] array = {42, 42, 42, 42, 42};           // displays no 2nd largest element present in the array
//        int[] array = {43};                       // displays array should contain atleast 2 elements
        display2ndLargestElement(array);
    }
}
