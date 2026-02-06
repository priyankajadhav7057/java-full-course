
/*Variables in Java:
Variables are containers to store data in memory. Each variable has a name, type and value. It is the basic unit of storage in a program. Java has 4 types of variables.

Local Variables: Declared inside a method, constructor, or block. Accessible only within that block.
Instance Variables: Declared inside a class but outside any method. Each object of the class has its own copy.
Static Variables: Declared with the static keyword inside a class. Shared by all objects of the class.
Final Variables: Declared with final keyword. Value cannot be changed once assigned.



 */
public class Variables {
    // Instance variable (belongs to each object)
    int instanceVar = 10;

    // Static variable (shared across all objects of the class)
    static String staticVar = "I am static";

    public void showVariables() {
        // Local variable (declared inside a method)
        int localVar = 5;

        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        // Creating object
        Variables obj1 = new Variables();
        obj1.showVariables();

        // Accessing static variable directly using class name
        System.out.println("Accessing Static Variable via class: " + Variables.staticVar);
    }

}
