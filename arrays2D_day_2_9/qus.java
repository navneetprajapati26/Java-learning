package arrays2D_day_2_9;

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

    public static void main(String[] args) {
        int mat[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        qus1(mat);
        qus2();

    }

}
