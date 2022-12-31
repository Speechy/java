public class Laba3 {
    public static void main(String[] args) {
        for (int i=2; i<=100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int x) {
        boolean checker = false;
            if (x%7==0) {
                checker = true;
            }
        return checker;
    }
}

