/**
 * @author Unish Rajak
 */

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWriteDemo {
    public static void main(String[] args) {
        String data = "This is a sample content.";
        try {
            FileOutputStream out = new FileOutputStream("sample.txt");
            out.write(data.getBytes());
            out.close();
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}
