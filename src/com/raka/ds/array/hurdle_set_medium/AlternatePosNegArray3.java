package com.raka.ds.array.hurdle_set_medium;

/**
 * An array contains both positive and negative numbers in random order.
 * Rearrange the array elements so that positive and negative numbers are placed alternatively.
 * A number of positive and negative numbers need not be equal.
 * If there are more positive numbers they appear at the end of the array.
 * If there are more negative numbers, they too appear at the end of the array.
 * <p>
 * Approach - Using outOfPlace variable and rotation
 * - Maintain a variable, outOfPlace initialized at -1, to mark if the element is in its correct position or not
 * - iterate over the array
 * - if outOfPlace is -1, we will check if the current index is out of place
 * - if the current index is out of place we will update the outOfPlace with the index value
 * - if the outOfPlace is not -1, search for next element with different sign than element at outOfPlace index
 * - pass this two positions to right rotate our array
 * - update the outOfPlace by 2 unit (as previously valid elements will now become the out-of-place elements)
 * <p>
 * This approach maintains the relative order of the elements in the array while rearranging
 * <p>
 * Time complexity - O(n)
 * Auxiliary space - O(1)
 */

public class AlternatePosNegArray3 {

    // arrange positive and negative elements in alternate order in the array
    public static void rearrange(int[] array) {
        int length = array.length;
        int outOfPlace = -1;

        // iterate through each element of the array
        for (int index = 0; index < length; index++){
            // it is executed only if there is previously marked out-of-place element
            if (outOfPlace >= 0){
                /*
                if we get an element at current index opposite to element at out-of-place index,
                right rotate  between current index and out-of-place index inclusive
                 */
                if (((array[index] >= 0) && (array[outOfPlace] < 0)
                        || ((array[index] < 0) && array[outOfPlace] >= 0))){
                    rightRotate(array, outOfPlace, index);

                    if (index - outOfPlace >= 2){
                        /*
                        this checks in between the sub array that is rotated
                        as current index has crossed too many elements
                         */
                        outOfPlace = outOfPlace + 2;
                    }
                    else {
                        /*
                        this is when we are rotating only 2 or 3 elements as in this case
                        current index is at +2 position
                        giving the chance to set new outOfPlace elements
                         */
                        outOfPlace = -1;
                    }
                }
            }

            // marks new out-of-place elements
            if (outOfPlace == -1){      // check if there is any out-of-place elements
                // based on sign and index of element, it checks if current element is out-of-place
                if (((array[index] < 0) && ((index & 1) == 0))
                || ((array[index] >= 0) && ((index & 1) == 1))){
                    outOfPlace = index;
                }
            }
        }
    }

    // right rotate the elements in the array between low and high index inclusive
    public static void rightRotate(int[] array, int low, int high){
        int temp = array[high];

        for (int i = high; i > low; i--){
            array[i] = array[i-1];
        }
        array[low] = temp;
    }

    // display the array to the console
    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int[] array = {-3, 5, 6, 8, -2, -9, 6, 3, 8, -1, -7, -6, 4, -6, -3, -5, -6, 7};
        int[] array = {-5, -6, -7, -8, -9, -4, -3, 1, 3, 4, 5, 6, 7, 8, 2};

        System.out.println("Original Array - ");
        displayArray(array);

        rearrange(array);

        System.out.println("Rearranged Array - ");
        displayArray(array);
    }
}
