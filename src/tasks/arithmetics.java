package tasks;

public class Arithmetics {
    //1.2
    public static double fourthPower(double x) {
        x *= x;
        x *= x;
        return x;
    }

    //1.3
    public static double sixthPower(double x) {
        x *= x;
        x *= x;
        x *= x;
        return x;
    }

    //1.4
    public static double seventhPower(double x) {
        double x2 = x * x;
        return x2 * x2 * x2 * x;
    }

    //1.5
    public static double twentyFirstPower(double x) {
        double x2 = x * x;
        double x4 = x2 * x2;
        double x8 = x4 * x4;
        double x16 = x8 * x8;
        return x16 * x4 * x;
    }

    //1.6
    public static int lastDigit(int x) {
        return x % 10;
    }

    //1.7
    public static int tensNum(int x) {
        return x / 10;
    }

    //1.8
    public static int numOfTens(int x) {
        x = x / 10;
        return x % 10;
    }

    //1.9
    public static int sumOfDigits(int x) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += x % 10;
            x = x / 10;
        }
        return sum;
    }

    //1.10
    public static int km(int v, int t) {
        return (v * t) % 109;
    }

    //1.11
    public static int[] time(int m) {
        int[] t = new int[2];
        t[0] = (m / 60) % 24; //hours
        t[1] = m % 60;          //minutes
        return t;
    }

    //1.12
    public static double angle(int h, int m, int s) {
        int seconds = s + (m * 60) + (h * 3600);
        return (seconds / 120) % 360;
    }


}
