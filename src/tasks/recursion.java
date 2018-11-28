package tasks;

public class Recursion {
    //1
    public static int pow1(int num, int grade) {
        if (grade == 1) return num;
        else return num * pow1(num, grade);
    }


    //2, 3
    public static double pow(int num, int grade) {
        if (grade < 0) return (1 / pow(num, -1 * grade));
        if (grade == 0) return 1;
        if (grade == 1) return num;
        if ((grade & 1) == 1) return num * pow(num, grade - 1);
        else return pow(num, grade / 2) * pow(num, grade / 2);
    }

    //4
    public static int fibonacci(int n) {
        if (n < 3) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //5
    public static int binomial(int n, int k) {
        if (k == 0 || k == n) return 1;
        else return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }

    //6
    public static void hanoi(int topRing, char from, char inter, char to) {
        if (topRing == 1)
            System.out.println("Disk 1 from " + from + " to " + to);
        else {
            hanoi(topRing - 1, from, to, inter); // from-->inter
            System.out.println("Disk " + topRing + " from " + from + " to " + to);
            hanoi(topRing - 1, inter, from, to); // inter-->to
        }
    }

}