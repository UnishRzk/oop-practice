package com.unish.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        list2.add(3);
        list2.add(54);
        list2.add(6);
        list2.add(77);
        list2.add(11);

        System.out.println(list2);

        List<Integer> vector = new Vector<>();
        vector.add(33);
        vector.add(43);
        vector.add(4343);
        // vector is slower than arraylist

        System.out.println(vector);








    }
}
