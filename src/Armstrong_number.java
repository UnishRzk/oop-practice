import java.util.InputMismatchException;
import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {

       try {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a number: ");
           int num = sc.nextInt();
           sc.close();
           double sum = 0;
           int original_number = num;

           int power = String.valueOf(num).length();

           while (num != 0) {
               int digit = num % 10;
               sum = Math.pow(digit,power) + sum;
               num = num / 10;
           }

           if (sum == original_number) {
               System.out.println(original_number + " is an armstrong number.");
           }

           else {
               System.out.println(original_number + " is not an armstrong number.");
           }
       }

       catch (InputMismatchException e) {
           System.out.println("Not a valid number");
       }


    }

}
