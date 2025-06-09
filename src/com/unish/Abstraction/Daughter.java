package com.unish.Abstraction;

public class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
    }

    @Override
    void carreer(String name) {
        System.out.println("I am going to be a " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("My partners name is "+ name + "aged" + age);
    }
}
