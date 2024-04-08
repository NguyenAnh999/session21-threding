package bai5;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start();
        try {
            oddThread.join(); // Wait for oddThread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        evenThread.start();
    }
}