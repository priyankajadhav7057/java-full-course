abstract class Animal {
    abstract void sound();

}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat says Meow!");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog says Woof!");
    }

}

public class Abstraction {
    public static void main(String[] args) {
        Cat Soffy = new Cat();
        Soffy.sound();
        Dog Ruby = new Dog();
        Ruby.sound();

    }
}
