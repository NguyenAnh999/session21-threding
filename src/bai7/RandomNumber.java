package bai7;

public class RandomNumber extends Thread{
    @Override
   public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println((int)(Math.random()*100));
        }
    }



}
