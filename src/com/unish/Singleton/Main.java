package com.unish.Singleton;

import com.unish.AccessControll.A;

public class Main{
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        // all 3 reference variables are calling the same object

        A a = new A(12,"Rajak");
        a.getNum();

//        int b = obj.num;

    }
}
