import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            sc.close();

            System.out.println("Factorial of " + n + " is " + factorial(n));
        }

        catch (InputMismatchException e) {
            System.out.println("Please enter a valid number");
        }

    }

    public static int factorial(int n) {
        if (n ==1 || n==0) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
