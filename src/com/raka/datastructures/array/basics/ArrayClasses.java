package com.raka.datastructures.array.basics;

public class ArrayClasses {

    public static void main(String[] args) {
        int[] integerArray = new int[5];
        byte[] byteArray = new byte[3];
        char[] charArray = new char[10];
        double[] doubleArray = new double[4];
        float[] floatArray = new float[4];
        String[] stringArray = new String[3];

        System.out.println(integerArray.getClass());                        // class [I
        System.out.println(integerArray.getClass().getSuperclass());        // class java.lang.Object
        System.out.println(byteArray.getClass());                           // class [B
        System.out.println(charArray.getClass());                           // class [C
        System.out.println(doubleArray.getClass());                         // class [D
        System.out.println(floatArray.getClass());                          // class [F
        System.out.println(stringArray.getClass());                         // class [Ljava.lang.String;
    }
}

// class [I  - runtime type signature for class object 'array with component type int, similarly for others
// class java.lang.Object - only superclass of array is Object class
