package tasks;

import java.util.ArrayList;
import java.util.Arrays;


public class If {

    //4.1
    public static int compare(int x, int y) {
        return x >= y ? x : y;
    }

    //4.2
    public static int compare2(int x, int y) {
        if (x > y) {
            return 1;
        } else if (x < y) {
            return 2;
        } else return 0;
    }

    //4.3
    public static int compare3(int x, int y, int z) {
        return compare(x, compare(y, z));
    }

    //4.4
    public static int sigh(int x) {
        if (x > 0) return 1;
        else if (x < 0) return -1;
        else return 0;
    }

    //4.5
    public static int matches(int x, int y, int z) {
        if (x == y)
            if (x == z) return 3;
            else return 2;
        else {
            if (x == z || y == z) return 2;
            else return 0;
        }
    }

    //4.6
    public static boolean rook(int a, int b, int c, int d) {
        return (a == c) || (b == d);
    }

    //4.7
    public static ArrayList<Double> roots(double a, double b, double c) {
        ArrayList<Double> roots = new ArrayList<>(2);
        double d = b * b - 4 * a * c;
        if (d < 0) return null;
        else if (d == 0) {
            roots.add((-b) / 2 * a);
        } else if (d > 0) {
            roots.add((-b - Math.sqrt(d)) / 2 * a);
            roots.add((-b + Math.sqrt(d)) / 2 * a);
        }
        return roots;
    }
    //4.8

    public static String triangle(int a, int b, int c) {
        int[] mas = {a, b, c};
        Arrays.sort(mas);
        if (mas[0] + mas[1] <= mas[2]) return "impossible";
        int cathetusSum = mas[0] * mas[0] + mas[1] * mas[1];
        int hypotenuse = mas[2] * mas[2];


        if (cathetusSum == hypotenuse) return "rectangular";
        else if (cathetusSum < hypotenuse) return "obtuse";
        else if (cathetusSum > hypotenuse) return "acute";
        else return "impossible";
    }

    //4.9

    public static int[] tickets(int n) {

        int[] ticketsAmount = new int[3];
        int[] prices = {440, 125, 15};
        int[] number = {60, 10, 1};

        for (int i = 0; i < 2; i++) {
            ticketsAmount[i] = n / number[i];
            n = n % number[i];

            if (n / number[i + 1] * prices[i + 1] >= prices[i]) {
                ticketsAmount[i]++;
                return ticketsAmount;
            }
        }
        ticketsAmount[2] = n;
        return ticketsAmount;
    }

    //4.10

    public static int[] tickets2(int n) {

        int[] amount = {1, 5, 10, 20, 60};
        int[] points = {1, 5, 9, 18, 36};
        int[] result = new int[5];

        for (int i = result.length - 1; i >= 0; i--) {
            while (n >= points[i]) {
                result[i]++;
                n = n - amount[i];
            }
        }
        return result;
        
    }
}


