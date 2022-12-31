//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;

public class Task2 {
    public Task2() {
    }

    public static void main(String[] args) {
        System.out.println(repeat("mice", 5));
        System.out.println(repeat("hello", 3));
        System.out.println(repeat("stop", 1));
        System.out.println("");
        System.out.println(differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(differenceMaxMin(new int[]{44, 32, 86, 19}));
        System.out.println("");
        System.out.println(isAvgWhole(new int[]{1, 3}));
        System.out.println(isAvgWhole(new int[]{1, 2, 3, 4}));
        System.out.println(isAvgWhole(new int[]{1, 5, 6}));
        System.out.println("");
        System.out.println(cumulativeSum(new int[]{1, 2, 3}));
        System.out.println(cumulativeSum(new int[]{1, -2, 3}));
        System.out.println(cumulativeSum(new int[]{3, 3, -2, 408, 3, 3}));
        System.out.println("");
        System.out.println(getDecimalPlaces("43.20"));
        System.out.println(getDecimalPlaces("400"));
        System.out.println(getDecimalPlaces("3.1"));
        System.out.println("");
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(12));
        System.out.println("");
        System.out.println(isValid("59001"));
        System.out.println(isValid("9393939"));
        System.out.println(isValid("590 01"));
        System.out.println(isValid("590a01"));
        System.out.println("");
        System.out.println(isStrangePair("ratio", "orator"));
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println(isStrangePair("", ""));
        System.out.println("");
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isPrefix("retrospect", "sub-"));
        System.out.println(isSuffix("vocation", "-logy"));
        System.out.println("");
        System.out.println(boxSeq(0));
        System.out.println(boxSeq(1));
        System.out.println(boxSeq(2));
        System.out.println(boxSeq(6));
        System.out.println(boxSeq(7));
    }

    public static String repeat(String string, int repeats) {
        String newstring = "";

        for(int i = 0; i < string.length(); ++i) {
            for(int k = repeats; k != 0; --k) {
                newstring = newstring + string.charAt(i);
            }
        }
        return newstring;
    }

    public static int differenceMaxMin(int[] int_list) {
        int min_n = int_list[0];
        int max_n = int_list[0];
        int[] var3 = int_list;
        int var4 = int_list.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int num = var3[var5];
            if (num < min_n) {
                min_n = num;
            }

            if (num > max_n) {
                max_n = num;
            }
        }
        return max_n - min_n;
    }

    public static boolean isAvgWhole(int[] ints) {
        int n = ints.length;
        double sum_num = 0.0D;
        int[] var4 = ints;
        int var5 = ints.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            int num = var4[var6];
            sum_num += (double)num;
        }
        return sum_num % (double)n == 0.0D;
    }

    public static String cumulativeSum(int[] ints) {
        int orig_num = 0;

        for(int i = 0; i < ints.length; ++i) {
            if (i > 0) {
                orig_num = ints[i - 1];
            }
            ints[i] += orig_num;
        }
        return Arrays.toString(ints);
    }

    public static double getDecimalPlaces(String string) {
        double value = Double.parseDouble(string);
        return (double)Math.round(value % 1.0D * 100.0D) / 10.0D;
    }

    public static int fibonacci(int num) {
        int num_1 = 0;
        int num_2 = 1;
        int sum_num = 0;

        for(int i = 0; i < num; ++i) {
            sum_num = num_1 + num_2;
            num_1 = num_2;
            num_2 = sum_num;
        }
        return sum_num;
    }

    public static boolean isValid(String string) {
        if (string.length() > 5) {
            return false;
        } else {
            for(int i = 0; i < string.length(); ++i) {
                char letter = string.charAt(i);
                if (!Character.isDigit(letter)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean isStrangePair(String a, String b) {
        if (a == "" && b == "") {
            return true;
        } else {
            return a.charAt(a.length() - 1) == b.charAt(0) && a.charAt(0) == b.charAt(b.length() - 1);
        }
    }

    public static boolean isPrefix(String word, String prefix) {
        for(int i = 0; i < prefix.length() - 1; ++i) {
            if (word.charAt(i) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSuffix(String word, String suffix) {
        for(int i = 1; i < suffix.length(); ++i) {
            int dif = i + (word.length() - suffix.length());
            if (word.charAt(dif) != suffix.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static int boxSeq(int step) {
        if (step == 0) {
            return 0;
        } else {
            return step % 2 == 0 ? step : step + 2;
        }
    }
}
