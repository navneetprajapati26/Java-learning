package arrays_day_21_8;

import java.util.Scanner;

public class basic {

    public static void arrCreation() {
        // 1st type
        int marks[] = new int[50];

        // 2nd type
        int num[] = { 1, 2, 3, 4 };

        // exampel
        int arr[] = new int[3];
        arr[0] = 3;
    }

    // array input, output, update-
    public static void opretionArrays() {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // marks[3] = sc.nextInt();

        // System.out.println("dsa " + marks[0]);
        // System.out.println("toc " + marks[1]);
        // System.out.println("micro " + marks[2]);

        System.out.println("lanthe of arr : " + marks.length);

    }

    public static void update(int arr[], int nonChengebal) {
        nonChengebal = 20;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;

        }
    }

    public static void main(String[] args) {

        // opretionArrays();
        int arr[] = { 1, 2, 3, 4, 5 };
        int nonChengebal = 10;
        update(arr, nonChengebal);
        System.out.println(nonChengebal);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // System.out.println();

        // update(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
    }
}
