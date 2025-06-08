package com.unish.Inheritance;

public class Box {
    double length;
    double height;
    double width;
    double weight;

    public Box (){
//        this.length = -1;
//        this.height = -1;
//        this.width = -1;


        this(-1,-1,-1);
    }

    public Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    // cube
    public Box(double side) {

//        super(); // object class

        System.out.println("Box class constructor called..");

        this.length = side;
        this.height = side;
        this.width = side;
    }

    public Box(Box old) {
        this.length = old.length;
        this.height = old.height;
        this.width = old.width;
    }

    public void information(){
        System.out.println("Executing the box..");
    }

}
