package com.raka.datastructures.array.basics;

public class ImplementArray2 {

    public static void main(String[] args) {
        Student[] students = new Student[5];         // initialization of array - decalaration + instantiation

        // displaying default values of array
        for (Student s : students) {
            System.out.println(s);          // prints 'null'
        }
        System.out.println();

        // re-initializing each student inside array
        students[0] = new Student("Ram");
        students[1] = new Student("Sita");
        students[2] = new Student("Krishna");
        students[3] = new Student("Radha");
        students[4] = new Student("Hanuman");

        // displaying the names of students
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {       // without this, for each loop displays reference to students in array
        return name;
    }
}
