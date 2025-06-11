package lab;

/**
 * @author Unish Rajak
 */

class ThrowDemo {
    public void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Underage not allowed");
        } else {
            System.out.println("Access granted.");
        }
    }
}

class ThrowsDemo {
    public void riskyMethod() throws Exception {
        throw new Exception("Checked exception using throws");
    }
}

public class ThrowVsThrowsDemo {
    public static void main(String[] args) {
        ThrowDemo t = new ThrowDemo();
        try {
            t.checkAge(16);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        ThrowsDemo d = new ThrowsDemo();
        try {
            d.riskyMethod();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

