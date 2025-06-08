package com.unish.Inheritance;

public class WeightedBox extends Box {

    double weight;

   public WeightedBox(){
      // super();
       this.weight = -1;
   }

   WeightedBox (WeightedBox otherbox){
       super(otherbox);
       this.weight = otherbox.weight;

   }

    public WeightedBox(double length, double height, double width, double weight) {

       // call the parent class constructor
        super(length, height, width);
        // used to initialize values in the parent class

//        System.out.println(super.weight);
        this.weight = weight;
    }
}
