package com.unish.Interface;

public class Ford {
    private Engine engine;
    private Media player = new CDPlayer();

    public Ford(){
        engine = new PowerEngine();
    }

    public Ford(Engine engine){
        this.engine = engine;
    }

    public  void start(){
        engine.start();
    }

    public  void stop(){
        engine.stop();
    }

    public  void startMusic(){
        player.start();
    }

    public  void stopMusic(){
        player.stop();
    }

    public  void upgradeEngine(){
        this.engine = new ElectricEngine();
    }

}
