package com.unish.introduction;

public class WrapperExample {
    public static void main(String[] args) {

//        int a = 10;
//        Integer b = 45;

        Integer a = 10;
        Integer b = 20;

        swap(a, b);
        System.out.println(a + " " + b);

//        Final Gurrantees Immutability
//        final int val = 3;
//        val = 4;

        final A kunal = new A("Unish");

        // when an non-primitive is final you can modify it
        kunal.name = "other name";

        // when an non-primitive is final you cannot reassign it
        // kunal = new A("changes");

        A obj;

        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Random name");
        }

    }

    //It'll not swap because Integer class is using Final keyword
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }



}

    class A{
        final int number = 100;
        String name;

        public A(String name){
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable{
            System.out.println("Object is destroyed");
        }


    }

