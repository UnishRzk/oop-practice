package com.unish.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a =5;
        int b =0;


        try {
//            divide(a,b);
            throw new MyException("custom Exception");
        }catch (MyException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This will always execute");
        }
    }


    static int divide(int a ,int b) throws ArithmeticException{

        if (b==0){
            throw new  ArithmeticException("cant divide by 0");
        }

        return a/b;
    }

}
