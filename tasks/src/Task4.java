import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        System.out.println(operation(24, 19,5));
        System.out.println(operation(24, 26, 2));
        System.out.println(operation(15, 11, 11));

    }
    public static String operation(int N, int a, int b) {

        if (a + b == N ) {
            return ("added");
        }
         if (a - b == N ) {
            return ("subtracted");
        }
        else if (a * b == N ) {
            return ("multiplied");
        }
        else if (a / b == N ) {
            return ("divided");
        }
        else return ("none");
    }
}