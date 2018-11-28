package tasks;

public class Bits {

    //2.1
    public static int twoToNPower(int n) {
        return 1 << n;
    }

    //2.2
    public static int sumOftwoNMPower(int n, int m) {
        n = 1 << n;
        m = 1 << m;
        return n + m;
    }

    //2.3
    public static int zeroOutLowerBits(int A, int i) {
        A = A >> i;
        A = A << i;
        return A;
    }

    //2.4
    public static int setBitToOne(int A, int i) {
        return A |= (1 << i);
    }

    //2.5
    public static int invertBit(int A, int i) {
        return A ^= (1 << i);
    }

    //2.6
    public static int setBitToZero(int A, int i) {
        return A &= ~(1 << i);
    }

    //2.7
    public static int getLowerBits(int A, int i) {
        A = A << (32 - i);
        A = A >>> (32 - i);
        return A;
    }

    //2.8
    public static int getBit(int A, int i) {
        A = A >> i;
        A = A & 1;
        return A;
    }

    //2.9 (немного некорректное задание)
    public static String byteInBinary(int A) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < 8; i++) {
            result.append(A & 1);
            A = A >> 1;
        }
        return result.reverse().toString();
    }
}
