import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        System.out.println(profitableGamble(0.2, 50,9));
        System.out.println(profitableGamble(0.9, 1, 2));
        System.out.println(profitableGamble(0.9, 3, 2));
    }
    public static boolean profitableGamble(double probe, int prize, int pay) {
        return probe * prize > pay;
    }
}
