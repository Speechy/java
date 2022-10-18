import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        System.out.println(animals(2, 3,5 ));
        System.out.println(animals(1, 2, 3));
        System.out.println(animals(5, 2, 8));
    }
    public static int animals(int t, int m, int c ) {
        return t*2+m*4+c*4;
    }
}
