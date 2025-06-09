package com.unish.Singleton;

import com.unish.AccessControll.A;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(56, "Bob");
        int n = obj.num;

        A obj1 = new A(4,"faf");
//        obj1.num;

        SubClass2 obj2 = new SubClass2(77,"'seven");

//        System.out.println(num);


    }



}

