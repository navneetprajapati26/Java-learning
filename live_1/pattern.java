package live_1;

public class pattern {

    public static void palendrom(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }

        }
    }

    public static void main(String[] args) {
        palendrom(5);

    }

}
