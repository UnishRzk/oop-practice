package com.unish.enums;

public class Basic {
    enum Week implements A {
        monday,tuesday,wednesday,thursday,friday,saturday,sunday;
        // these are enum constants
        // by default they are public static and final
        // since its final you can create child enums

        Week (){
//            System.out.println("Constructor called for " + this);
//        Internally it is public static final Week Monday = new Week();
// enum can implement but cant be inherited by other classes
        }

        @Override
        public void hello() {
            System.out.println("Week says hello");
        }
    }





    public static void main(String[] args) {
        Week week;
        week = Week.sunday;
        week.hello();

        System.out.println(week);
        System.out.println(week.ordinal());
        System.out.println(Week.valueOf("monday"));

//        for(Week day : Week.values()){
//            System.out.println(day);
//        }

    }

}

