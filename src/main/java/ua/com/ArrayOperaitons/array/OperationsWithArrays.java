package ua.com.ArrayOperaitons.array;

import java.util.Arrays;
import java.util.Collections;

public class OperationsWithArrays {
    public OperationsWithArrays(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 45);
        }
    }

    public static void printMinMaxValue() {
        int array[] = {3, 32, 3, 54, 7, 98, 9, 1, 1, 875, 3, 23, 233, 32, 324, 54, 54, 12, 67, 20};
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            } else if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("min " + min);
        System.out.println("max " + max);
    }

    public static void printIncreaseArray(int array[]) {
        boolean isSorted = false;
        int buf;
        new OperationsWithArrays(array);
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        System.out.print("increase ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printDecreaseArray(int array[]) {
        new OperationsWithArrays(array);
        array = Arrays.stream(array)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(x -> x)
                .toArray();
        System.out.print("decrease " + Arrays.toString(array));
    }

    public static void printSquareArray(int array[]) {
        System.out.println();
        new OperationsWithArrays(array);
        System.out.print("simple array = ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(array[i], 2);
        }
        System.out.println();
        System.out.print("square = ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void printSumArray(int array[]) {
        System.out.println();
        new OperationsWithArrays(array);
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        System.out.print("sum " + result + " = ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
