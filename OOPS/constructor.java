package OOPS;

/*
Java Constructors
Last Updated : 20 Jan, 2026
A constructor in Java is a special member that is called when an object is created.
 It initializes the new object’s state.
  It is used to set default or user-defined values for the object's attributes

A constructor has the same name as the class.
It does not have a return type, not even void.
It can accept parameters to initialize object properties.
Types of Constructors in Java
There are four types of constructors in Java

1. Default Constructor
2. Parameterized Constructor
3. Copy Constructor in Java
4. Private Constructor
 */

/*
class Fruits {

    // Default Constructor
    Fruits() {
        System.out.println("Default constructor");
    }
} */

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

public class constructor {
    public static void main(String[] args) {
        // Fruits Apple = new Fruits();
        Fruits F = new Fruits("Mango", "Keshar", 100);
        F.printInfo();

    }

}
