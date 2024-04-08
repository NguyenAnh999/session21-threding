package bai6;

public class OptimizedPrimeFactorization implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i <= 1) {
                System.out.println("đây không phải số nguyên tố");
            } else if (i == 2) {
                System.out.println("số" + i + "là sng");
            }
            boolean isPrimeNum = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrimeNum = false;
                }
            }
            if (isPrimeNum) {
                System.out.println("số" + i + "là sng");
                System.out.println("------------------------------------");
            } else {
                System.out.println("số" + i + "không là sng");
                System.out.println("------------------------------------");

            }
        }
    }
}
