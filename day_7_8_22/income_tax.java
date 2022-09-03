package day_7_8_22;

import java.util.Scanner;

public class income_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        double t;

        if (i < 500000) {
            t = 0;
            System.out.println(t + "tax");
        } else if (i > 500000 && i < 1000000) {

            t = i * (0.2);
            System.out.println(t + "tax");
        } else {
            t = i * (0.3);
            System.out.println(t + "tax");
        }

    }

}
