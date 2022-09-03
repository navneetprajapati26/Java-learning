package day_12_8_22_function;

import java.util.Scanner;

public class nCr {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int nCr(int n, int r) {

        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);

        System.out.println("enter the value of n :-");
        int n = sv.nextInt();
        System.out.println("enter the value of r :-");
        int r = sv.nextInt();

        System.out.println("nCr is " + nCr(n, r));
    }

}
