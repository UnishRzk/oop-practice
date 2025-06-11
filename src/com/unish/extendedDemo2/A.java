package com.unish.extendedDemo2;

public interface A {


    // static interface methods should always have a body
    static void greeting(){
        System.out.println("hey i am static method");
    }

    default void fun(){
        System.out.println("I am in A");
    }


}
