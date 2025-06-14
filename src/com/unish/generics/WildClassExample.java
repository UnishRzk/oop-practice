package com.unish.generics;

import java.util.Arrays;

public class WildClassExample<T extends Number> {

    private Object[] data;
    private  static int  DEFAULT_SIZE = 10;
    private int size = 0;

    public WildClassExample() {

        this.data = new Object[DEFAULT_SIZE];
    }


    public void add (T num){
        if(this.isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copying the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] =  data[i];
        }

        data = temp;

    }

    public T remove(){
       T removed = (T )data[--size];
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }


    private boolean isFull() {
        return size == data.length;
    }


    @Override
    public String toString() {
        return "CustomGenericsArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

//        CustomGenericsArrayList list = new CustomGenericsArrayList();

//        for (int i = 0; i < 12; i++) {
//            list.add(5*i);
//        }

        WildClassExample<Integer> list2 = new WildClassExample<>();
        for (int i = 0; i < 14; i++) {
            list2.add(3 * i);
        }



        System.out.println(list2);



//        ArrayList list = new ArrayList();
//        list.add(445);
//        list.remove(0);
//        list.get(0);
//        list.set(1,8888);
//        list.size();
//        list.isEmpty();
    }
}
