package com.unish.polymorphism;

public class Numbers {

    double sum (double a , int b){
        return a + b;
    }

    int sum (int a , int b){
        return a + b;
    }

    int sum (int a , int b, int c){
        return a + b + c ;
    }

    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.sum(3,5);
        num.sum(4,5,6);
    }
}
