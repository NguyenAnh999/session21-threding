package bai8;

public class Main {
    public static int x = 0;
    public static void main(String[] args) {
    Reduce reduce = new Reduce();
    UpValue upValue = new UpValue();
    reduce.start();
    upValue.start();
    }
}
