package com.unish.StaticExample;

//class Test {
//    static String name;
//
//    public Test(String name) {
//        Test.name = name;
//    }
//}

public class InnerClasses {

    // only inner classes can be static, outer classes cannot be static
     static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Unish");
        Test b = new Test("Bob");

        System.out.println(a.name);
        System.out.println(b.name);


    }

}

