package com.raka.datastructures.array.hurdle_set_easy;

import java.util.Arrays;

public class ArrayLargestThree2 {

    public static void displayLargestThreeElements(int[] array){
        Arrays.sort(array);             // uses dual-pivot sorting algorithm, time complexity - O(nlogn)

        int length = array.length;
        int duplicate = 0, count = 1;

        System.out.println("Three Largest elements in the array - ");
        for(int i = 1; i <= array.length; i++){
            if(count < 4){                      // checks to execute for only 3 different elements
                if(duplicate != array[length - i]){         // checks if current element is duplicate of its previous one (from last)
                    System.out.print(array[length - i] + "    ");
                    duplicate = array[length - i];
                    count++;
                }
            }
            else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {42, 49, 27, 58, 73, 58, 97, 97, 28, 58, 67, 83, 75, 89, 29, 89, 97, 88};

        displayLargestThreeElements(array);
    }
}
