import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        System.out.println(sumOfCubes(new int[]{1,5,9}));
        System.out.println(sumOfCubes(new int[]{3,4,5}));
        System.out.println(sumOfCubes(new int[]{2}));
        System.out.println(sumOfCubes(new int[]{}));
    }
    public static int sumOfCubes(int[]z){
        int sum=0;
        for (int i = 0; i<z.length; i++){
            sum+=Math.pow(z[i],3);
        }
        return sum;
    }
}
