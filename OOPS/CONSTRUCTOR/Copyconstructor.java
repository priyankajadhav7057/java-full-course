package OOPS.CONSTRUCTOR;
/*
3. Copy Constructor in Java
Unlike other constructors copy constructor 
is passed with another object which copies the data available from the 
passed object to the newly created object. */

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

    // 3. Copy Constructor
    Fruits(Fruits F) {
        this.name = F.name;
        this.varity = F.varity;
        this.price = F.price;
    }

    Fruits() {

    }
}

public class Copyconstructor {
    public static void main(String[] args) {
        // Fruits Apple = new Fruits();
        Fruits F = new Fruits("Mango", "Keshar", 100);
        F.printInfo();
        Fruits F2 = new Fruits(F);
        F2.printInfo();

    }
}
/*
 * // run
 * // run PS C:\Java_Full_Course>javac OOPS\CONSTRUCTOR\Copyconstructor.java
 * >>
 * PS C:\Java_Full_Course> java OOPS.CONSTRUCTOR.Copyconstructor
 */