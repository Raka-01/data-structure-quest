package com.raka.datastructures.array.hurdle_set_easy;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Array2ndLargest5 {

    public static void display2ndLargestElement(int[] array){
        int length = array.length;

        if(length < 2){
            System.out.println("Array should contain at least 2 elements to get the 2nd largest element");
            return;
        }

        // Map is storing the elements as keys with their occurrence count as values. If same element is found, the earlier one is updated
        TreeMap<Integer, Integer> elements = new TreeMap<>(Collections.reverseOrder());     // stores in descending order
        for (int i = 0; i < length; i++){
            elements.put(array[i], elements.getOrDefault(array[i], 0)+1);
        }

        // map(elements) size shows total number of unique elements, 1 means only 1 unique element - largest element in array
        if(elements.size() == 1){
            System.out.println("Array does not contain 2nd largest element");
            return;
        }

        // keys(array values) are stored in desc order in map, iterate through to 2nd key - 2nd largest element in array
        int size = 1;
        for(Map.Entry<Integer, Integer> entry : elements.entrySet()){
            if(size == 2){
                System.out.println("2nd largest element in the array - " + entry.getKey());
                break;
            }
            size++;
        }

    }

    public static void main(String[] args) {
        int[] array = {13, 82, 40, 78, 73, 45, 26, 81, 29, 32, 44, 14, 76};
//        int[] array = {24, 24, 24, 24};
//        int[] array = {42};
        display2ndLargestElement(array);
    }
}
