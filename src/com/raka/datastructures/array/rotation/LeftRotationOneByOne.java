package com.raka.datastructures.array.rotation;

public class LeftRotationOneByOne {

    public static void rotateArrayLeft(int[] array){
        int last = array[0];
        for(int i = 0; i < array.length - 1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = last;
    }

    public static void rotateArrayLeft(int[] array, int d){
        int n = 1;
        while(n <= d){
            int last = array[0];
            for(int i = 0; i < array.length - 1; i++){
                array[i] = array[i+1];
            }
            array[array.length-1] = last;
            n++;
        }
    }

    public static void displayArray(int[] array){
        for(int element : array){
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {29, 58, 18, 19, 40, 20, 18, 40, 58, 73, 56, 69};

        int[] cloneArray = array.clone();

        System.out.println("Original array -");
        displayArray(array);

        rotateArrayLeft(array);
        System.out.println("Original array rotated left by 1 -");
        displayArray(array);

        int d = 4;
        rotateArrayLeft(cloneArray, d);
        System.out.println("Original array rotated left by " + d);
        displayArray(cloneArray);
    }
}

