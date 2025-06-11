import java.util.Random;

public class Random_number {
    public static void main(String[] args) {
        Random rand = new Random();

        int num = rand.nextInt(1,7);
        System.out.println(num);

        boolean num2 = rand.nextBoolean();
        System.out.println(num2);

        double num3 = rand.nextDouble();
        System.out.println(num3);

        long num4 = rand.nextLong();
        System.out.println(num4);

        float num5 = rand.nextFloat();
        System.out.println(num5);
    }
}
