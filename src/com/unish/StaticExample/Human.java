package com.unish.StaticExample;

public class Human {

    int age;
    String name;
    int salary;
    boolean isMarried;
    static int population;

    static void message(){
        System.out.println("Hello World");

        // this keyword doesnt work because it depends on an object
        // while staic doesnt need a
        // System.out.println(this.age); // this will not work
    }

    public Human(int age, String name, int salary, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;

        Human.population +=1;
        Human.message();
    }


}
