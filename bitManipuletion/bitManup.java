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
    }
}
