package com.raka.datastructures.array.searching;

import java.util.Scanner;

public class TernarySearchRecursive {
    public static int searchElement(int[] array, int lb, int ub, int key){

        if(lb <= ub){
            int mid1 = lb + (ub - lb)/3;            // 1st middle index
            int mid2 = ub - (ub - lb)/3;            // 2nd middle index

            if(array[mid1] == key){
                return mid1;
            }else if(array[mid2] == key){
                return  mid2;
            } else if (array[mid1] > key ) {        // sets the search space to 1st one-third part
                return searchElement(array, lb, mid1 - 1, key);
            } else if (array[mid2] < key) {         // sets the search space to 3rd(last) one-third part
                return searchElement(array, mid2 + 1, ub, key);
            }else {                                 // sets the search space to 2nd one-third part
                return searchElement(array, mid1 + 1, mid2 - 1, key);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {12, 19, 22, 23, 25, 27, 33, 38, 42, 47, 50, 51, 59, 66};

        System.out.println("Elements in the array - ");
        for (int element : array){                      // displaying the array to console
            System.out.print(element + "   ");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the element to search - ");
        int key = input.nextInt();                      // element to search in the array

        int index = searchElement(array, 0, array.length-1, key);
        if(index == -1){
            System.out.println("Element Not Found");
        }
        else {
            System.out.println("Element Found At Index " + index);
        }
    }
}

/**
 * Time complexity - O(log n base 3)
 * Space complexity - O(log n base 3)
 */