package BasicSorting_day_31_8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class basiSorting {

    public static void printArr(Integer[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.print("]");
    }

    public static void bubbolSort(int[] arr) {
        for (int tarn = 0; tarn < arr.length; tarn++) {
            boolean swap = false;
            for (int i = 0; i < arr.length - 1 - tarn; i++) {
                // swap
                if (arr[i] > arr[i + 1]) {
                    int tamp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tamp;
                    swap = true;
                }
            }
            if (swap == false)
                break;
            // {
            // System.out.println("Arras is all radey sorted");
            // break;
            // }
        }

        // printArr(arr);
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }

            int tam = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = tam;

        }

        // printArr(arr);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curnt = arr[i];
            int priv = i - 1;
            // finding out the correct position to insert
            while (priv >= 0 && arr[priv] > curnt) {
                arr[priv + 1] = arr[priv];
                priv--;
            }

            // insertion
            arr[priv + 1] = curnt;
        }
        // printArr(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Integer arra[] = { 5, 3, 4, 1, 2 };

        printArr(arra);
        // System.out.println();
        // selectionSort(arr);
        // System.out.println();
        // insertionSort(arr);
        // System.out.println();
        // Arrays.sort(arr);
        Arrays.sort(arra, Collections.reverseOrder());
        printArr(arra);

    }
}
