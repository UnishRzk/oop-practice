package com.unish.introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student test = new Student();
        System.out.println(test.name);

        Student student = new Student(45,"Unish",44.4f);
        student.setName("Bob ");
        student.greet();

        Student otherStudent = new Student(test);
        System.out.println(otherStudent.name);


    }
}