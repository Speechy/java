import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(7));
    }

    public static int addUpTo(int m) {
        int sum = 0;
        for (int i = 0; i <= m; i++) {
            sum += i;
        }
        return sum;
    }
}