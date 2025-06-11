package lab;

/**
 * @author Unish Rajak
 */

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class SyncThread extends Thread {
    Counter counter;

    public SyncThread(Counter c) {
        counter = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        SyncThread t1 = new SyncThread(c);
        SyncThread t2 = new SyncThread(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + c.getCount());
    }
}

