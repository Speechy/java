import java.util.Arrays;

public class Task3 {
    // Класс, в котором все таски из файла task3.pdf

    public static void main(String[] args) {

        //Для первого задания:
        System.out.println(solutions(1, 0, -1));
        System.out.println(solutions(1, 0, 0));
        System.out.println(solutions(1, 0, 1));
        System.out.println( );

        //Для второго задания:
        System.out.println(findZip("all zip files are zipped"));
        System.out.println(findZip("all zip files are compressed"));
        System.out.println( );

        //Для третьего:
        System.out.println(checkPerfect(6));
        System.out.println(checkPerfect(28));
        System.out.println(checkPerfect(496));
        System.out.println(checkPerfect(12));
        System.out.println(checkPerfect(97));
        System.out.println( );

        //Для четвёртого:
        System.out.println(flipEndChars("Cat, dog, and mouse."));
        System.out.println(flipEndChars("ada"));
        System.out.println(flipEndChars("Ada"));
        System.out.println(flipEndChars("z"));
        System.out.println( );

        //Для пятого:
        System.out.println(isValidHexCode("#CD5C5C"));
        System.out.println(isValidHexCode("#EAECEE"));
        System.out.println(isValidHexCode("#eaecee"));
        System.out.println(isValidHexCode("#CD5C58C"));
        System.out.println(isValidHexCode("#CD5C5Z"));
        System.out.println(isValidHexCode("#CD5C&C"));
        System.out.println(isValidHexCode("CD5C5C"));
        System.out.println( );

        //Для шестого:
        int[] m = {1, 3, 4, 4, 4};
        int[] n = {2, 5, 7};
        System.out.println(same(m,n));
        int[] a = {9, 8, 7, 6};
        int[] b = {4, 4, 3, 1};
        System.out.println(same(a,b));
        int[] x = {2};
        int[] y = {3, 3, 3, 3, 3};
        System.out.println(same(x,y));
        System.out.println( );

        //Для седьмого:
        System.out.println(isKaprekar(3));
        System.out.println(isKaprekar(5));
        System.out.println(isKaprekar(297));
        System.out.println( );

        //Для восьмого:
        System.out.println(longestZero("01100001011000"));
        System.out.println(longestZero("100100100"));
        System.out.println(longestZero("11111"));
        System.out.println( );

        //Для девятого:
        System.out.println(nextPrime(12));
        System.out.println(nextPrime(24));
        System.out.println(nextPrime(11));
        System.out.println( );

        //Для десятого:
        System.out.println(rightTriangle(3, 4, 5));
        System.out.println(rightTriangle(145, 105, 100));
        System.out.println(rightTriangle(70, 130, 110));
    }

    public static int solutions(int a, int b, int c) {
        int x = 0;
        int d = ((b * b) - 4 * a * c);
        if (d == 0) x = 1;
        if (d > 0) x = 2;
        return x;
    }

    // Метод ищет второе вхождение слова "zip".
    private static int findZip(String text) {
        char[] word = "zip".toCharArray();
        char[] charText = text.toCharArray();
        int c = 0;
        int answer = -1;

        for (int i = 0; i < text.length() - 2; i++) {
            if (charText[i] == word[0]
                    && charText[i + 1] == word[1]
                    && charText[i + 2] == word[2])
                c++;
            if (c == 2)
                answer = i + 1;
        }
        return answer;

    }

    // Метод проверяет число на совершенство.
    private static boolean checkPerfect(int n) {
        int cal = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                cal += i;
        }

        return cal == n;

    }

    /*
     * Метод принимает строку и возвращает новую строку с
     * заменой ее первого и последнего символов, за исключением трех условий:
     * – Если длина строки меньше двух, верните "несовместимо".".
     * – Если первый и последний символы совпадают, верните "два-это пара.".
     */

    private static String flipEndChars(String word) {
        if (word.length() < 2)
            return "Incompatible.";
        else {
            char[] temp = word.toCharArray();
            if (temp[0] == temp[temp.length - 1])
                return "Two's a pair.";
            else {
                char t = temp[0];
                temp[0] = temp[temp.length - 1];
                temp[temp.length - 1] = t;
                return String.valueOf(temp);

            }
        }
    }

    // Метод определяет, является ли строка допустимым шестнадцатеричным кодом.
    private static boolean isValidHexCode(String word) {
        return word.matches("^#[0-9A-Fa-f]{6}");
    }

    // Метод я возвращает true, если два массива имеют одинаковое
    // количество уникальных элементов, и false в противном случае.
    private static boolean same(int[] arr1, int[] arr2) {
        int c1 = 1;
        int c2 = 1;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] != arr1[i + 1])
                c1++;
        }

        for (int i = 0; i < arr2.length - 1; i++) {
            if (arr2[i] != arr2[i + 1])
                c2++;
        }
        return c1 == c2;
    }

    // Метод возвращает true, если это число Капрекара,
    // и false, если это не так.
    private static boolean isKaprekar(int n) {
        String nq = String.valueOf(n * n);

        if (n == 0 || n == 1)
            return true;

        else if (nq.length() % 2 != 0) {
            nq = "0".concat(nq);
        }

        String left = "";
        String right = "";

        for (int i = 0; i < nq.length() / 2; i++) {
            left += nq.charAt(i);
            right += nq.charAt(nq.length() / 2 + i);
        }

        return Integer.parseInt(right) + Integer.parseInt(left) == n;
    }

    // Метод возвращает самую длинную последовательность
    // последовательных нулей в двоичной строке.
    private static String longestZero(String zeros) {
        char[] charz = zeros.toCharArray();
        String z = "";
        String b = "";

        for (int i = 0; i < charz.length; i++) {
            if (charz[i] == '0') {
                z += "0";
                if (b.length() < z.length())
                    b = z;
            } else
                z = "";
        }

        return b;
    }

    // Метод возвращает следующее простое число.
    // Если число простое, возвращает само число.
    private static int nextPrime(int n) {
        int f = 2;
        int num = 2;

        while (f < n) {
            int c = 1;
            num++;
            for (int i = 2; i < num; i++) {
                if (num % i == 0)
                    c++;
                if (c != 1)
                    break;
            }

            if (c == 1)
                f = num;
        }
        return f;
    }

    // Метод определяет, являются ли они ребрами
    // прямоугольного треугольника.
    private static boolean rightTriangle(int x, int y, int z) {
        int[] edges = { x, y, z };
        Arrays.sort(edges);
        return edges[0] * edges[0] + edges[1] * edges[1] == edges[2] * edges[2];
    }

}
