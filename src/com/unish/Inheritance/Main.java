package com.unish.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(4.5, 6.6 ,7.8 );
//        System.out.println(box.length+ " " + box.height + " " + box.width);
//
//        Box box2 = new Box(box);
//        System.out.println(box2.length+ " " + box2.height + " " + box2.width);

//        WeightedBox box3 = new WeightedBox();
//        System.out.println(box3.length+ " " + box3.height + " " + box3.width + " " + box3.weight);

//        WeightedBox box4 = new WeightedBox(3,6,7,8);


        // weight cannot be accessed because the reference variable is of Box class
        Box box5 = new WeightedBox(5,42,4,7);
     //   System.out.println(box5.weight);

        // problem arises because this will call the box constructor not the WeightedBox constructor
        // you just cant have a child class reference variable calling the parent object
    //    WeightedBox box6 = new Box(5,42,4,7);
     //   System.out.println(box6);


      //  System.out.println(box5.weight);

        BoxPrice box7 = new BoxPrice(1,2,3,4,5);
        System.out.println(box7.length+ " " + box7.height + " " + box7.width + " " + box7.weight + " " + box7.price);




    }
}
