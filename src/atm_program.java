import java.util.Scanner;

public class atm_program {

    static int status = 0;
    static double amount = 1000.0;

    public static void main(String[] args) {

        System.out.print("""
                +----------------------+
                |    _   _____  __  __ |
                |   / \\ |_   _||  \\/  ||
                |  / _ \\  | |  | |\\/| ||
                | / ___ \\ | |  | |  | ||
                |/_/   \\_\\|_|  |_|  |_||
                +----------------------+""");
        Scanner sc = new Scanner(System.in);


       while (status != 4) {

           char choice = option();
               switch  (choice) {
                   case '1':
                   case 'd':
                       amount = deposit(amount,sc);
                       break;

                   case '2':
                   case 'w':
                       amount = withdraw(amount, sc);
                       break;

                   case '3':
                   case 'c':
                       System.out.println("\nYour Balance: " + amount);
                       break;

                   case '4':
                   case 'e':
                       System.out.println("Thank you for using this program.");
                       status = 4;
                       break;

                   default:
                       System.out.println("Invalid input. Try again.");
                       break;
           }
        }

       // System.out.println(amount);
    }

    public static char  option() {
        System.out.println("\nChoose one of the following:");
        System.out.println("\t1. Deposit");
        System.out.println("\t2. Withdraw");
        System.out.println("\t3. Check Balance");
        System.out.println("\t4. Exit");


        System.out.print("\n Enter your choice: ");
        Scanner sc = new Scanner(System.in);

        char response = Character.toLowerCase(sc.nextLine().charAt(0));
        print_line(25);
        System.out.println(" You chose: "+ response);
        return response;
    }

    public static double deposit(double amount, Scanner sc) {

        System.out.println("Enter the amount you want to deposit: ");
        double amt = sc.nextDouble();
        if (amt <= 0) {
            System.out.println("Invalid input. Try again.");
        }
        else{
            amount += amt;
            System.out.println("Deposited Successfully");
        }
        return amount;

    }

    public static double withdraw(double amount, Scanner sc) {
        System.out.println("Enter the amount you want to withdraw: ");
        double amt = sc.nextDouble();
        sc.nextLine();

        if (amt <= 0) {
            System.out.println("Invalid input. Try again.");
        }

        else if (amt > amount) {
            System.out.println("Insufficient funds.");
        }

        else {
            amount -= amt;
            System.out.println("Withdraw Successfully");
        }
        return amount;
    }

    public static void print_line(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

}
