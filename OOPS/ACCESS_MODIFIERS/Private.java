package OOPS.ACCESS_MODIFIERS;

/*Private Access Modifier
The private access modifier is specified using the keyword private.
 The methods or data members 
declared as private are accessible only within the class in which they are declared.
 */
class Details {
    private String name;

    public void setName(String name) {
        this.name = name;/// accessible within class
    }

    public String getName() {
        return name;
    }

}

public class Private {
    public static void main(String[] args) {
        Details Person = new Details();
        Person.setName("Priyanka Gaikwad");
        System.out.println(Person.getName());
    }
}
/*
 * RUN :PS C:\Java_Full_Course> javac OOPS\ACCESS_MODIFIERS\Private.java
 * PS C:\Java_Full_Course> java OOPS.ACCESS_MODIFIERS.Private
 * Priyanka Gaikwad
 * PS C:\Java_Full_Course>
 */
