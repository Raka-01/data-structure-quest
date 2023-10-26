package com.raka.datastructures.array.hurdle_set_easy;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Time Complexity - O(nlogn)
 * Auxiliary Space - O(n)       priority queue
 */

public class Array2ndLargest6 {

    public static void display2ndLargestElement(int[] array){
        int length = array.length;

        if(length < 2){
            System.out.println("Array should contain at least 2 elements");
            return;
        }

        // stores unique elements(remove duplicates) and as set, in descending order
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < length; i++){
            if(!queue.contains(array[i])){      // removing duplicate elements while adding to the queue
                queue.add(array[i]);
            }
        }

        queue.poll();       // removes the head element(largest element) from queue

        if(queue.size() == 0){  // after removing largest element, size 0 means queue is null, no 2nd largest element
            System.out.println("There is no 2nd largest element in the array");
        }
        else {
            System.out.println("2nd largest element in the array - " + queue.peek());
        }

    }

    public static void main(String[] args) {
        int[] array = {72, 49, 71, 38, 94, 81, 39, 48, 82, 49, 38, 94, 78, 48};
//        int[] array = {72, 72, 72, 72};
//        int[] array = {28};

        display2ndLargestElement(array);

    }
}
