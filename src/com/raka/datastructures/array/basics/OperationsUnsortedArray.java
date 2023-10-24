package com.raka.datastructures.array.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OperationsUnsortedArray {

    public static int searchElement(int[] array, int key){
        for(int i = 0; i < array.length; i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int[] insertElement(int[] array, int element){
        int length = array.length;
        int[] temp = new int[length+1];

        for(int i = 0; i < length; i++){
            temp[i] = array[i];
        }
        temp[temp.length-1] = element;

        System.out.println("Element inserted successfully");
        return temp;
    }

    public static int[] insertElement(int[] array, int element, int index){
        int length = array.length;
        int[] temp = new int[length+1];

        for (int i = 0; i < index; i++){
            temp[i] = array[i];
        }

        for(int i = index+1; i < temp.length; i++){
            temp[i] = array[i-1];
        }
        temp[index] = element;
        System.out.println("Element inserted successfully at specified index");

        return temp;
    }

    public static int[] deleteElement(int[] array, int element){
        int length = array.length;

        for(int i = 0; i < length; i++){
            if(array[i] == element){
                length--;
                for(int j = i; j < length; j++){
                    array[j] = array[j+1];
                }
                break;
            }
        }
        int[] temp = new int[length];
        for(int i = 0; i < length; i++){
            temp[i] = array[i];
        }
        System.out.println("Element deleted successfully");
        return temp;
    }

    public static int[] deleteAllOccurrences(int[] array, int element){
        int length = array.length;

        for(int i = 0; i < length; i++){
            if(array[i] == element){
                length--;
                for(int j = i; j < length; j++){
                    array[j] = array[j+1];
                }
            }
        }
        int[] temp = new int[length];
        for(int i = 0; i < length; i++){
            temp[i] = array[i];
        }
        System.out.println("All occurrences of element deleted successfully");
        return temp;

    }

    public static boolean anotherOperation(){
        boolean validInput = false;
        boolean result = false;
        while(validInput != true){
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Do you want to do another operation - (true/false)");
                result = input.nextBoolean();
                validInput = true;
            } catch (InputMismatchException e){
                System.out.println("Invalid Input");
            }
        }
        return result;
    }

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
        boolean flag = true;

        System.out.println("1. Find index of an element");
        System.out.println("2. Insert an element in last of array");
        System.out.println("3. Insert an element at specific index");
        System.out.println("4. Delete first occurrence of an element");
        System.out.println("5. Delete all occurrence of an element");
        System.out.println("6. Display the array");

        int operation = 0;
        int element = 0, index = -1;
        boolean validInput = false;
        do {
            while (validInput == false){
                try {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter your operation number -");
                    operation = input.nextInt();
                    validInput = true;
                } catch (InputMismatchException e){
                    System.out.println("Invalid input.");
                }
            }
            validInput = false;
            switch(operation){
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
                        index = searchElement(array, element);
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
                    flag = anotherOperation();
                    break;
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
                    array = insertElement(array, element);
                    flag = anotherOperation();
                    break;
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
                    index = -1;
                    boolean firstIteration = true;
                    while (index > array.length || index < 0 || validInput == false){
                        if((index > array.length || index < 0) && !firstIteration){
                            System.out.println("Index out of range of array");
                        }
                        try {
                            Scanner input = new Scanner(System.in);
                            System.out.println("Enter the specified index - ");
                            index = input.nextInt();
                            validInput = true;
                            firstIteration = false;
                        } catch(InputMismatchException e){
                            System.out.println("Invalid Input");
                            firstIteration = true;
                            validInput = false;
                        }
                    }
                    validInput = false;
                    array = insertElement(array, element, index);
                    flag = anotherOperation();
                    break;
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
                        array = deleteElement(array, element);
                    }
                    else {
                        System.out.println("Array is empty");
                    }
                    flag = anotherOperation();
                    break;
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
                        array = deleteAllOccurrences(array, element);
                    }
                    else {
                        System.out.println("Array is empty");
                    }
                    flag = anotherOperation();
                    break;
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
