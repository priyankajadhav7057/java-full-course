class product {
    // multiply by two number
    public int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    // multilying three integer value
    public int multiply(int a, int b, int c) {
        int product = a * b * c;
        return product;
    }

}

public class MethodsOverLoading {
    public static void main(String[] args) {
        product mul = new product();
        int first = mul.multiply(3, 4);
        int second = mul.multiply(1, 5, 8);
        System.out.println(first);
        System.out.println(second);

    }
}