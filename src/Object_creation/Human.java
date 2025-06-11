package Object_creation;

public class Human {
    String name;
    int age;
    double height;

    Human(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void speak() {
        System.out.println("Human speaking " + name + " " + age + " " + height);
    }

    public void eat() {
        System.out.println("Human eating " + name + " " + age + " " + height);
    }

}
