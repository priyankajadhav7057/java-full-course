package OOPS.ACCESS_MODIFIERS;

/*Default Access Modifier
When no access modifier is specified for a class,
 method, or data member, it is said to have the default access modifier by default. 
 This means only classes within the same package can access it.

*/
class Car {
    String model; // default access
}

public class Default {

    public static void main(String[] args) {

        Car c = new Car();
        c.model = "Tesla"; // accessible within the same package
        System.out.println(c.model);
    }
}
