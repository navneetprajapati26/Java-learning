package day_10_8_22_loops;

import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:- ");
        int n = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println(n + " is a prime");
        } else {
            System.out.println(n + "is not a prime");
        }
    }
}
