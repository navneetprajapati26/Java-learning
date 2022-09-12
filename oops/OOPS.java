package oops;

public class OOPS {
    public static void main(String[] args) {
        Pan p1 = new Pan();
        p1.setColer("Blue");
        System.out.println(p1.coler);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

class Pan {
    String coler;
    int tip;

    void setColer(String newColor) {
        coler = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}