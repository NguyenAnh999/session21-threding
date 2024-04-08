package bai6;

public class bai6{
    public static void main(String[] args) {
        LazyPrimeFactorization myRunnable = new LazyPrimeFactorization();
        Thread threadRunnable = new Thread(myRunnable);


        OptimizedPrimeFactorization myRunnableVip = new OptimizedPrimeFactorization();
        Thread threadRunnableVip = new Thread(myRunnableVip);
        threadRunnable.start();
        threadRunnableVip.start();
    }
}
