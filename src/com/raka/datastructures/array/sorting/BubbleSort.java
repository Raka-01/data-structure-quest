package com.raka.datastructures.array.sorting;

public class BubbleSort {

    // sort the array using bubble sort
    public static void bubbleSort(int[] array){
        int length = array.length;
        /*
        temporary variable used to swap elements in array,
        good to declare here, it saves time of creation again & again,
        but do use memory more than if declared inside loop
         */
        int temp;

        // in the outside loop, iterating through each element of the array
        for(int i = 0; i < length-1; i++){
            // in inside loop, checking if adjacent elements are in correct order
            for (int j = 0; j < length-1-i; j++){       // length-1-i, because in each iteration, 1 element is sorted
                // swaps the elements if they are in wrong order
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    // display the array to console
    public static void displayArray(int[] array){
        for(int element : array){
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {24, 81, 82, 19, 39, 48, 92, 40, 19, 39, 81, 49, 50, 20, 72, 67, 41, 69, 14};

        System.out.println("original Array - ");
        displayArray(array);

        bubbleSort(array);

        System.out.println("Sorted Array - ");
        displayArray(array);
    }
}