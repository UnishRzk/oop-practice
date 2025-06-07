package com.unish.StaticExample;

// this is a demo to show initialization of static variables
public class StaticBlock {

    static int a = 10;
    static int b;

    // will only run once, when the first object is created when the class is loaded for the first time
    static {
        System.out.println("This is a message from static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b +=3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }



}
