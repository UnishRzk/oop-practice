package Rishav;

/**
 * @author Unish Rajak
 */
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(51) + 50;
        System.out.println("Random Number: " + num);
    }
}

