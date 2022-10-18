import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        System.out.println(remainder(1, 3));
        System.out.println(remainder(3, 4));
        System.out.println(remainder(-9, 45));
        System.out.println(remainder(5, 5));
    }
        public static int remainder(int m, int s) {
            return m%s;
    }
}
