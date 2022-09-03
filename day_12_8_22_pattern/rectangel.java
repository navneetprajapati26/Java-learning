package day_12_8_22_pattern;

public class rectangel {

    public static void rct(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                // (i,j)
                if (i == 1 || j == 1 || j == row || i == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        rct(10, 10);
    }

}
