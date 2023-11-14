package com.raka.datastructures.array.hurdle_set_medium;

public class RearrangeArrayConditioni2 {

    public static void rearrangeElementsi(int[] array){
        int length = array.length;

        // iterate through each element of the array
        for (int i = 0; i < length; i++){
            /*
            ignores index i if -1 or element i is present at index i

             if a different element k is at index i instead of element i
             put the different element k to its correct position,
             and then put element i at index i, if i is present in array

             if index k is not vacate to put element k, vacate index k by
             putting the element l to its correct position and so on
             (not vacate means a different index element is present at that index)
             */
            if (array[i] != -1 && array[i] != i){
                int k = array[i];           // vacate the desired index i for element i

                // putting element k that was at i to its correct position index k
                while (array[k] != -1 && array[k] != k){
                    int l = array[k];       // vacate the desired index k for element k
                    array[k] = k;           // putting element k at position k
                    k = l;                  // if index l is not vacate to put element l, repeat the loop
                }

                array[k] = k;               // if while loop does not execute, means either k or -1 is present at index k

                /*
                 checks if while loop has not set correct value i at index i,
                 it means element i is not present in array or
                 element i at different index x which will come in further iteration
                 */
                if (array[i] != i){
                    array[i] = -1;
                }
            }
        }
    }

    // display the elements of the array to the console
    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "    ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};

        System.out.println("Original array - ");
        displayArray(array);

        rearrangeElementsi(array);

        System.out.println("Array after putting element i at index i - ");
        displayArray(array);
    }
}
