package bitManipuletion;

// # Propertis of XOR
// 1] n^n = 0
// 2] 0^n = n
public class xorQus {
    public static void main(String[] args) {

        // Qus 1
        // find non repiting elimaint in Array

        int arr[] = { 1, 2, 1, 2, 4 };
        impNonRepiting();
    }

    // Qus 1
    // find non repiting elimaint in Array
    public static int nonRepiting(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        return ans;
    }

    public static void impNonRepiting() {
        int arr[] = { 1, 2, 1, 2, 4 };
        System.out.println("non repiting elimaint in Array :- " + nonRepiting(arr));
    }
}
