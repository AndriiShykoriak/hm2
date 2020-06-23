package ua.com.ArrayOperaitons.matrix;

public class Matrix {
    public static void printDiagonalMatrix() {

        String matrix[][] = {
                {"Lviv", "Kiev", "Odesa"},
                {"Harkiv", "White_Church", "Kolomyia"},
                {"Zhytomyr", "Chernivtsi", "Dnipro"},
        };
        System.out.println();
        System.out.print("matrix ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j].equals(matrix[j][i])) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
