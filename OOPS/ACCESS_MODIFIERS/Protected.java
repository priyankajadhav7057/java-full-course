package OOPS.ACCESS_MODIFIERS;

/*Protected Access Modifier
The protected access modifier is specified using the keyword
 protected. The methods or data members declared as protected are 
accessible within the same package or subclasses in different packages. */
class Account {
    protected String email;
}

public class Protected {
    public static void main(String[] args) {
        Account A = new Account();
        A.email = "Priyanka@java.com";
        System.out.println(A.email);
    }
}
/*
 * Run:
 * PS C:\Java_Full_Course> javac OOPS\ACCESS_MODIFIERS\Protected.java
 * PS C:\Java_Full_Course> java OOPS.ACCESS_MODIFIERS.Protected
 * Priyanka@java.com
 * PS C:\Java_Full_Course>
 */