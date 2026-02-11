package OOPS.Polymorphism;

class Student {
    String name;
    int age;
    int id;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age, int id) {
        System.out.println(age + "" + id);
    }
    // public void printInfo(int id){
    // System.out.println(id);
    // }
    // ✔ Method name must be same int
    // ✔ Parameter list must be DIFFERENT age,id

    public void printInfo(String name, int age, int id) {
        System.out.println(name + " " + age + " " + id);

    }

}

public class MethodOverloading {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "priyanka";
        s.age = 23;
        s.id = 123456;
        s.printInfo(s.name, s.age, s.id);

    }

}
