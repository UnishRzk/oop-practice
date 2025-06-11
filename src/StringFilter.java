/**
 * @author Unish Rajak
 */
import java.util.Scanner;
import java.util.Vector;

public class StringFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> v = new Vector<>();
        String input;

        while (true) {
            input = sc.next();
            if (input.equals("n")) break;
            v.add(input);
        }

        for (String s : v) {
            if (s.length() > 3) {
                System.out.println(s);
            }
        }
    }
}
