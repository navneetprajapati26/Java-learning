package day_6_8_22;

public class logical_op {
    public static void main(String[] args) {

        System.out.println("AND..&&..");
        System.out.println((2 > 3) && (3 < 5));
        System.out.println((2 < 3) && (3 < 5));

        System.out.println("OR..||..");
        System.out.println((2 > 3) || (3 < 5));
        System.out.println((2 > 3) || (3 > 5));
        System.out.println((2 < 3) || (3 < 5));

        System.out.println(!((2 < 3) || (3 < 5)));

    }

}
