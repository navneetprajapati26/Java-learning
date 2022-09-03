package day_12_8_22_function;

import java.util.Scanner;

public class b_to_d {

    public static void b_to_d(int biNum) {
        int pow = 0;
        int decNum = 0;
        while (biNum > 0) {
            int lD = biNum % 10;
            decNum = decNum + (lD * (int) Math.pow(2, pow));

            pow++;
            biNum = biNum / 10;
        }
        System.out.println(decNum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        b_to_d(a);
    }

}
