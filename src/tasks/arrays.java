package tasks;

import java.util.ArrayList;
import java.util.Random;

public class Arrays {

    public static void swap(int x, int y) {
        //не знаю что написать здесь
    }

    public static void correct(int x) {
        //не знаю что написать здесь
    }

    //3
    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

    //4
    public static int sumRange(int[] array, int start, int end) {
        if (start < 0 || end < 0 || start > end || end > array.length) return -1;
        int sum = 0;
        for (int i = start; i <= end; i++)
            sum += array[i];
        return sum;
    }

    //5
    public static double getAverage(int[] array, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) sum += array[i];
        return sum / size;
    }

    //6
    public static void change(int[] array, int n, int val) {
        array[n] = val;
    }

    //7
    public static int max(int[] array, int size) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    //8
    public static void printArray(int[] array) {
        int i = array.length - 1;
        while (i >= 0) {
            System.out.print(array[i]);
            System.out.print(" ");
            i--;
        }
    }

    //9
    public static void shuffle(int[] array) {
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    //10
    public static int[] createArray() {
        int[] ar = new int[15];
        Random random = new Random();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(50);
        }
        return ar;
    }

    //10
    public static void clampArray(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) arr[i] = min;
            else if (arr[i] > max) arr[i] = max;
        }
    }

    //11
    public static int[] generateRandomArray(int n) {
        int[] array = new int[n];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(50);
        }
        return array;
    }

    //12
    public static int[] localMax(int[] array) {
        showArray(array);
        System.out.println();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                if (array[i] > array[i + 1])
                    result.add(array[i]);
            } else if (i != 0 && i != array.length - 1) {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    result.add(array[i]);
                }
            }
            if (i == array.length - 1) {
                if (array[i] > array[i - 1]) {
                    result.add(array[i]);
                }
            }
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = result.get(i);
        }

        showArray(resultArray);

        return resultArray;
    }
}
