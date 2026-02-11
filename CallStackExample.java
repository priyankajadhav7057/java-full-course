
/*Method Call Stack in Java
Java is an object-oriented and 
stack-based programming language where methods play 
a key role in controlling the program's execution flow. 
When a method is called, Java uses an internal structure known 
as the call stack to manage execution, variables, and return addresses.

What is the Call Stack
The call stack is a data structure used by the program during 
runtime to manage method calls and local variables.
 It operates in a Last-In-First-Out (LIFO) manner, meaning the 
 last method called is the first one to complete and exit.*/
public class CallStackExample {

    public static void D() {
        float d = 40.5f;
        System.out.println("In Method D");
    }

    public static void C() {
        double c = 30.5;
        System.out.println("In Method C");
    }

    public static void B() {
        int b = 20;
        C(); // Calling C
        System.out.println("In Method B");
    }

    public static void A() {
        int a = 10;
        B(); // Calling B
        System.out.println("In Method A");
    }

    public static void main(String[] args) {
        A(); // Start with function A
        D();
        // B();
        // C();
        //
    }
}
