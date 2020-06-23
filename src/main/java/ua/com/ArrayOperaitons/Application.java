package ua.com.ArrayOperaitons;

import static ua.com.ArrayOperaitons.array.OperationsWithArrays.*;
import static ua.com.ArrayOperaitons.matrix.Matrix.printDiagonalMatrix;
import static ua.com.ArrayOperaitons.star.ActionsWithArray.printReplaceDuplicates;

public class Application {

    public static void main(String... args) {
        int array[] = new int[20];
        printMinMaxValue();
        printIncreaseArray(array);
        printDecreaseArray(array);
        printSumArray(array);
        printSquareArray(array);
        printDiagonalMatrix();
        printReplaceDuplicates();
    }
}
