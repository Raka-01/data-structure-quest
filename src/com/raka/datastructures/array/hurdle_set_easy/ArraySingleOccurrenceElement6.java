package com.raka.datastructures.array.hurdle_set_easy;

import java.util.HashMap;
import java.util.Map;

public class ArraySingleOccurrenceElement6 {

    // returns the element that has occurred only once in the array
    public static int singleOccurrenceElement(int[] array){
        Map<Integer, Integer> map = new HashMap<>();

        // iterating through each element in the array
        for (int element : array){
            int frequency = map.getOrDefault(element, 0);   // get the frequency of each element from map or else sets 0
            map.put(element, frequency+1);      // puts an element with its frequency in the array till current iteration
        }

        // iterating through each entry set of the map
        for (Map.Entry<Integer, Integer> element : map.entrySet()){
            // the first element in the map has frequency or value 1, that value is returned
            if (element.getValue() == 1){
                return element.getKey();
            }
        }

        return -1;          // if no value is returned above
    }

    public static void main(String[] args) {
        int[] array ={5, 2, 9, 1, 8, 4, 3, 8, 7, 2, 9, 4, 5, 1, 7};

        int singleElement = singleOccurrenceElement(array);

        if (singleElement != -1){
            System.out.println("Element that has occurred only once in the array = " + singleElement);
        }
        else {
            System.out.println("No element is present in the array that has occurred only once in the array");
        }
    }
}
