package com.unish.Singleton;

// singleton class is a tpe of a class which has one object only
public class Singleton {
    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getInstance(){

        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
