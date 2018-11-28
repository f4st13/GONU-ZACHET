package tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysSort {

    //1
    public static int search(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) return i;
        }
        return -1;
    }

    //2
    public static int countMax(int[] array) {
        int max = array[0];
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                count = 1;
            }
            if (array[i] == max) count++;
        }
        return count;
    }

    //3
    public static int lastMax(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    //4
    public static int[] merge(int[] mas1, int[] mas2) {
        int[] result = new int[mas1.length + mas2.length];
        int a = 0, b = 0;
        for (int i = 0; i < result.length; i++) {
            if (a < mas1.length && b < mas2.length)
                if (mas1[a] < mas2[b]) result[i] = mas1[a++];
                else result[i] = mas2[b++];
            else if (b < mas2.length)
                result[i] = mas2[b++];
            else
                result[i] = mas1[a++];
        }
        return result;
    }

    //5
    public static int[] numOnNums(int[] array) {
        int[] result = new int[9];
        for (int i = 0; i < array.length; i++) {
            result[array[i] - 1]++;
        }
        return result;
    }

    //6
    public static int[] numOfNums2() {
        int[] array = new int[9];
        System.out.println("Введите последовательность чисел от 1 до 9, последнее число - 0");
        Scanner in = new Scanner(System.in);
        int current = 0;
        do {
            current = in.nextInt();
            if (current != 0) array[current - 1]++;
        } while (current != 0);
        return array;
    }

    //7
    public static int[] selectionSort(int[] array) {
        int min, temp;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) min = j;
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;
    }

    //8
    public static int[] bubbleSort(int[] array) {
        int temp = 0;
        for (int i = array.length - 1; i > 1; i--)
            for (int j = 0; j < i; j++)
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        return array;
    }

    //9
    public static int[] insertSort(int[] array) {
        int j, i;
        for (i = 1; i < array.length; i++) {
            int temp = array[i];
            j = i;
            while (j > 0 && array[j - 1] >= temp) {
                array[j] = array[j - 1];
                j--; //
            }
            array[j] = temp;
        }
        return array;
    }

    //10
    public static int[] intersection(int[] array1, int[] array2) {
        ArrayList<Integer> result = new ArrayList<>();

        int a = 0;
        int b = 0;
        while (a < array1.length && b < array2.length) {
            if (array1[a] == array2[b]) {
                result.add(array1[a]);
                a++;
                b++;
            } else if (array1[a] > array2[b]) b++;
            else a++;
        }
        int[] resultArray = new int[result.size()];

        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}
