package com.raka.datastructures.array.hurdle_set_easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Array2ndLargest3 {

    public static void display2ndLargestElement(int[] array){

        if(array.length < 2){               // catches if array length is less than 2
            System.out.println("Array should contain atleast 2 elements");
            return;
        }
        Set<Integer> set = new TreeSet<Integer>();
        for(int i = 0; i < array.length; i++){          // added array's elements in sorted order & also removes duplicates
            set.add(array[i]);
        }

        List<Integer> list = new ArrayList<Integer>();
        for(int element : set){                 // now sorted elements without duplicates are added to list
            list.add(element);
        }

        set.clear();

        int size = list.size();
        if(size > 1){           // now if different elements were present, then size of list will be greater than 1
            System.out.println("Second largest element in the array - " + list.get(size-2));        // catch the last 2nd element
        }
        else {
            System.out.println("There is no 2nd largest element in the array");
        }

    }

    public static void main(String[] args) {
        int[] array = {32, 58, 73, 58, 20, 91, 49, 21, 91, 48, 18, 49, 91, 47, 82, 10, 28, 49};
//        int[] array = {23, 23, 23, 23, 23};
        display2ndLargestElement(array);
    }
}
