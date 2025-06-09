package com.unish.AccessControll;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    // a unique representation of an object via an number
    @Override
    public int hashCode() {
        return super.hashCode();
//        return num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(5, 43.4f);
        ObjectDemo obj1 = new ObjectDemo( 5,43.4f) ;
//        ObjectDemo obj1 = obj;


        if(obj == obj1){
            System.out.println("it is equal");
        }

        if(obj.equals(obj1)){
            System.out.println("it is equal");
        }

        System.out.println(obj1.getClass().getName());

//        System.out.println(obj.hashCode());
//        System.out.println(obj1.hashCode());


    }
}
