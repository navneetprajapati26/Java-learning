package assinmant_10_8;

import java.util.Scanner;

public class qus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int even = 0;
        int odd = 0;

        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0) {
                even += i;
                System.out.println(i + " is even");
            } else {
                odd += i;
                System.out.println(i + " is odd");
            }

        }

        System.out.println(even + " is sum of even numbers");
        System.out.println(odd + " is sum of odd numbers");
    }
}
