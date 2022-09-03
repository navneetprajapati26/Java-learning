package assinmant_7_8;

import java.util.Scanner;

public class loop_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a loop year");
                } else {
                    System.out.println(year + " is not a loop year");
                }

            } else {
                System.out.println(year + " is a loop year");
            }
        } else {
            System.out.println(year + " is not a loop year");
        }
    }

}
