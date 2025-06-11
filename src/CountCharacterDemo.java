/**
 * @author Unish Rajak
 */

import java.io.FileReader;
import java.io.IOException;

public class CountCharacterDemo {
    public static void main(String[] args) {
        int count = 0;
        try {
            FileReader fr = new FileReader("A.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                if ((char) ch == 'a') {
                    count++;
                }
            }
            fr.close();
            System.out.println("Count of 'a': " + count);
        } catch (IOException e) {
            System.out.println("File read error.");
        }
    }
}
