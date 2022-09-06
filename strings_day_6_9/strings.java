package strings_day_6_9;

import java.util.Scanner;

public class strings {

    public static void printString(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void palindrome(String str) {

        boolean palindrome = false;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                palindrome = true;

            }
        }

        if (palindrome == true) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }

    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd', 'e' };

        // ############# String declration
        // String str = "abcde";
        // OR
        // String str2 = new String("abcde");

        // **imp
        // Strings are I M M U T A B L E

        // ### input / output in String ###
        Scanner sc = new Scanner(System.in);
        // String name;

        // "next()" take only one word "nextLine()" take all line

        // name = sc.nextLine();

        // " .length()" give use number of charechtor in the string
        // System.out.println(name + " length of intered word is " + name.length());

        // Concatenation
        String firstName = "NAVNEET";
        String lastNAme = "UJALA";

        // String nameOflove = firstName + " " + lastNAme;
        // System.out.println(nameOflove);

        // charector of Strinig
        // System.out.println(lastNAme.charAt(0) + " love " + firstName.charAt(0));
        // printString(lastNAme);
        String str = sc.nextLine();
        palindrome(str);

    }

}
