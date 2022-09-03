package assinmant_10_8;

import java.util.Scanner;

public class qus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int facto = 1;
        for (int i = 0; i < n; i++) {
            facto = facto * (n - i);
        }

        // sol

        int factorial = 1;
        for (int j = 1; j <= n; j++) {
            factorial *= j;
        }

        System.out.println(factorial);

        System.out.println(facto + " is factorial of " + n);

    }
}
