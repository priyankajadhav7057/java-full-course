class Person {
    void display() {
        System.out.println("Parent class");
    }
}

class Student extends Person {
    void display() { // overriding
        System.out.println("Child class");
    }
}

public class OverRiding {
    public static void main(String[] args) {

        Person p = new Student();
        p.display(); // Child class method will run

    }
}