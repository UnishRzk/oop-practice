package com.unish.cloning;

import java.util.Arrays;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(Human h) {
        this.age = age;
        this.name = name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,7,5};
    }
//
//    @Override
//    public Object clone() throws CloneNotSupportedException{
////        shallow copy
//        return super.clone();
//    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        // this is deep copy

        Human twin = (Human) super.clone(); // actually a shallow copy

        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];

        }
        return twin;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
