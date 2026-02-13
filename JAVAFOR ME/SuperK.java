class Example {
    int x;
    int y;

    void f1(int x, int y) {
        this.x = x;
        this.y = y;

    }

    void display() {
        System.out.println(x);
        System.out.println(y);
    }
}

class Test extends Example {
    int x, y;

    void f2(int x, int y) {
        super.x = x;
        super.y = y;// access the parent y usong super

    }

    void f3() {
        System.out.println(super.x);
        System.out.println(this.y);
    }
}

public class SuperK {
    public static void main(String[] args) {
        Example e = new Example();
        Test t = new Test();

        t.f2(5, 90);
        t.f3();
        e.display();

    }
}
