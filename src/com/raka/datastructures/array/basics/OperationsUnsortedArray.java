package com.raka.datastructures.array.basics;

import java.util.Scanner;

public class OperationsUnsortedArray {

    public static int searchElement(int[] array, int key){
        for(int i = 0; i < array.length; i++){
            if(array[i] == key){
                return key;
            }
        }
        return -1;
    }

    public static boolean insertElement(int[] array, int element){
        int length = array.length;
        int[] temp = new int[length+1];

        for(int i = 0; i < length; i++){
            temp[i] = array[i];
        }
        temp[temp.length-1] = element;
        array = temp;

        return true;
    }

    public static void insertElement(int[] array, int element, int index){
        int length = array.length;
        int[] temp = new int[length+1];

        for (int i = 0; i < index; i++){
            temp[i] = array[i];
        }

        for(int i = index+1; i < temp.length; i++){
            temp[i] = array[i];
        }
        temp[index] = element;
        array = temp;
    }

    public static void deleteElement(int[] array, int element){
        int length = array.length;
        if(length > 0){

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
            array = temp;
        }
        else {
            System.out.println("Array is empty");
        }
    }

    public static void deleteAllOccurrences(int[] array, int element){
        int length = array.length;
        if(length > 0){
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
            array = temp;
        }
        else {
            System.out.println("Array is empty");
        }
    }

    public static void displayArray(int[] array){
        for(int element : array){
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
