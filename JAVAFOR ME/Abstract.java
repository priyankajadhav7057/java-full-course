abstract class demo {
    abstract void fun();

    demo() {
        System.out.println("This is a constructor of abstract class");
    }

    void diplay() {
        System.out.println("This is a normal method to disply abstractor class");
    }
}

class test extends demo {
    void fun() {
        System.out.println("This is an abstract method");
    }

    test() {
        super();
        System.out.println("This is a constructor of child class");
    }
}

public class Abstract {
    public static void main(String[] args) {
        test t = new test();
        t.diplay();
        t.fun();
        // t.best();

    }

}
