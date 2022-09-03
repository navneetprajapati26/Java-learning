package day_12_8_22_function;

import java.util.Scanner;

public class syntax_parameters {

    public static int add(int a, int b) {// a , b are formal parameters come in function difination
        int c = a + b;
        return c;
    }

    public static int mult(int a, int b) {
        int c = a * b;
        return c;
    }

    public static void swap(int a, int b) {
        int tamp = a;
        a = b;
        b = tamp;
        System.out.println("now swped value of 'a' and 'b' ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b :");
        int b = sc.nextInt();

        int c = add(a, b);// there is 'a' and 'b' are argumants com in function call

        System.out.println("a+b = " + c);
        System.out.println("a*b = " + mult(a, b));
        swap(a, b);

    }

}
