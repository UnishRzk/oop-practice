package extras;

public class Fish implements Prey,Predator{


    @Override
    public void hunt() {
        System.out.println("extras.Fish hunting");
    }

    @Override
    public void flee() {
        System.out.println("extras.Fish fleeing");
    }
}
