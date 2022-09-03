package day_10_8_22_loops;

public class break_of_loops {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                break;

            }
            System.out.println(i);
        }
        System.out.println("out of loop");
    }

}
