package Chagg.first_qus;

import java.util.*;

public class CompileTest {
    public static void main(String[] args) {
        MyGeneric<String, Integer> g1 = new MyGeneric(23, "MyString is my string ", 45);
        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str + int1);
    }
}
