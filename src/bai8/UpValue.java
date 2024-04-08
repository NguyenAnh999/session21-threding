package bai8;

import static bai8.Main.x;

public class UpValue extends Thread{
    @Override
    public synchronized void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(x);
            x++;
            try {
                Reduce.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
