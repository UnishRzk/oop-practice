package com.unish.Interface;

public class Main {
    public static void main(String[] args) {
        Engine car = new Car();

//        car.a;

//        car.accelerate();
//        car.start();
//        car.stop();
//
//        Media carMedia = new Car();
//        carMedia.stop();

        Ford rapdor = new Ford();

        rapdor.start();
        rapdor.startMusic();

        rapdor.upgradeEngine();
        rapdor.start();

    }
}
