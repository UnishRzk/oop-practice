import java.util.Scanner;

public class Reversed_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r =0, sum =0;

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;

        while (num!=0){
            r = num%10;
            sum = (sum * 10)+r;
            num = num/10;
        }

        System.out.println("The reverse of " + temp + " is " + sum);



    }
}
