package tasks;
import java.util.ArrayList;
import java.util.Scanner;


public class _4_2 {

    void t113() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                System.out.println(i + " ");
            }
        }
    }

    void t7() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int maxD = -1;
        while (n > 9) {
            if (n % 10 > maxD) {
                maxD = n % 10;
            }
            n = n / 10;
        }
        if (n > maxD) {
            System.out.println(n);
        } else {
            System.out.println(maxD);
        }
    }

    void t8() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int minD = 10;
        while (n > 9) {
            if (n % 10 < minD) {
                minD = n % 10;
            }
            n = n / 10;
        }
        if (n < minD) {
            System.out.println(n);
        } else {
            System.out.println(minD);
        }
    }

    void t9() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 1;
        while (n / 10 >= 1) {
            ++c;
            n = n / 10;
        }
        System.out.println(c);
    }

    void t10() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        while (n / 10 >= 1) {
            sum += n % 10;
            n = n / 10;
        }
        sum += n;
        System.out.println(sum);
    }

    void t11() {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>(1);
        int max = Integer.MIN_VALUE;
        do {
            ar.add(ar.size(), in.nextInt());
            if (max < ar.get(ar.size() - 1)) {
                max = ar.get(ar.size() - 1);
            }
        } while (ar.get(ar.size() - 1) != 0);
        System.out.println(max);
    }

    void t12() {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>(1);
        int min = Integer.MAX_VALUE;
        do {
            ar.add(ar.size(), in.nextInt());
            if (min > ar.get(ar.size() - 1) & ar.get(ar.size() - 1) != 0) {
                min = ar.get(ar.size() - 1);
            }
        } while (ar.get(ar.size() - 1) != 0);
        System.out.println(min);
    }

    void t13() {
        Scanner in = new Scanner(System.in);
        int c = 0;
        while (in.nextInt() != 0) {
            ++c;
        }
        System.out.println(c);
    }

    void t14() {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int buf;
        while ((buf = in.nextInt()) != 0) {
            sum += buf;
        }
        System.out.println(sum);
    }


    void t15() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (; n >= 1; --n) {
            if (Math.sqrt(n) % 1 == 0) {
                System.out.print(n + " ");
            }
        }
    }

    void t16() {       // если 2 или более битов в чиле = 1 то не степень двойки
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 1;
        byte flag = 0;
        if ((n & 1) == 0) {
            for (int i = 0; i < 31; i++) {
                if (((n >> i) & 1) == 1) {
                    ++flag;
                    if (flag >= 2) {
                        System.out.println("NO");
                        return;
                    }
                }
            }
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    void t17() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int power = 1;
        if (n < power) {
            return;
        } else {
            if (n == 1) {
                System.out.println(n);
                return;
            }
            System.out.println(power);
            while ((power = power << 1) <= n) {
                System.out.println(power);
            }
        }
    }

    void t18() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 1;
        byte powerCount = 1;
        while ((k = k << 1) < n) {
            ++powerCount;
        }
        System.out.println(powerCount);
    }


    void t19() {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        int c = 1;
        while (x <= y) {
            x = x + x * 0.1;
            ++c;
        }
        System.out.println(c);
    }

    void t20() {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double sum = 0;
        int dayCount = 0;
        while (sum <= y) {
            ++dayCount;
            sum += x;
            x = x + x * 0.1;
        }
        System.out.println(dayCount);
    }

    void t21() {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        int sum = 0;
        do {
            ar.add(in.nextInt());
            sum += ar.get(ar.size() - 1);
        } while (ar.get(ar.size() - 1) != 0);
        System.out.println(sum);
    }

    void t22() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 1;
        double f = 1;
        for (int i = 1; i <= n; i++) {
            f += f * i;
            sum += 1 / f;
        }
        System.out.println(sum);
    }

    void t23() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long fib = 1;
        long fib2 = 1;
        long buf;
        for (int i = 3; i <= n; i++) {
            buf = fib2;
            fib2 = fib + fib2;
            fib = buf;
        }
        System.out.println(fib2);
    }
}
