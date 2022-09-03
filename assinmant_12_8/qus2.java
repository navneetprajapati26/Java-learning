package assinmant_12_8;

import java.util.Scanner;

public class qus2 {

    public static void isEven(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is a even number");
        } else {
            System.out.println(n + " is a odd number");
        }
    }

    public static void roots(int a, int b, int c) {
        int D = (int) Math.pow(b, 2) - 4 * a * c;
        if (D > 0) {
            int x1 = -b + (int) Math.sqrt(D);
            int x2 = -b - (int) Math.sqrt(D);
            System.out.println(x1 + " first root ");
            System.out.println(x2 + " seconde root");
        } else if (D == 0) {
            int x1 = -b + (int) Math.sqrt(D);
            int x2 = -b + (int) Math.sqrt(D);
            System.out.println(x2 + " only one root have this equation ");
        } else {
            System.out.println("imagenry roots !! ");
        }

    }

    public static void sumOfDig(int n) {
        int a = n;
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            System.out.print(n % 10 + " + ");
            n = n / 10;
        }
        System.out.print("0");
        System.out.println(" = " + sum + " is the sum of digit of " + a);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sumOfDig(n);
        // isEven(n);

        // Qurdatic equation

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // roots(a, b, c);

        // System.out.println(Math.abs(a));

    }

}
