package com.raka.ds.striver.basics;

/**
 * Striver 1.6
 * Given an array, we have found the number of occurrences of each element in the array.
 */

public class FrequencyOfElement {

    public static void displayFrequencies(int[] array){
        int length = array.length;

        System.out.println("Frequencies of elements - ");
        for (int i = 0; i < length; i++){
            if (array[i] != Integer.MIN_VALUE){
                int element = array[i];
                int count = 0;
                for (int j = i; j < length; j++){
                    if (element == array[j]){
                        count++;
                        array[j] = Integer.MIN_VALUE;
                    }
                }
                System.out.println(element + " -> " + count);
            }

        }
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 7, 6, 5, 8, 4, 3, 7, 3, 2, 5, 5, 2, 1, 6, 2, 7};

        displayFrequencies(array);
    }
}
