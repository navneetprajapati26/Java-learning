package arrays2D_day_2_9;

import java.util.Scanner;

public class qus {

    public static void qus1(int[][] mat) {

        int cunt = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 7) {
                    cunt++;
                }
            }
        }
        System.out.println("number of 7's is " + cunt);
    }

    // Print out the sum of the numbers inthe second row of the “nums” array.
    // Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
    // Output - 18

    public static void qus2() {
        int mat[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[1][i];
        }
        System.out.println(sum);
    }

    // Write a program to Find Transpose of a Matrix.
    // What is Transpose?
    // Transpose of a matrix is the process ofswapping therows to columns.
    // For a 2x3 matrix:-

    // Matrix
    // a11 a12 a13
    // a21 a22 a23

    // Transposed Matrix
    // a11 a21
    // a12 a22
    // a13 a23

    public static void printMat(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int i = sc.nextInt();
        // int j = sc.nextInt();
        // int mat[][] = new int[i][j];

        // for (int k = 0; k < mat.length; k++) {
        // for (int l = 0; l < mat[0].length; l++) {
        // mat[k][l] = sc.nextInt();
        // }
        // }

        int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        // qus1(mat);
        // qus2();
        printMat(mat);

        // Transpose matrix
        int[][] transpose = new int[mat[0].length][mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                transpose[j][i] = mat[i][j];
            }
        }

        printMat(transpose);
    }

}
