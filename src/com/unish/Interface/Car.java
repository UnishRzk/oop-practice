package com.unish.Interface;

public class Car implements Brake,Engine,Media{

    int a;

    @Override
    public void brake() {
        System.out.println("Brake pressed");
    }

    @Override
    public void start() {
        System.out.println("Car has started");
    }

    @Override
    public void stop() {
        System.out.println("Car has been stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Car moves forward");
    }
}
