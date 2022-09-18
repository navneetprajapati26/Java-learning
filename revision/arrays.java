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

    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 4 };
        int kay = 2;
        linerSharch(arr, kay);
    }

}
