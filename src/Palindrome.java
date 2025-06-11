import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        while (true){
            try {
                Scanner sc = new Scanner(System.in);
                int n, temp = 0, sum = 0, r;
                System.out.print("Enter a number: ");
                n = sc.nextInt();
                temp = n;

                while (n > 0) {
                    r = n % 10;               //Extracts the last digit of the number
                    sum = (sum * 10) + r;     // Adds the last digit of the number
                    n = n / 10;               // Removes the last digit of the number
                }

                if (temp == sum) {
                    System.out.println(n + " is Palindrome");
                } else {
                    System.out.println(n + " is not Palindrome");
                }

                sc.close();
                break;
            }

            catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
    }
}
