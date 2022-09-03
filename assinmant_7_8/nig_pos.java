package assinmant_7_8;

import java.util.Scanner;

public class nig_pos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String y = (a < 0) ? "a is nigetiv" : "a is postiv";
        System.out.println(y);
    }

}
