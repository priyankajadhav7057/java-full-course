package OOPS;

/*
Java Class
A class is a blueprint that defines data and behavior for objects. 
It groups related fields and methods in a single unit
. Memory for its members is allocated only when an object is created. 
Java Objects
An object is an instance of a class created to access its data and operations. Each object holds its own state.

State: Values stored in fields.
Behavior: Actions defined through methods.
Identity: Distinguishes one object from another.
Objects mirror real-world items such as customer, 
product or circle. Non-primitive objects are stored on
 the heap while their references remain on the stack.
*/
class pen {
    // Instance Variables
    String color;
    String type;
    int price;
    String name;

    public void write() { // write() Method
        System.out.println("writting somthing");// This method prints:writting somthing
        // It does not return anything → that’s why void

    }

    public void printColor() {// printColor() Method
        System.out.println(this.color + " this pen type is :" + this.type);
        // This method prints:

        /*
         * color of current object
         * 
         * type of current object
         * 
         * What is this?
         * 
         * this means:
         * 👉 current object
         * 
         * Example:
         * If pen1 calls this method → this means pen1
         * If pen2 calls this method → this means pen2
         */
    }

}

public class ClassItem {
    // main() Method
    public static void main(String[] args) {
        // pen p = new pen();
        // p.write();
        // p.color = "Red";
        // p.type = "gel";
        // System.out.println(p.type);

        // p.name = "TryMax";
        // p.price = 60;
        pen pen1 = new pen();// Creating First Object

        // Assigning Values to pen1
        pen1.color = "Blue";
        pen1.type = "Boll";
        pen1.name = "TryMax";

        pen pen2 = new pen();// Creating Second Object
        // Assigning Values to pen2
        pen2.color = "Black";
        pen2.color = "Green";
        // Calling Methods
        pen1.printColor();
        pen2.printColor();

    }

}
