package bitManipuletion;

import java.util.*;

public class bitManup {
    public static void main(String[] args) {
        // # importent Bit Wise 'AND (&)' optreter
        // 0 & 0 = 0
        // 0 & 1 = 0
        // 1 & 0 = 0
        // 1 & 1 = 1
        System.out.println("Bit Wise 'AND (&)' optreter " + (5 & 6));
        // 5 % 6,
        // 5= 101
        // 6= 110
        // ----------
        // result 100

        // # importent Bit Wise 'OR (|)' optreter
        // 0 | 0 = 0
        // 0 | 1 = 1
        // 1 | 0 = 1
        // 1 | 1 = 1
        System.out.println("Bit Wise 'OR (|)' optreter " + (5 | 6));
        // 5 | 6,
        // 5= 101
        // 6= 110
        // ----------
        // result 111

        // # importent Bit Wise 'XOR (^)' optreter
        // 0 ^ 0 = 0
        // 0 ^ 1 = 1
        // 1 ^ 0 = 1
        // 1 ^ 1 = 0
        System.out.println("Bit Wise 'XOR (^)' optreter " + (5 ^ 6));
        // 5 ^ 6,
        // 5= 101
        // 6= 110
        // ----------
        // result 011

        // # importent Bit Wise 'Binary One's Complement' optreter
        // ~0 = 1
        // ~1 = 0

        System.out.println("Bit Wise Binary One's Complement optreter " + (~5));
        // 5= 101
        // ~5= 010

        // # Very IMP 'Binary Left Shift <<'
        // # " a<<b = a*2^b ""
        System.out.println("Binary Left Shift << " + (5 << 2));

        // # Very IMP 'Binary Right Shift >>'
        // # " a>>b = a/2^b ""
        System.out.println("Binary Right Shift (>>) " + (6 >> 1));
    }
}
