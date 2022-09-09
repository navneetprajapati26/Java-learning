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

    public static void sortestDis(String str) {
        float x = 0;
        float y = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'w') {
                x += -1;
            } else if (str.charAt(i) == 'e') {
                x += +1;
            } else if (str.charAt(i) == 's') {
                y += -1;
            } else if (str.charAt(i) == 'n') {
                y += 1;
            } else {
                count++;
            }
        }
        float a = x * x + y * y; // Math.pow(x, 2) + Math.pow(y, 2);

        float sD = (float) Math.sqrt(a);
        System.out.println("Shortest length " + sD + " and nmumber of non directional instruction " + count);
    }

    public static void subString(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }

        printString(substr);
    }

    // largest
    public static void lxicalLarg() {
        String fruits[] = { "apple", "mango", "banana" };
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }

    public static void impQus_toUpperCase(String str) {
        StringBuilder sd = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sd.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ') {
                sd.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sd.append(str.charAt(i));
            }
        }

        System.out.println(sd);

    }

    public static void impQus_compretionStr(String str) {
        String newStr = " ";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        System.out.println(newStr);
    }

    public static void main(String[] args) {
        // char arr[] = { 'a', 'b', 'c', 'd', 'e' };

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
        // // palindrome(str);
        // sortestDis(str);
        // subString(str, 2, 3);
        // System.out.println(str.substring(2, 3));
        // lxicalLarg();
        // impQus_toUpperCase(str);
        impQus_compretionStr(str);

    }

}
