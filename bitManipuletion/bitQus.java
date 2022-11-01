package bitManipuletion;

public class bitQus {

    // # Qus 1
    // check a number is Even or Odd

    // for checking even or odd do " AND & " with 1
    // 1 is a bitmask, we can write 1 lick 0001 or 00000001, 0....00001
    // it mins after doing and with 1 we will get LSB '1' or '0'
    // if we will get LSB 1 -> we have a odd number
    // if we will get LSB 0 -> we have a even number
    public static void evenOdd(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 1) {
            System.out.println(n + " is a odd number ");
        } else {
            System.out.println(n + " is a even number ");
        }
    }

    public static void main(String[] args) {
        // Qus 1
        evenOdd(5);
    }
}
