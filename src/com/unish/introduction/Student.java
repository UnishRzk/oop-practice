package com.unish.introduction;

public class Student {

    int rollNo;
    String name;
    float marks;

    void greet(){
        System.out.println("The students name is: "+ this.name);
    }

    // setter method
    void setName(String newname){
        name = newname;
    }


    // No args constructor
    Student(){
//        this.rollNo = 1111;
//        this.name = "No Name";
//        this.marks = 999.99f;

        // this is how you call a constructor from another constructor
        this(1111, "No Name", 999.99f);
    }


    // here the new object created had the values of the objects that are passes
    // btwn the parameters
    Student(Student other){
        this.rollNo = other.rollNo;
        this.name = other.name;
        this.marks = other.marks;
    }


    // all args constructor
    Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

//    Student(int roll, String naam, float mark){
//        rollNo = roll;
//        name = naam;
//        marks = mark;
//    }

}
