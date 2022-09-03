package arrays_day_21_8;

import java.util.Scanner;

public class linear_sarch {

    public static int linear_sarch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // largest and smalest in a array
    public static int getLarg(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smalest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
            if (smalest > arr[i]) {
                smalest = arr[i];
            }
        }
        System.out.println("smalest valu is :- " + smalest);
        return largest;
    }

    // #### binery sharch ####
    public static int binSharch(int arr[], int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if (arr[mid] == key) {// found
                return mid;
            }
            if (arr[mid] < key) {// right
                start = mid + 1;
            } else {// left
                end = mid - 1;
            }
        }
        return -1;
    }

    // reverse an Array
    public static void reverseArry(int arr[]) {
        int reverseArr[] = new int[arr.length];

        int k = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            reverseArr[k] = arr[i];
            k++;
        }

        System.out.println("uuu");

        for (int i = 0; i <= reverseArr.length - 1; i++) {
            System.out.print(reverseArr[i] + " ");
        }

    }

    public static void swpRev(int arr[]) {
        int first = 0, last = arr.length - 1;
        while (first < last) {
            int tamp = arr[last];
            arr[last] = arr[first];
            arr[first] = tamp;

            first++;
            last--;
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // ############## IMPORTENT QS
    // number of pairs
    public static void arrPairs(int arr[]) {

        int tp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + " , " + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("totel number of pair is " + tp);
    }

    // ############## IMPORTENT QS
    // subArr

    public static void subArr(int arr[]) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            // " i " is start
            int start = i;
            for (int j = i; j < arr.length; j++) {
                // " j " is end
                int end = j;
                for (int k = i; k < j; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("totel subarray is " + ts);
    }
    // ############## IMPORTENT QS
    // subArr sum
    // brutFors solution Time complexty O(n^3)

    public static void sumOfsubarr(int arr[]) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // " i " is start
            int start = i;
            for (int j = i; j < arr.length; j++) {
                // " j " is end
                int end = j;
                sum = 0;
                for (int k = i; k <= j; k++) {

                    System.out.print(arr[k] + " ");
                    sum += arr[k];

                }

                System.out.println();
                System.out.println("sum of sub Arr " + sum);
                System.out.println();
                if (maxSum < sum) {
                    maxSum = sum;
                }
                if (minSum > sum) {
                    minSum = sum;
                }

            }
            System.out.println();
        }

        System.out.println("max sum is " + maxSum);
        System.out.println("min sum is " + minSum);

    }

    // optimis solution of maxSum of subArr
    // time complexty O(n^2)
    public static void sumOfsubarrOptimis(int arr[]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < sum) {
                    maxSum = sum;
                }
                if (minSum > sum) {
                    minSum = sum;
                }
            }
        }
        System.out.println("max sum is " + maxSum);
        System.out.println("min sum is " + minSum);
    }

    // K A D A N E's A L G O R I T H A M
    // most imp
    // max sub array sum
    public static void kadanes(int arr[]) {
        int currntSum = 0;
        int maxSum = 0;
        boolean isNge = true;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                isNge = false;
            }
        }

        if (isNge == false) {
            for (int i = 0; i < arr.length; i++) {
                currntSum += arr[i];
                if (currntSum < 0) {
                    currntSum = 0;
                }

                maxSum = Math.max(currntSum, maxSum);
            }
            System.out.println("max sum is " + maxSum);
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (largest < arr[i]) {
                    largest = arr[i];
                }
            }
            System.out.println("max sum is " + largest);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ############# INPUT ARRAY ######################

        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();

        // ################################################

        // reverseArry(arr);
        // System.out.println();
        // swpRev(arr);
        // arrPairs(arr);
        // subArr(arr);
        // sumOfsubarr(arr);
        sumOfsubarrOptimis(arr);
        kadanes(arr);

    }
}
