package com.unish.Inheritance;

public class BoxPrice extends WeightedBox {
    double price;

    public BoxPrice(double length, double height, double width, double weight, double price) {
        super(length, height, width, weight);
        this.price = price;
    }
}
