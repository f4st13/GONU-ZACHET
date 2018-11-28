package tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class SumFactorials {

    //3.1
    public static int sum1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i * i;
        }
        return sum;
    }

    //3.2
    public static int sum2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i - 1) * i;
        }
        return sum;
    }

    //3.3
    public static int sum3(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }
        return sum;
    }

    //3.4
    public static ArrayList<Integer> sum4(int a, int b) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            if ((i & 1) == 0) result.add(i);
        }
        return result;
    }

    //3.5
    public static int sum5(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++)
            res *= i;
        return res;
    }

    //3.6
    private static long factorial(long x) {
        long sum = 1;
        for (int i = 1; i <= x; i++) {
            sum *= i;
        }
        return sum;
    }

    public static double sum6(long n, long k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    //3.7 повторяется в каком-то другом месте

    //3.8
    public static double sum8(int n) {
        double sum = 1;
        for (; n > 1; n--) {
            sum += 1 / n * n;
        }
        return sum;
    }

    //3.9
    public static double sum9(int n) {
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(-1, i) / (2 * i + 1);
        }
        return sum * 4;
    }

    //3.10
    public static double sum10(double a, int n) {
        double buf = 1;
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            buf = buf * i;
            sum += buf;
        }
        return sum;
    }

    //3.11
    void sum11() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += in.nextInt();
        }
        System.out.println(sum);
    }

    //3.12
    void sum12() {
        for (int i = 10; i <= 99; i++) {
            if (i == 2 * (i % 10) * (i / 10)) {
                System.out.println(i);
            }
        }
    }

    //3.13
    void sum13() {
        for (int i = 100; i <= 999; i++) {
            if ((i * i) % 1000 == i) {
                System.out.println(i);
            }
        }
    }
}
