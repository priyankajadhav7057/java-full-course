package OOPS.CONSTRUCTOR;

class Fruits {
    Fruits() {
        System.out.println("Defoult constructor");
    }

}

public class DefoultConstructor {
    public static void main(String[] args) {
        Fruits F = new Fruits();

    }

}

/*
 * 1. Default Constructor
 * A default constructor has no parameters.
 * It’s used to assign default values to an object. If no constructor
 * is explicitly defined, Java provides a default constructor.
 * // Note: It is not necessary to write a constructor for a
 * class because the Java compiler automatically creates a default
 * constructor
 * (a constructor with no arguments) if your class doesn’t have any.
 */
