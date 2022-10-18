public class Laba3 {
    public static void main(String[] args) {
        for (int i=2; i<=100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int x) {
        boolean checker = true;
        for (int i=2; i<x; i++) {
            if (x%i==0) {
                checker=false;
                break;
            }
        }
        return checker;
    }
}

