package com.raka.datastructures.array.rotation;

public class JugglingRightRotation {

    // TODO THIS METHOD IS NOT WORKING FOR ALL VALUES  (eg. it worked for value 15 but not working for value 8
//    public static void rotateArrayRight(int[] array, int d){
//        int length = array.length;
//        d = d % length;             // endures d is within the range of array
//
//        int gcd = gcd(length, length-d);
//        int temp, j, k;
//        for(int i = 0; i < gcd; i++){       // iterate from the back of the last set of all sets
//            j = length - 1 - i;             // iterate from back to front, sets the index to store value from its left index
//            temp = array[j];                // stores the value at the last index of each set to set it to the front at the end
//
//            while(true){
//                k = (j - gcd + length) % length;       // k is index just before j from where value will be taken to store at j
//                if(k == (length - 1 - i)){  // checks if we reach at the first index of the set
//                    break;
//                }
//                array[j] = array[k];        // stores value at index k to index j
//                j = k;                      // sets j for next iteration shift
//            }
//            array[j] = temp;                // at last, store the element at last index to first index of the set
//        }
//    }

    public static void rotateArrayRight(int[] array, int d) {
        int length = array.length;
        JugglingLeftRotation.rotateArrayLeft(array, length - d);       // instead of rotating right to d position, rotate left by (length-d) position
    }

    private static int gcd(int a, int b) {      // calculates gcd of two numbers
        if (b == 0) {                         // point when one of value becomes zero(as remainder)
            return a;                       // then next element will be gcd
        } else {
            return gcd(b, a % b);         // alternatively changing a and b to divide each with the other similar to maths calculation
        }
    }

    public static void displayArray(int[] array) {      // display the array to console
        for (int element : array) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        System.out.println("Original Array - ");
        displayArray(array);

        int d = 8;
        rotateArrayRight(array, d);

        System.out.println("Array rotated right by " + d + " positions - ");
        displayArray(array);
    }
}

/**
 * eg. A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}
 * d = 10, length = 15
 * gcd = 5
 * sets - (0, 5, 10), (1, 6, 11), (2, 7, 12), (3, 8, 13), (4, 9, 14)     - 5 gcd 5 sets
 * <p>
 * j = length-1-i
 * temp = array[j]
 * k = (j-gcd)%length
 * array[j] = array[k]
 * array[j] = temp      when k == length-1-i
 * <p>
 * 1st for iteration
 * i = 0        // last set (4, 9, 14)
 * j = length-1-i = 15-1-0 = 14
 * temp = 14
 * 1st while iteration
 * k = (14-5 + 15)%15 = 9
 * k!=14
 * array[14] = array[9]
 * set - (4, 9, 9)
 * j = k = 9
 * 2nd while iteration
 * k = (9-5+15)%15 = 4
 * k!=14
 * array[9] = array[4]
 * set - (4, 4, 9)
 * j = k = 4
 * 3rd while iteration
 * k = (4-5 + 15)%15 = (-1 + 15)%15 = 14%15 = 14        // this is why we are adding length while calculating k as k gets negative
 * // and out of bounds
 * k==14 -> break
 * array[4] = temp = 14
 * <p>
 * here 2nd for iteration starts and goes on similarly as 1st one
 */
