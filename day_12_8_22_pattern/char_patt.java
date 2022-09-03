package day_12_8_22_pattern;

public class char_patt {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
