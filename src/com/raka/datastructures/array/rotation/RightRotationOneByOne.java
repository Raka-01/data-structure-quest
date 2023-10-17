package com.raka.datastructures.array.rotation;

public class RightRotationOneByOne {

    public static void rotateArrayRight(int[] array){
        int first = array[array.length-1];
        for(int i = array.length - 1; i > 0; i--){
            array[i] = array[i-1];
        }
        array[0] = first;
    }

    public static void rotateArrayRight(int[] array, int d){
        int n = 1;
        while(n <= d){
            int first = array[array.length-1];
            for(int i = array.length - 1; i > 0; i--){
                array[i] = array[i-1];
            }
            array[0] = first;
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
        int[] array = {12, 48, 57, 59, 28, 59, 49, 82, 92, 10, 49, 74, 97, 78, 23};

        int[] cloneArray = array.clone();

        System.out.println("Original Array -");
        displayArray(array);

        rotateArrayRight(array);
        System.out.println("Array rotated right by 1 index - ");
        displayArray(array);

        int d = 3;
        rotateArrayRight(cloneArray, d);
        System.out.println("Array rotated right by " + d + " index");
        displayArray(cloneArray);
    }
}

