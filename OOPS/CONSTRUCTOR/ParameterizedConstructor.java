package OOPS.CONSTRUCTOR;

// 2. Parameterized Constructor
class Fruits {
    // data members of the class
    String name;
    String varity;
    int price;

    // 2. Parameterized Constructor
    Fruits(String name, String varity, int price) {
        this.name = name;
        this.varity = varity;
        this.price = price;
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.varity);
        System.out.println(this.price);
    }

}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        // Fruits Apple = new Fruits();
        Fruits F = new Fruits("Mango", "Keshar", 100);
        F.printInfo();

    }

}

// run javac OOPS\CONSTRUCTOR\ParameterizedConstructor.java
// java OOPS.CONSTRUCTOR.ParameterizedConstructor

/*
 * 2. Parameterized Constructor
 * A constructor that has parameters is known as parameterized
 * constructor. If we want to initialize fields of the class with our own
 * values,
 * then use a parameterized constructor.
 */