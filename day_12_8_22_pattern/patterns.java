package day_12_8_22_pattern;

import java.util.Scanner;

public class patterns {

    public static void pyr(int n) {
        // row
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pyr_num(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // floyds triangle
    public static void floyds(int n) {

        int cun = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(cun + " ");
                cun++;
            }
            System.out.println();
        }
    }

    // 0-1 triangle

    public static void tringal_0_1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {

                    System.out.print(1 + " ");
                } else {

                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    // butterfly pattern
    public static void butterfly(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces - 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // 2nd half
        for (int i = n; i > 1; i--) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces - 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    // rombous

    public static void romb(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // holw rombous
    public static void holw_rom(int n) {
        for (int i = 1; i <= n; i++) {
            // for tille
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for holw rrec
            for (int j = 1; j <= n; j++) {
                // (i,j)
                if (i == 1 || j == 1 || j == n || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // diamond
    public static void diamomd(int n) {
        // outer loop of first half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stare
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i > 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stare
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void num_prm(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void palindromic(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(" " + j + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tringal_0_1(n);
        butterfly(n);
        romb(n);
        holw_rom(n);
        diamomd(n);
        num_prm(n);
        palindromic(n);

    }

}
