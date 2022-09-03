package day_7_8_22;

import java.util.Scanner;

public class largest_of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is larg");
        }

        else {
            System.out.println(b + " is larg");
        }
    }

}
