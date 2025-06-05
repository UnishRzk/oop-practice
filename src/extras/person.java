package extras;

public class person {
    String name;
    int age;


    person (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + " " + age;
    }
}
