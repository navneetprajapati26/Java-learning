package oops;

public class OOPS {
    public static void main(String[] args) {
        Pan p1 = new Pan();
        p1.setColer("Blue");
        // System.out.println(p1.coler);
        p1.setTip(5);
        // System.out.println(p1.tip);

        // 1 Accese modifir
        BankAccount myAcc = new BankAccount();
        myAcc.userName = "ujala yadav";
        myAcc.setPassword("navneet");

        // 2 getter & setter
        Notes myNote = new Notes();
        myNote.setNote("ujju");
        String n1 = myNote.getNote();
        // System.out.println(n1);

        // 3 Constructors

        // non-parametrized

        // Teacher t1 = new Teacher();

        // paramtrized

        // Teacher t2 = new Teacher("raju");
        // Teacher t3 = new Teacher(3);

        // copy constructor

        // Teacher t4 = new Teacher();
        // t4.name = "aamod";
        // t4.id = 3;
        // t4.password = 123;

        // Teacher t5 = new Teacher(t4);
        // t5.password = 98;

        // 4 Inheritance

        Fish shark = new Fish();
        // come from base class
        shark.eat();
        shark.breathe();
        // come from subclass
        shark.swim();

        //multi laval Inheritance
        Dog dogy =new Dog();
        dogy.breed = "hbhjh";
        dogy.color ="safed"



    }
}

// 5 Polymorphism

// 4 Inheritance

// (Inheritance have tow things first base class and second is derived class,
// derived class use base class proparties )

// Inheritance (base class)

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Inharitance (derived class / sub class)

// this is exampel of single level Inheritance
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}

// multi leval inharitance
class Mamals extends Animal {
    int lages;
}

class Dog extends Mamals {
    String breed;
}

// Hybrid Inheritance

// 3 Constructors
class Teacher {
    String name;
    int id;
    int password;
    int marks[];

    // Constructors if you not initlis is it is by difolt

    // Non-Parameterized Constructor
    Teacher() {
        System.out.println(name);
    }

    // Parameterized Constructor
    Teacher(String name) {
        this.name = name;
        System.out.println(name);
    }

    Teacher(int id) {
        this.id = id;
        System.out.println(id);
    }

    // Copy Constroctor
    Teacher(Teacher a) {
        this.name = a.name;
        this.id = a.id;

    }

}

// 2 getter & setter & this -> for rifrens
class Notes {
    private String note;

    String getNote() {
        return this.note;
    }

    void setNote(String newNote) {
        this.note = newNote;
    }
}

// 1 Accese modifir
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