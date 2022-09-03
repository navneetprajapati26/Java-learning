package assinmant_7_8;

import java.util.Scanner;

public class fever {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        double temp = cs.nextDouble();

        String a = (temp > 100) ? "You have fever" : "You are halthy";
        System.out.println(a);
    }

}
