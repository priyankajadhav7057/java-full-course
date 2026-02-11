package OOPS.INHERITANCE;

/*2. Multilevel Inheritance
In Multilevel Inheritance, a derived class will be inheriting a base class and as well as the derived class also acts as the base class for other classes.

 */

class Animal {
    Animal() {
        System.out.println("Animal make a sound");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog Barks");
    }
}

class Puppy extends Dog {
    Puppy() {
        System.out.println("Puppy barks");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        //

    }

}

/*
 * run
 * PS C:\Java_Full_Course> javac OOPS\INHERITANCE\MultilevelInheritance.java
 * PS C:\Java_Full_Course> java OOPS.INHERITANCE.MultilevelInheritance
 * PS C:\Java_Full_Course> javac OOPS\INHERITANCE\MultilevelInheritance.java
 * PS C:\Java_Full_Course> java OOPS.INHERITANCE.MultilevelInheritance
 * Animal make a sound
 * Dog Barks
 * Puppy barks
 */