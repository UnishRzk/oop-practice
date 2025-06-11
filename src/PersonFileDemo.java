/**
 * @author Unish Rajak
 */

import java.io.*;

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonFileDemo {
    public static void main(String[] args) {
        Person p = new Person("Unish", 21);

        // Write object
        try {
            FileOutputStream fileOut = new FileOutputStream("person.dat");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(p);
            objOut.close();
            fileOut.close();
        } catch (IOException e) {
            System.out.println("Error writing object.");
        }

        // Read object
        try {
            FileInputStream fileIn = new FileInputStream("person.dat");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            Person readPerson = (Person) objIn.readObject();
            readPerson.display();
            objIn.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading object.");
        }
    }
}
