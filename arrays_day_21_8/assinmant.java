package arrays_day_21_8;

import java.util.Scanner;

public class assinmant {

    // #### Q U S T I O N 1
    public static boolean qus1(int arr[]) {
        boolean appears = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    appears = true;
                    break;
                }
            }

        }
        return appears;
    }

    public static void qus5(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println("[" + arr[i] + " " + arr[j] + " " + arr[k] + "]");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length of arr");
        int a = sc.nextInt();
        int arr[] = new int[a];

        System.out.println("Input the elimaint of arr");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.println("Answer of qus1 is " + qus1(arr));
        qus5(arr);

    }
}
