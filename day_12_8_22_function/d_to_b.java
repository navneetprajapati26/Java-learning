package day_12_8_22_function;

public class d_to_b {

    public static void d_to_b(int dec) {

        int bin = 0;
        int pwo = 0;

        while (dec > 0) {

            int rem = dec % 2;
            bin = bin + rem * (int) Math.pow(10, pwo);
            pwo++;
            dec = dec / 2;
        }
        System.out.println(bin);

    }

    public static void main(String[] args) {
        d_to_b(5);
    }

}
