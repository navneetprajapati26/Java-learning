package assinmant_9_4;

import java.util.Scanner;

public class qus3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("pencil");
        float pencil = sc.nextFloat();

        System.out.println("pan");
        float pan = sc.nextFloat();

        System.out.println("erassr");
        float erassr = sc.nextFloat();

        System.out.println("totel bill is :- ");
        float total = pan + pencil + erassr;
        System.out.println(total);

        float withGST = total + total * 18 / 100;
        System.out.println("totel bill is with GST 18% :- ");
        System.out.print(withGST);

    }

}
