package com.raka.datastructures.array;

public class DynamicArray {
    private int[] array;            //dynamic array
    private int totalElements;      //total elements count i.e actual array size
    private int arraySize;          // size of array according to dynamic allocation

    // dynamic array constructor
    public DynamicArray(){
        array = new int[1];
        totalElements = 0;
        arraySize = 1;
    }

    //adds given element at the end of array
    public void add(int data){
        if(totalElements == arraySize){
            growSize();
        }
        array[totalElements] = data;
        totalElements++;
    }

    //adds the given element at the specific index of the array
    public void addAt(int index, int data){
        if(totalElements == arraySize){
            growSize();
        }

        if(index <= totalElements){
            for(int i = totalElements-1; i >= index; i--){
                array[i+1] = array[i];
            }

            array[index] = data;
            totalElements++;
        }
    }

    //remove the last element from the array
    public void remove(){
        if(totalElements > 0){
            array[totalElements -1] = 0;
            totalElements--;
        }
    }

    //removes element at specified index from the array
    public void removeAt(int index){
        if(totalElements > 0 && index < totalElements){
            for(int i = index; i < totalElements-1; i++){
                array[i] = array[i+1];
            }
            array[totalElements-1] = 0;
            totalElements--;
        }
    }

    //removes the first occurrence of the given element from the array
    public void remove(int data){
        if(totalElements > 0){
            for(int i = 0; i < totalElements; i++){
                if(array[i] == data){
                    for(int j = i; j < totalElements-1; j++){
                        array[j] = array[j+1];
                    }
                    array[totalElements-1] = 0;
                    totalElements--;
                    break;
                }
            }
        }
    }

    //remove all the occurrences of the given element from the array
    public void removeAll(int data){
        if(totalElements > 0){
            for(int i = 0; i < totalElements; i++){
                if(array[i] == data){
                    for(int j = i; j < totalElements-1; j++){
                        array[j] = array[j+1];
                    }
                    array[totalElements-1] = 0;
                    totalElements--;
                }
            }
        }
    }

    //display all the elements present in the array to the console
    public void  display(){
        if(totalElements > 0){
            System.out.println("Elements - ");
            for(int i = 0; i < totalElements; i++) {
                System.out.print(array[i] + "   ");
            }
            System.out.println();
        }
        else {
            System.out.println("Array is empty");
        }
    }

    //increases the array size to its double
    public void growSize(){
        int[] temp;

        if(totalElements == arraySize) {
            temp = new int[2 * arraySize];
            for (int i = 0; i < arraySize; i++) {
                temp[i] = array[i];
            }

            array = temp;
            arraySize = arraySize *2;
        }
    }

    //reduce the dynamic array size to total elements size
    public void shrinkSize(){
        int[] temp;
        if(totalElements > 0){
            temp = new int[totalElements];
            for(int i = 0; i < totalElements; i++){
                temp[i] = array[i];
            }
            array = temp;
            arraySize = totalElements;
        }
    }

    //main method
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();

        array.add(11);                  // adds an element to array
        System.out.println("Array size - " + array.arraySize);
        System.out.println("Total elements - " + array.totalElements);
        array.display();
        System.out.println();

        array.add(23);                  // adds an element to array
        System.out.println("Array size - " + array.arraySize);
        System.out.println("Total elements - " + array.totalElements);
        array.display();
        System.out.println();

        array.add(29);                  // adds an element to array
        System.out.println("Array size - " + array.arraySize);
        System.out.println("Total elements - " + array.totalElements);
        array.display();
        System.out.println();

        array.addAt(1, 18);     // adds an element at given index of array
        System.out.println("Array size - " + array.arraySize);
        System.out.println("Total elements - " + array.totalElements);
        array.display();
        System.out.println();

        array.addAt(1, 56);     // adds an element at given index of array
        System.out.println("Array size - " + array.arraySize);
        System.out.println("Total elements - " + array.totalElements);
        array.display();
        System.out.println();

        array.remove();                 // remove the last element from the array
        System.out.println("Array size - " + array.arraySize);
        System.out.println("Total elements - " + array.totalElements);
        array.display();
        System.out.println();

        array.remove(18);           // remove the first occurrence of given element
        System.out.println("Array size - " + array.arraySize);
        System.out.println("Total elements - " + array.totalElements);
        array.display();
        System.out.println();

        array.addAt(0, 12);
        array.addAt(3, 12);
        System.out.println("Array size - " + array.arraySize);
        System.out.println("Total elements - " + array.totalElements);
        array.display();
        System.out.println();

        array.removeAll(12);        // remove all the occurrences of the given element
        System.out.println("Array size - " + array.arraySize);
        System.out.println("Total elements - " + array.totalElements);
        array.display();
        System.out.println();

        array.removeAt(1);          // removes element at specified index from the array
        System.out.println("Array size - " + array.arraySize);
        System.out.println("Total elements - " + array.totalElements);
        array.display();
        System.out.println();

        array.shrinkSize();             // reduce the size of array to total elements count
        System.out.println("Array size - " + array.arraySize);
        System.out.println("Total elements - " + array.totalElements);
        array.display();
        System.out.println();
    }
}

