package arrays_day_21_8;

import java.util.Scanner;

public class impQus {

    public static int trappedrainWater(int arr[]) {
        int n = arr.length;
        // leftMax Boundary Array
        int leftMax[] = new int[n];

        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        // RightMax Boundary Array
        int rightMax[] = new int[n];

        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        // loop for calculating rain water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevl = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevl - arr[i];
        }

        return trappedWater;

    }

    public static int sellStock(int arr[]) {
        int buyPrice = Integer.MAX_VALUE;

        int maxPrice = 0;
        for (int i = 0; i < arr.length; i++) {
            if (buyPrice < arr[i]) {
                int profit = arr[i] - buyPrice;

                maxPrice = Math.max(maxPrice, profit);

            } else {
                buyPrice = arr[i];
            }
        }
        return maxPrice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lanthe of Array:- ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the elimant of Array:- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // int arr[] = { 4, 2, 0, 6, 3, 2, 5 };

        // System.out.println("totel rain water is " + trappedrainWater(arr));
        System.out.println("totel profit " + sellStock(arr));
    }
}
