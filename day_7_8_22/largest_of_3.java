package day_7_8_22;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class largest_of_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " big");
        } else if (b > c) {
            System.out.println(b + " big");
        } else {
            System.out.println(c + " big");
        }
    }

}
