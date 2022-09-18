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

    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 4 };
        int kay = 2;
        // linerSharch(arr, kay);
        getLargSmal(arr);
    }

}
