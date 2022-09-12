package oops;

public class OOPS {
    public static void main(String[] args) {
        Pan p1 = new Pan();
        p1.setColer("Blue");
        System.out.println(p1.coler);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.userName = "ujala yadav";
        myAcc.setPassword("navneet");

    }
}

class BankAccount {

    public String userName;
    private String password;

    public void setPassword(String pwd) {
        this.password = pwd;
    }

}

class Pan {
    // Attributes of class
    String coler;
    int tip;

    // Behaviors of class
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