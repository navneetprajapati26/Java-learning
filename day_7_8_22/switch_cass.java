package day_7_8_22;

import java.util.Scanner;

public class switch_cass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("pakodi");
                break;
            case 3:
                System.out.println("jalebi");
                break;
            default:
                System.out.println("we wake up");

        }
    }

}
