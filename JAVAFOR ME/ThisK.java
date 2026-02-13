class Example {
    private int x;
    private int y;

    void f1(int x, int y) {
        this.x = x;
        this.y = y;

    }

    void display() {
        // int x = 8;
        // int y = 80;
        System.out.println(x);
        System.out.println(y);
    }
}

class ThisK {
    public static void main(String[] args) {
        Example test = new Example();
        test.f1(3, 07);
        test.display();
    }

}