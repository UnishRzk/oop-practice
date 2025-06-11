import java.util.InputMismatchException;
import java.util.Scanner;

public class automorphic_number {
    public static void main(String[] args) {

        try {
            System.out.print("Enter the number: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            sc.close();

            int r = ( (int) Math.pow(num,2)) % 100;

            if (num == r) {
                System.out.println("The number is Automorphic Number");
            }
        }

        catch ( InputMismatchException e) {
            System.out.println("The number entered is invalid");
        }

    }
}
