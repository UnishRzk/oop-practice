package com.unish.Abstraction;

public  class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    int getValue(){
        return super.VALUE;
    }



    @Override
    void carreer(String name) {
        System.out.println("I am going to be a" + name);

    }

    @Override
    void partner(String name, int age) {
        System.out.println("I am married to "+ name + "aged " + age);
    }

    @Override
    void normal() {
        super.normal();
    }
}
