package day_10_8_22_loops;

import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for reverse :- ");
        int a = sc.nextInt();
        int rev = 0;

        while (a > 0) {
            int lastDigit = a % 10;
            // printing the number as revers
            System.out.print(lastDigit + " ");

            // reversing the number
            rev = (rev * 10) + lastDigit;
            // System.out.println(rev);
            a /= 10;
        }
        System.out.println(rev);

    }

}
