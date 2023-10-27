package com.raka.datastructures.array.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OperationsSortedArray {

    // search an element in the array and return its index (using binary search)
    public static int searchElement(int[] array, int element){
        int length = array.length;

        int lb = 0;
        int ub = length-1;
        int mid;
        while(lb < ub){
            mid = lb + (ub - lb)/2;
            if(array[mid] == element){
                return mid;
            } else if (array[mid] < element) {
                lb = mid + 1;
            } else if (array[mid] > element) {
                ub = mid - 1;
            }
        }

        return -1;
    }

    // insert an element into the array in a sorted manner
    public static int[] insertElement(int[] array, int element){
        int length = array.length;
        int[] temp = new int[length+1];         // created a temporary array with length+1 of the original array

        // find the index at which the element will be inserted into the array
        int index = 0;
        for (int value : array){
            if(value > element){
                break;
            }
            index++;
        }

        // copy all elements from original array to temp array from index start to end
        for (int i = 0; i < index; i++){
            temp[i] = array[i];
        }
        // copy rest elements of original array from index to end into temporary array from index+1 to end
        for(int i = index+1; i < temp.length; i++){
            temp[i] = array[i-1];
        }
        temp[index] = element;      // stores the element into its calculated index
        System.out.println("Element inserted successfully");

        return temp;        // returning temp array replacing original array
    }

    // delete the first occurrence of element from the array
    public static int[] deleteElement(int[] array, int element){
        int length = array.length;
        int[] temp = new int[length-1];     // creates a temporary array with size length-1
        int index = -1;

        // calculating the index of element from the array using binary search
        int lb = 0;
        int ub = length-1;
        int mid;
        while(lb <= ub){
            mid = lb + (ub-lb)/2;
            if(array[mid] == element){
                index = mid;
                break;
            } else if (array[mid] < element) {
                lb = mid + 1;
            } else if (array[mid] > element) {
                ub = mid - 1;
            }
        }

        // if index is updated from -1 means element is present in array and index stores its index
        if(index != -1){
            for(int i = 0; i < index; i++){
                temp[i] = array[i];
            }
            for(int i = index; i < temp.length; i++){
                temp[i] = array[i+1];
            }
            System.out.println("Element deleted successfully");
            return temp;        // returns temporary array replacing original array
        }
        else {
            System.out.println("Element not present in array");
            return array;
        }
    }

    // delete all occurrence of given element from the array
    public static int[] deleteAllOccurrences(int[] array, int element){
        int length = array.length;

        // deleting all occurrences of element from the array
        for(int i = 0; i < length; i++){
            if(array[i] == element){
                // overrides current element with its next element in array
                for(int j = i; j < length-1; j++){
                    array[j] = array[j+1];
                }
                i--;        // array is sorted so decrementing it as maybe the next element will be also that element
                length--;   // length of array is reduced as an element is found and deleted
            }
        }

        // new temporary array created with updated length of original array and all elements are copied into it from original array
        int[] temp = new int[length];
        for(int i = 0; i < length; i++){
            temp[i] = array[i];
        }
        System.out.println("All the occurrences of element deleted successfully");

        return temp;        // returning temporary array replacing original array
    }

    // display the array to console
    public static void displayArray(int[] array){
        if(array.length > 0){
            System.out.println("Elements of array - ");
            for (int element : array) {
                System.out.print(element + "    ");
            }
            System.out.println();
        }
        else {
            System.out.println("Array is empty");
        }
    }

    // asks the user if he wants to do another operation
    public static boolean anotherOperation(){
        boolean validInput = false;         // checks for user input if it's of the required type or not(default = false)
        boolean result = false;     // default next operation is set to false
        while(!validInput){
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Do you want to do another operation - (true/false)");
                result = input.nextBoolean();
                validInput = true;          // if required input type is entered then valid input is updated to true resulting escaping while loop
            } catch (InputMismatchException e){
                System.out.println("Invalid Input");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[0];
        int operation = -1;         // stores operation number and do operation accordingly
        boolean flag = true;        // stores boolean for users input if he wants to do another operation
        boolean validInput;         // checks for if user has entered the required input type
        int element = 0;            // stores the element that will be passed as argument to methods

        System.out.println("Operations in a Sorted array:");
        System.out.println("1. Find index of an element");
        System.out.println("2. Insert an element");
        System.out.println("3. Delete an element");
        System.out.println("4. Delete all occurrence of an element");
        System.out.println("5. Display the elements to console");

        // continue doing operations according to operation number and ask for next operation till user enters false
        do {
            validInput = false;
            while (!validInput){
                try{
                    System.out.println("Enter the operation number - ");
                    Scanner input = new Scanner(System.in);
                    operation = input.nextInt();
                    validInput = true;              // when this statement is executed means input is of correct type
                } catch (InputMismatchException e){
                    System.out.println("Invalid Input");
                }
            }
            switch (operation) {
                // Search Operation - search an element in the array
                case 1 -> {
                    if (array.length > 0) {
                        validInput = false;
                        while (!validInput) {
                            try {
                                System.out.println("Enter the element to search - ");
                                Scanner input = new Scanner(System.in);
                                element = input.nextInt();
                                validInput = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid Input");
                            }
                        }
                        int index = searchElement(array, element);      // stores the index returned by the method
                        if (index == -1) {
                            System.out.println("Element not found");
                        } else {
                            System.out.println("Element present at index " + index + " of sorted array");
                        }
                    } else {
                        System.out.println("Array is empty");
                    }
                    flag = anotherOperation();      // asks for another operation
                }
                // Insert Operation - insert an element into the array
                case 2 -> {
                    validInput = false;
                    while (!validInput) {
                        try {
                            System.out.println("Enter the element to insert - ");
                            Scanner input = new Scanner(System.in);
                            element = input.nextInt();
                            validInput = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input");
                        }
                    }
                    array = insertElement(array, element);      // stores the array returned (temp array)
                    flag = anotherOperation();
                }
                // Delete Operation - delete the first occurrence of given element from the array
                case 3 -> {
                    if (array.length > 0) {
                        validInput = false;
                        while (!validInput) {
                            try {
                                System.out.println("Enter the element to delete - ");
                                Scanner input = new Scanner(System.in);
                                element = input.nextInt();
                                validInput = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid Input");
                            }
                        }
                        array = deleteElement(array, element);
                    } else {
                        System.out.println("Array is empty");
                    }
                    flag = anotherOperation();
                }
                // Delete Operation - delete all the occurrence of given element from the array
                case 4 -> {
                    if (array.length > 0) {
                        validInput = false;
                        while (!validInput) {
                            try {
                                System.out.println("Enter the element to delete all occurrences - ");
                                Scanner input = new Scanner(System.in);
                                element = input.nextInt();
                                validInput = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid Input");
                            }
                        }
                        array = deleteAllOccurrences(array, element);
                    } else {
                        System.out.println("Array is empty");
                    }
                    flag = anotherOperation();
                }
                // display the array to console
                case 5 -> {
                    displayArray(array);
                    flag = anotherOperation();
                }
                default -> {
                    System.out.println("Invalid Operation Number");
                    flag = anotherOperation();
                }
            }
        } while (flag);
    }
}
