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

    // we can do 3 type of opretions with bits
    // 1) Get 'i'th bit
    // 2) set 'i' bit
    // 3) clear 'i' bit

    // 1) Get 'i'th bit
    public static int get_ith(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // 2) Set 'i'th bit
    public static int set_ith(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // 3) Clear 'i'th bit
    public static int Clear_ith(int n, int i) {
        int bitMask = ~(i << i);
        return n & bitMask;
    }

    // 4) Updeting 'i'th bit useing 'set' and 'clear'
    public static int updating_ith(int n, int i, int mewBit) {
        if (mewBit == 0) {
            return Clear_ith(n, i);
        } else {
            return set_ith(n, i);
        }
    }

    // 5) clearing 'i' bits from last
    public static int clearIBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    // 6) clearing bits from range in 'i' - 'j'
    public static int clearingInRenge(int n, int i, int j) {

        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;

        int bitMask = a | b;
        return n & bitMask;

    }
    // # Qus 2
    // check, is any number in 2's power or not

    // if any number 'n' have 2's power then " n&(n-1) == 0 "
    public static boolean inHavePowerOfTow(int n) {
        return (n & (n - 1)) == 0;
    }

    // # Qus 3
    // Count Set Bits in a Number (Set mins bits have value '1')

    // Any Desimal number 'N' have '(log N base 2)+1' bits in binary number system
    public static int countOfSet(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {// checking our LSB
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        // Qus 1
        evenOdd(5);

        // 1) Get 'i'th bit
        System.out.println(3 + "th is " + get_ith(10, 3));

        // 1) Set 'i'th bit
        System.out.println(" after Set " + 2 + "th " + set_ith(10, 2));

        // 3) Clear 'i'th bit
        System.out.println(" after Clear " + 1 + "th " + Clear_ith(10, 1));

        // 4) Updeting 'i'th bit useing 'set' and 'clear'

        System.out.println(" after update " + 2 + "th to " + 1 + " " + updating_ith(10, 2, 1));

        // 5) clearing 'i' bits from last
        System.out.println(" clearing '2' bits from last " + clearIBits(15, 2));

        // 6) clearing bits from range in 'i' - 'j'
        System.out.println("clearing bits from range in 'i' - 'j' " + clearingInRenge(10, 2, 4));

        // Qus 2
        System.out.println("is 15 have 2's power :- " + inHavePowerOfTow(15));

        // Qus 3
        System.out.println("no. of Set in 10 : " + countOfSet(10));
    }

}
