package revision;

public class arrays {

    // ### 1
    public static void linerSharch(int[] arr, int kay) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == kay) {
                System.out.println(kay + " is at index " + i);
                // break;
            }
        }
    }

    // ### 2
    public static void getLargSmal(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int smalestm = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
            if (smalestm > arr[i]) {
                smalestm = arr[i];
            }
        }
        System.out.println("largest " + largest);
        System.out.println("smalestm " + smalestm);
    }

    // ### 3
    public static void binarySharch(int[] arr, int kay) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == kay) {
                System.out.println(kay + " is at " + mid);
                break;
            } else if (arr[mid] < kay) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 31, 41, 52, 68, 91 };
        int kay = 41;
        // linerSharch(arr, kay);
        // getLargSmal(arr);
        binarySharch(arr, kay);

    }

}
