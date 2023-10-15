package com.raka.datastructures.array.basics;

import java.util.Random;

public class ReturnArray {

    public static void main(String[] args) {
        int[] numbers;

        numbers = getRandomNumbersArray();      // array is initialized to an array with random size and inputs

        System.out.println("Random Array");
        for (int number : numbers) {            // displaying the random array to console
            System.out.print(number + "   ");
        }
    }

    // this method created the random array with size b/w 2 to 10 and inputs b/w 10 to 100
    private static int[] getRandomNumbersArray() {          // method returning an integer array as return type
        Random random = new Random();
        int size = random.nextInt(2, 10);

        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = random.nextInt(10, 100);
        }
        return array;
    }

}
