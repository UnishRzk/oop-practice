package com.unish.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {



        Student unish = new Student(5,10.01f);
        Student bob = new Student(8,34.33f);
        Student kunal = new Student(2,33.53f);
        Student rahul = new Student(6,36.33f);
        Student rajesh = new Student(22,33.365f);
        Student sabin = new Student(66,33757.3f);

        Student[] list = {unish,bob,kunal,rahul,rajesh,sabin};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list, (o1, o2) -> -(int) (o1.marks-o2.marks));

        System.out.println(Arrays.toString(list));

//        if (unish.compareTo(bob) < 0 ){
//            System.out.println("Bob has got more marks");
//        }



    }
}
