import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        System.out.println(nextEdge(8,10));
        System.out.println(nextEdge(5,7));
        System.out.println(nextEdge(9,2));
    }

    public static int nextEdge(int m, int s) {
        return m + s - 1;
    }
}

