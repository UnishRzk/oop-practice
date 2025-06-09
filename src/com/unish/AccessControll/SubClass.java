package com.unish.AccessControll;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(56, "Bob");
        int n = obj.num;

        System.out.println(obj instanceof A);
    }


}
