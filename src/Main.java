import tasks.Arrays;
import tasks.ArraysSort;


public class Main {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {2, 4};

        int[] c = ArraysSort.intersection(a, b);
        Arrays.showArray(c);
        System.out.println();
    }
}



