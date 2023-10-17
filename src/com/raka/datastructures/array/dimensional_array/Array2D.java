package com.raka.datastructures.array.dimensional_array;

public class Array2D {

    public static void main(String[] args) {

        String[][] objects = {                      // 2-dimensional array of type String
                {"Table", "Chair", "Books"},
                {"Bottle", "Glass", "Pen"},
                {"Perfume", "Box", null}
        };

        // displaying the objects in 2D
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(objects[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}
