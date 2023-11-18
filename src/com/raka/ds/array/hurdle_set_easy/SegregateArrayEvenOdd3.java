package com.raka.ds.array.hurdle_set_easy;

import java.util.*;

/**
 * Segregate Even and Odd numbers
 * write a method that segregates even and odd numbers
 * and method should put all even numbers first, and then odd numbers
 * In the output, the order of numbers can be changed
 * <p>
 * Approach -
 * start: the range of elements to reorder
 * end: the range of elements to reorder
 * pfn: User-defined predicate function object that defines
 * the condition to be satisfied if an element
 * is to be classified. A predicate takes single argument
 * and returns true or false.
 * Return Value:
 * Returns an iterator to the beginning of the elements
 * for which the predicate is false.
 * <p>
 * Time complexity - If enough extra memory is available, linear in the distance between first and last i.e O(n)
 * It applies predicate exactly once to each element, and performs up to that many element moves.
 * Otherwise, performs up to O(nlogn) element swaps. It also applies predicate exactly once to each element
 * Auxiliary space - O(1)
 */

public class SegregateArrayEvenOdd3 {

    // rearrange list with even elements at front and odd elements at end
    public static void segregateEvenOdd(List<Integer> array) {

        // using sort method with a custom comparator
        Collections.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                return Integer.compare(x % 2, y % 2);
            }
        });
    }

    // display the list to the console
    public static void displayList(List<Integer> array) {
        for (int element : array) {
            System.out.print(element + "    ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(72, 39, 10, 39, 17, 78, 83, 81, 37, 45, 44, 16, 36, 62, 37, 44, 72, 48));

        System.out.println("original List - ");
        displayList(array);

        segregateEvenOdd(array);

        System.out.println("List after segregation - ");
        displayList(array);
    }
}
