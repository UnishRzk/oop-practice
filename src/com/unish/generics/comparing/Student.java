package com.unish.generics.comparing;

public class Student implements Comparable<Student> {

    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("Runniing..");
        return (int)( this.marks - o.marks);

        // if returns 0 both are equal
        // if the stattement is true it is greater than 0
        // if false less than 0

    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                '}';
    }
}
