public class fun {
    void fun1() {
        System.out.println("A");
    }

    void fun2() {
        System.out.println("S");
    }

    public static void main(String[] args) {
        System.out.println("c");
        fun n = new fun();
        n.fun1();
        n.fun2();
    }
}