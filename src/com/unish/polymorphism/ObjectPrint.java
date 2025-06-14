package com.unish.polymorphism;

public class ObjectPrint extends Object {

    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(44);
        System.out.println(obj);
    }
}
