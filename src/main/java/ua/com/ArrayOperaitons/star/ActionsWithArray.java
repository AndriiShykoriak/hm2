package ua.com.ArrayOperaitons.star;

public class ActionsWithArray {
    public static void printReplaceDuplicates() {
        int[] array = {3, 2, 3, 1, 4, 2, 8, 3};
        System.out.println();
        System.out.print("first array     ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
        System.out.println();
        System.out.print("replace by zero ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
