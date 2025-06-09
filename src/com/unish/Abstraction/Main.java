package com.unish.Abstraction;

public class Main {



    public static void main(String[] args) {
        Son son = new Son(29);
        son.carreer("Doctor");
        son.partner("Angela",24);

        Parent daughter = new Daughter(20);
        daughter.carreer("Dancer");
        daughter.partner("Ironman",27);

        Parent.hello();
        son.normal();


//        Parent mom = new Parent(3) {        };

    }
}
