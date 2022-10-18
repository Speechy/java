import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        System.out.println(abcmath(42,5,10));
        System.out.println(abcmath(5,2,1));
        System.out.println(abcmath(1,2,3));
    }
    public static boolean abcmath(int a,int b,int c){
        return (a*Math.pow(2,b))%c==0;
    }
}


