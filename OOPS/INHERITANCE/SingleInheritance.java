package OOPS.INHERITANCE;

/*
1. Single Inheritance
In single inheritance, a sub-class is derived from only one super class.
 It inherits the properties and behavior of a single-parent class.
 Sometimes, it is also known as simple inheritance */
//Super class
class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

// Subclass
class Car extends Vehicle {
    Car() {
        System.out.println("This Vehicle is Car");
    }
}

class Shape {
    public void Area() {
        System.out.println("Disply Area");
    }
}

class Triangle extends Shape {
    public void Area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        // Creating object of subclass invokes base class constructor
        Car obj = new Car();
        Triangle T = new Triangle();
        T.Area(10, 20);

    }
}

// run
/*
 * PS C:\Java_Full_Course> javac OOPS\INHERITANCE\SingleInheritance.java
 * PS C:\Java_Full_Course> java OOPS.INHERITANCE.SingleInheritance
 * This is a Vehicle
 * This Vehicle is Car
 * PS C:\Java_Full_Course>
 */