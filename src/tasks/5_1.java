package tasks;

import java.util.ArrayList;
import java.util.Scanner;


public class _5_1 {

    void t1 () {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double m=0,n =1;
        while (m <= b*d) {
            ++m;
            while (b*d >= n) {
                if (m/n == ((a/b) + (c/d))) {
                    System.out.println(m + " " + n);
                    return;
                }
                ++n;
            }
            n = 1.0;
        }
    }

    void t2 () {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        while (a != b) {
            if (a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        System.out.println(a);
    }

    void t3 () {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // ??
    }

    // лютый говнокод
    void t4 () {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (Math.sqrt(n) % 1.0 == 0.0) {
            System.out.println(Math.sqrt(n));
            return;
        }
        ArrayList<Integer> squerz = new ArrayList<>();
        for (int i = 4; i < n; i++) {
            if (Math.sqrt(i) % 1.0 == 0.0) {
                squerz.add(i);
            }
        }
        int buf1;
        int buf2;
        first : for (int i =0; i < squerz.size(); i++) {
            for (int j = 0; j < squerz.size(); j++) {
                if ((buf1 = squerz.get(i) + squerz.get(j)) == n) {
                    System.out.println(squerz.get(i) + " + " + squerz.get(j) + " = " + n);
                    break first;
                }
                for (int z =0; z < squerz.size(); z++) {
                    if ((buf2 = (buf1 + squerz.get(z))) == n) {
                        System.out.println(squerz.get(i) + " + " + squerz.get(j) + " + " + squerz.get(z) + " = " + n);
                        break first;
                    }
                    for (int q =0; q < squerz.size(); q++) {
                        if (buf2 + squerz.get(q) == n) {
                            System.out.println(squerz.get(i) + " + " + squerz.get(j) + " + " + squerz.get(z) + " + " + squerz.get(q) +  " = " + n);
                            break first;
                        }
                    }
                }
            }
        }
    }

    void t5 () {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> simpleD = new ArrayList();
        simpleD.add(1);
        for (int i = 3; i < n; i += 2) {
            if (((i % 3 == 0) & i > 6)) { }
            else {
                if (isSimple(i)) {
                    simpleD.add(i);
                }
            }
        }
        for (int i = 0; i<simpleD.size()-1; i++) {
            for (int j = i+1; j < simpleD.size(); j++) {
                if (simpleD.get(i) + simpleD.get(j) == n) {
                    System.out.println(simpleD.get(i) + " + " + simpleD.get(j) + " = " + n);
                }
            }
        }
    }

    boolean isSimple (int x) {
        for (int i =2; i<x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

}
