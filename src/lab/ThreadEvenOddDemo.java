package lab;

/**
 * @author Unish Rajak
 */

class ThreadA implements Runnable {
    public void run() {
        for (int i = 50; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println("Even: " + i);
        }
    }
}

class ThreadB implements Runnable {
    public void run() {
        for (int i = 100; i <= 200; i++) {
            if (i % 2 != 0)
                System.out.println("Odd: " + i);
        }
    }
}

public class ThreadEvenOddDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadA());
        Thread t2 = new Thread(new ThreadB());

        t1.start();
        t2.start();
    }
}

