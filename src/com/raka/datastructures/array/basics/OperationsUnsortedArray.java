package com.raka.datastructures.array.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OperationsUnsortedArray {

    // search for first occurrence of specified element and return its index
    public static int searchElement(int[] array, int key){
        for(int i = 0; i < array.length; i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }

    // insert the specified element at the end of the array
    public static int[] insertElement(int[] array, int element){
        int length = array.length;
        int[] temp = new int[length+1];     // creates a new array with one size more than provided array

        for(int i = 0; i < length; i++){    // copy all the elements of array to temporary array
            temp[i] = array[i];
        }
        temp[temp.length-1] = element;      // set the given element at the end of temp array

        System.out.println("Element inserted successfully");
        return temp;                        // return the temporary array, it replaces the original array
    }

    // insert the specified element at the specified index(0-based) of the array
    public static int[] insertElement(int[] array, int element, int index){
        int length = array.length;
        int[] temp = new int[length+1];     // creates a new array with one size more than the given array

        for (int i = 0; i < index; i++){    // copy all the elements of original array to temp array till the given index-1 from start
            temp[i] = array[i];
        }

        for(int i = index+1; i < temp.length; i++){ // copy the elements from index till last to temp array from the last
            temp[i] = array[i-1];
        }
        temp[index] = element;          // put the given element in the specific index(empty cell) of temp array
        System.out.println("Element inserted successfully at specified index");

        return temp;                    // temporary array is returned replacing original array
    }

    // delete the first occurrence of given element from the array
    public static int[] deleteElement(int[] array, int element){
        int length = array.length;

        for(int i = 0; i < length; i++){
            if(array[i] == element){        // increment the index till the given element is not found
                length--;               // once element is found, decrement the length to 1 less than original length of array
                for(int j = i; j < length; j++){    // from one index more than index where element is found, copy element to current index from its next index
                    array[j] = array[j+1];
                }
                break;              // break the loop of finding element as we have found one match
            }
        }
        int[] temp = new int[length];       // create a temp array of updated array length
        for(int i = 0; i < length; i++){    // copy all elements from original array to temp array
            temp[i] = array[i];
        }
        System.out.println("Element deleted successfully");
        return temp;        // temp array is returned replacing the original array
    }

    // delete all occurrence of given element from the array
    public static int[] deleteAllOccurrences(int[] array, int element){
        int length = array.length;

        // same process as delete element method but it will keep on finding given element and deleting them till all are not found
        for(int i = 0; i < length; i++){
            if(array[i] == element){
                length--;               // length of array is updated to one less
                for(int j = i; j < length; j++){
                    array[j] = array[j+1];
                }
            }                       // break is not used, so it will keep on finding the next element after finding one
        }
        int[] temp = new int[length];           // temporary array created with updated length
        for(int i = 0; i < length; i++){        // copy all element from original array to temporary array
            temp[i] = array[i];
        }
        System.out.println("All occurrences of element deleted successfully");
        return temp;                    // temporary array is returned replacing original array

    }

    // asks the user if he wants to do another operation after doing an operation
    public static boolean anotherOperation(){
        boolean validInput = false;         // checks for user input if it's of the required type or not(default = false)
        boolean result = false;     // default next operation is set to false
        while(validInput != true){
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

    // display the array to console that is being structured by the user
    public static void displayArray(int[] array){
        if(array.length > 0){
            System.out.println("Updated array -");
            for(int element : array){
                System.out.print(element + "   ");
            }
            System.out.println();
        }
        else {
            System.out.println("Array is empty");
        }
    }

    public static void main(String[] args) {
        int[] array = new int[0];
        boolean flag = true;            // checks for if user wants to do another operation

        // list of operation with operation number
        System.out.println("1. Find index of an element");
        System.out.println("2. Insert an element in last of array");
        System.out.println("3. Insert an element at specific index");
        System.out.println("4. Delete first occurrence of an element");
        System.out.println("5. Delete all occurrence of an element");
        System.out.println("6. Display the array");

        int operation = 0;
        int element = 0, index = -1;
        boolean validInput = false;     // checks for user input is of required type or not
        do {
            while (validInput == false){        // keeps on iterating till user enter a valid input
                try {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter your operation number -");        // asks for operation number
                    operation = input.nextInt();
                    validInput = true;
                } catch (InputMismatchException e){
                    System.out.println("Invalid input.");
                }
            }
            validInput = false;     // valid input is used by all cases/operation so it must be false before starting an operation
            switch(operation){
                // Search operation - search for an element in the array
                case 1 :
                    if(array.length > 0){
                        while(validInput == false){
                            try {
                                Scanner input = new Scanner(System.in);
                                System.out.println("Enter an integer to search -");
                                element = input.nextInt();
                                validInput = true;
                            } catch(InputMismatchException e){
                                System.out.println("Invalid Input");
                            }
                        }
                        validInput = false;
                        index = searchElement(array, element);      // stores the index returned by the method
                        if(index == -1){
                            System.out.println("Element Not Found");
                        }
                        else {
                            System.out.println("Element Found At Index " + index);
                        }
                    }
                    else {
                        System.out.println("Array is empty");
                    }
                    flag = anotherOperation();          // asks user for another/next operation
                    break;
                // Insert Operation - insert an element at the end of the array
                case 2 :
                    while(validInput == false){
                        try {
                            Scanner input = new Scanner(System.in);
                            System.out.println("Enter an integer to insert at last - ");
                            element = input.nextInt();
                            validInput = true;
                        } catch(InputMismatchException e){
                            System.out.println("Invalid Input");
                        }
                    }
                    validInput = false;
                    array = insertElement(array, element);      // original array is updated with returned array
                    flag = anotherOperation();
                    break;
                // Insert Operation - insert an element the specified index of the array
                case 3 :
                    while(validInput == false){
                        try {
                            Scanner input = new Scanner(System.in);
                            System.out.println("Enter an integer to insert -");
                            element = input.nextInt();
                            validInput = true;
                        } catch(InputMismatchException e){
                            System.out.println("Invalid Input");
                        }
                    }
                    validInput = false;
                    boolean firstIteration = true;      // checks if its first while iteration or not
                    // keeps on iterating if index entered is out of range or invalid
                    while (index > array.length || index < 0 || validInput == false){
                        // displays out of range only when its not first iteration and index is out of range
                        if((index > array.length || index < 0) && !firstIteration){ // first iteration saves from displaying it on first iteration as index = -1
                            System.out.println("Index out of range of array");
                        }
                        try {
                            Scanner input = new Scanner(System.in);
                            System.out.println("Enter the specified index - ");
                            index = input.nextInt();
                            validInput = true;
                            firstIteration = false;     // sets the first iteration to false after first iteration is completed
                        } catch(InputMismatchException e){
                            System.out.println("Invalid Input");
                            firstIteration = true;      // as invalid input is displayed, it also helps from displaying index out of range
                            validInput = false;
                        }
                    }
                    validInput = false;
                    array = insertElement(array, element, index);       // original array is updated
                    flag = anotherOperation();
                    break;
                // Delete Operation - delete first occurrence of an element from the given array
                case 4 :
                    if(array.length > 0){
                        while(validInput == false){
                            try{
                                Scanner input = new Scanner(System.in);
                                System.out.println("Enter an integer to delete -");
                                element = input.nextInt();
                                validInput = true;
                            } catch(InputMismatchException e){
                                System.out.println("Invalid Input");
                            }
                        }
                        validInput = false;
                        array = deleteElement(array, element);      // array is updated
                    }
                    else {
                        System.out.println("Array is empty");
                    }
                    flag = anotherOperation();
                    break;
                // delete all occurrences of given element from the given array
                case 5 :
                    if(array.length > 0){
                        while(validInput == false){
                            try {
                                Scanner input = new Scanner(System.in);
                                System.out.println("Enter an integer to delete -");
                                element = input.nextInt();
                                validInput = true;
                            } catch (InputMismatchException e){
                                System.out.println("Invalid Input");
                            }
                        }
                        validInput = false;
                        array = deleteAllOccurrences(array, element);       // array is updated
                    }
                    else {
                        System.out.println("Array is empty");
                    }
                    flag = anotherOperation();
                    break;
                // displays the array to the console
                case 6 :
                    displayArray(array);
                    flag = anotherOperation();
                    break;
                default:
                    System.out.println("Invalid operation number");
                    flag = anotherOperation();
            }
        } while(flag);
    }
}
