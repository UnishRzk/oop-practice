import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int m =0, count = 0;
        int data = sc.nextInt();
        m = data/2;

        if (isPrime(data)){
            System.out.println(data + " is a prime number");
        }
        else{
            System.out.println(data + " is not a prime number");
        }

    }

    public static boolean isPrime(int n) {

        if(n < 2){
            return false;
        }

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}
