package com.unish.Abstraction;

public abstract class Parent {

    int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 1234;
    }

    void normal(){
        System.out.println("This is a normal method");
    }

//    abstract  Parent(){}

    static void hello(){
        System.out.println("Parent says hello");
    }

    abstract void carreer(String name);
    abstract void partner(String name, int age);


}
