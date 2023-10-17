package com.raka.datastructures.array.searching;

import java.util.Scanner;

public class JumpSearch {

    public static int searchElement(int[] array, int key){
        int length = array.length;
        // current block is set (prev to step = 0 to sqrt(length) index) with the help of below 2 steps
        int step = (int)Math.sqrt(length);          // typecasting the double value obtained in sqrt to store the integer part
        int prev = 0;

        // Math.min(step, length) is to handle the edge case when array length is smaller than calculated step size
        while(array[Math.min(step, length) -1] < key){      // -1 converts the current block size(one-based) into index of zero-based array
            // updating step and prev sets the next block to search for
            prev = step;
            step = step + (int)Math.sqrt(length);

            if(prev >= length){             // checking if key is greater than last block elements as in while condition
                return -1;
            }
        }               // this sets the search space to specific block where key can be found

        // either this sets the prev index to exactly the element to just less than that
        while(array[prev] < key){           // a linear search while array element is less than key
            prev++;                         // this is setting the index to 1st element index to start search
            if(prev == Math.min(step, length)){         // if prev index reaches to next block starting index, return -1
                return -1;
            }
        }

        if(array[prev] == key){         // if prev index element is equal to key
            return prev;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {9, 10, 18, 21, 22, 24, 27, 33, 36, 37, 41, 44, 45, 46, 49, 55, 59, 61, 64, 67, 71, 81, 88, 93};

        System.out.println("Elements of the array -");
        for (int element : array){
            System.out.print(element + "   ");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the element to search -");
        int key = input.nextInt();

        int index = searchElement(array, key);
        if(index == -1){
            System.out.println("Element Not Found");
        }
        else {
            System.out.println("Element Found At Index " + index);
        }


    }
}
