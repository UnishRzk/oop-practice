package extras;

public class hero extends person{
    String power;

    hero (String name, int age, String power){
        super(name,age);
        this.power = power;
    }

    public String toString(){
        return super.toString() + "\nPower: " + power;
    }

}
