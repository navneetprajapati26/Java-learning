package day_10_8_22_loops;

import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cunter = 0;
        while (cunter <= n) {
            System.out.print(cunter + " ");
            cunter++;
        }
        System.out.println();
    }

}
