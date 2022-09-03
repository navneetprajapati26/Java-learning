package day_12_8_22_function;

import java.util.Scanner;

public class prime {

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(a + " is prime :- " + isPrime(a));

        for (int i = 2; i <= a; i++) {
            if (isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

}
