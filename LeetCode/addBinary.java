package LeetCode;

public class addBinary {
    public static void main(String[] args) {

        System.out.println(add("1010", "0101"));
    }

    public static int addBinary(String a, String b) {
        int a_int = str_to_int(a);
        int b_int = str_to_int(b);

        int ab = a_int | b_int;

        return ab;
        // return String.valueOf(ab);
    }

    public static int str_to_int(String a) {
        int num = 0;
        int base = 1;
        for (int i = a.length() - 1; i >= 0; i--) {
            // num += a.charAt(i) * Math.pow(2, i);

            if (a.charAt(i) == '1') {
                num += base;
            }
            base = base * 2;
        }
        return num;
    }

    public static String add(String a, String b) {
        int carry = 0;
        String result = "";
        int i = 0;
        while (i < a.length() || i < b.length() || carry != 0) {
            int x = 0;
            if (i < a.length() && a.charAt(a.length() - 1 - i) == '1') {
                x = 1;
            }

            int y = 0;
            if (i < b.length() && b.charAt(b.length() - 1 - i) == '1') {
                y = 1;
            }

            result = (x + y + carry) % 2 + result;
            carry = (x + y + carry) / 2;
            i++;
        }
        return result;

    }
}
