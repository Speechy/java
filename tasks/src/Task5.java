import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        System.out.println(ctoa('A'));
        System.out.println(ctoa('m'));
        System.out.println(ctoa('['));
        System.out.println(ctoa('/'));
    }
    public static int ctoa(char m){
        return ((int) m);
    }
}