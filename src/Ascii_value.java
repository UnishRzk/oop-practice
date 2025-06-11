import java.util.Scanner;

public class Ascii_value {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 'a';
        System.out.println(a);
        System.out.println("---------------------------------");
        System.out.print("Enter a Character: ");
        String c = sc.nextLine();
        int b = c.charAt(0);
        System.out.println(b);
        int d = 97;
        System.out.println("---------------------------------");
        System.out.println((char) d);
    }
}
