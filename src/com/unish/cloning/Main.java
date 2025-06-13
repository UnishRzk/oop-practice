package com.unish.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human unish = new Human(19,"Unish Rajak");
//        Human twin = new Human(unish);

        Human twin = (Human) unish.clone();
        System.out.println(twin);
        twin.arr[0] = 100;
        System.out.println(unish);

    }


}
