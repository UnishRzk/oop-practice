package com.unish.introduction;

public class ConstructorDemo {
    public static void main(String[] args) {
        Derived d = new Derived("he");
    }
}

     class Base {
        String name;

        public Base(String name) {
            this.name = name;
            System.out.println("Parameterized Base class Called");
        }

        Base(){
            System.out.println("Base class called");
        }
    }

     class Derived extends Base {
//    Derived(){
//        System.out.println("Derived Class Callled");
//    }

        Derived(String name){
           // super(name);
            System.out.println("Parameterized Derived class constructr called");
        }
    }



