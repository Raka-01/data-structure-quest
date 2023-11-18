package com.raka.ds.array.basics;

import java.util.*;

public class SubArray {

    // stores the sub-arrays to the map
    public static Map<String, List<Integer>> generateSubArrays(int[] array){
        int length = array.length;
        Map<String, List<Integer>> subArrays = new LinkedHashMap<>();

        for (int i = 0; i < length; i++){           // sets the start index of sub-array
            for (int j = i; j < length; j++){       // sets the end-index of sub-array
                List<Integer> subArray = new ArrayList<>();         // one list will store elements of one sub-array
                String key = "[" + i + " - " + j + "]";     // key is the key that will be stored with each sub-array in map
                for(int k = i; k <= j; k++){            // k decides the range of the sub-array from i to j
                    subArray.add(array[k]);
                }
                subArrays.put(key, subArray);           // list is added to map
            }
        }

        return subArrays;
    }

    /*
    only display the sub-arrays to the console
    time complexity - O(n^3)
     */
    public static void displaySubArrays(int[] array){
        int length = array.length;

        System.out.println("Sub-arrays - ");
        for (int i = 0; i < length; i++){               // i sets the start of the sub-array
            for (int j = i; j < length; j++){           // j sets the end of the sub-array
                System.out.print("Sub-array " + i + " to " + j + " -   ");
                for(int k = i; k <= j; k++){            // k displays the sub-array from i to j
                    System.out.print(array[k] + "    ");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        int[] array = {72, 49, 82, 49, 81, 39, 19, 81, 93, 81, 39};

        // only display the sub-arrays of the array to the console
        displaySubArrays(array);

        // stores the sub-arrays in a map data structure
        Map<String, List<Integer>> subArrays = generateSubArrays(array);
        System.out.println("Sub-arrays - ");
        for (Map.Entry<String, List<Integer>> entry : subArrays.entrySet()){
            System.out.println(entry);
        }
    }
}
