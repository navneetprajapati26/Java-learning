package arrays2D_day_2_9;

import java.util.Scanner;

public class twoD {

    public static void maricx(int mat[][]) {
        Scanner sc = new Scanner(System.in);
        int row = mat.length, col = mat[0].length;

        // input of matrix
        for (int i = 0; i < mat.length; i++) {
            System.out.println("Enter the colmub " + i);
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = sc.nextInt();
            }

        }

        // output of matrix
        for (int i = 0; i < mat.length; i++) {
            System.out.print("[");
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(" " + mat[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;

        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endCol && startCol <= endCol) {
            // top

            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottem
            for (int j = endCol - 1; j >= startCol; j--) {
                // if (startRow == endRow) {
                // break;
                // }
                System.out.print(matrix[endRow][j] + " ");

            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                // if (startCol == endCol) {
                // break;
                // }
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int mat[][] = new int[4][3];
        // maricx(mat);

        int matrix[][] = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 },
        };
        printSpiral(matrix);
    }

}
