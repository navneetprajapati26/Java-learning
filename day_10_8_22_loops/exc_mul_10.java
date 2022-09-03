package day_10_8_22_loops;

import java.util.Scanner;

public class exc_mul_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter the num: ");
            int a = sc.nextInt();
            if (a % 10 == 0) {
                continue;

            }
            System.out.println(a);

        } while (true);
    }
}
