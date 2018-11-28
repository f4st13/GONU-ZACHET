package tasks;

public class _4_1 {
    public static void _1() {
        // ???
    }

    //2
    public static int _2() {
        short counter = 100;
        while ((counter % 100) * 7 != counter) {
            counter++;
        }
        return counter;
    }

    //3
    public static void _3(int n) {
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0)
                System.out.println(i + " ");
    }

    //4
    public static void _4(int m, int n) {
        int tempSum;
        for (; m < n; m++) {
            tempSum = 0;
            for (int i = 1; i < m; i++) {
                if (m % i == 0) {
                    tempSum += i;
                }
            }
            if (tempSum == m) {
                System.out.println(m + " ");
            }
        }
    }

//пятое задание встречается 3 (!) раза в разных блоках, искать в классе Recursion


    /*
        //Если m, n чётные, то НОД(m, n) = 2*НОД(m/2, n/2);
        //Если m чётное, n нечётное, то НОД(m, n) = НОД(m/2, n);
        //Если n чётное, m нечётное, то НОД(m, n) = НОД(m, n/2);
        Если m, n нечётные и n > m, то НОД(m, n) = НОД(m, (n-m)/2) = НОД((n-m)/2, n);
        Если m, n нечётные и n < m, то НОД(m, n) = НОД((m-n)/2, n);
    */

    //6
    // не уверен в этом (взял у Макса (обменялись кодом))
    public static int nod(int n, int m) {
        if (n == 0)
            return m;
        if (m == 0)
            return n;
        if (n == m)
            return n;
        if (n == 1 || m == 1)
            return 1;
        if ((n & 1) == 0 & (m & 1) == 0)
            return 2 * nod(n / 2, m / 2);
        if ((n & 1) == 1 & (m & 1) == 0)
            return nod(n, m / 2);
        if ((n & 1) == 0 & (m & 1) == 1)
            return nod(n / 2, m);
        if (((n & 1) == 1 & (m & 1) == 1) & (n > m))
            return nod(n - m, m);
        else
            return nod(n, m - n);
    }
}
