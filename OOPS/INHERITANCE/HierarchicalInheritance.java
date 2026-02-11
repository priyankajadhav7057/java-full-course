package OOPS.INHERITANCE;
/*Hierarchical Inheritance
In hierarchical inheritance, 
more than one subclass is inherited from a 
single base class. i.e. more than one derived class 
is created from a single base class. For example, 
Apple and Mango both are Fruits */

class Fruits {
    Fruits() {
        System.out.println("All are Fruits Category");
    }
}

class Apple extends Fruits {
    Apple() {
        System.out.println("Apple is kind of Fruits");
    }
}

class Mango extends Fruits {
    Mango() {
        System.out.println("Mango is kind of Fruits");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Mango M = new Mango();
        Apple A = new Apple();
    }

}
