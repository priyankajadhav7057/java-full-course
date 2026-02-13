class Sum extends Thread {

    public void run() { // override run()
        int a = 90;
        int b = 67;

        if (a > b) {
            System.out.println("A is greater than B: " + a);
        } else {
            System.out.println("B is greater than A: " + b);
        }
    }
}

class Sub extends Thread {

    public void run() { // override run()
        int a = 98;
        int b = 12;

        if (a - b == 86) {
            System.out.println("Successful subtraction");
        }
    }
}

public class ThreadExtends {
    public static void main(String[] args) {

        Sub s = new Sub();
        Sum S = new Sum();

        s.start(); // starts thread
        S.start(); // starts thread
    }
}