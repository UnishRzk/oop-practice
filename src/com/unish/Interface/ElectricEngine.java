package com.unish.Interface;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric Engine accelerate");
    }
}
