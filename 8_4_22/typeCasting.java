import java.util.Scanner;

//package 8_4_22;

public class typeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // float a = sc.nextFloat();
        float a = 201.233f;
        int b = (int) a;
        System.out.println(b);

        char ch = 'a';
        int num = (int) ch;
        System.out.println(num);

    }

}
