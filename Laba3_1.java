import java.util.Scanner;
public class Laba3_1 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String q;
        System.out.print("Введите строку: ");
        q = str.nextLine();
        char[] w = q.toCharArray();
        String res = "";
        isPrime(w,res,q);
    }
    public static void isPrime(char[] w,String res,String q) {
        for (int i = w.length - 1; i >= 0; i--){
            res = res + w[i];
        }
        System.out.println(res.equals(q));
    }
}
