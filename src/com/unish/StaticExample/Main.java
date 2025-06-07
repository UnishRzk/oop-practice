package com.unish.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human unish = new Human(19,"Unish",0,false);
        Human Bob = new Human(20,"Bob",100,true);

//        System.out.println(unish.name);
//        System.out.println(Human.population);
//        System.out.println(Human.population);

        Main funn = new Main();
        funn.fun2();
    }

    // this is dependent on objects
    static void fun(){
       // greeting(); // you cannot use this because it requires an instance
                    // but the function you are using it in does not depend on instances

        // you cannot access non static stuff without referencing it to their instances
        // in a static context

        Main obj = new Main();
        obj.gretting();
    }

    void fun2(){
        gretting();
    }

    // we know that something which is not static, belongs to an object
     void gretting(){
      //  fun(); // you can have static methods, variables inside a non static method
        System.out.println("Hello");
    }

}

