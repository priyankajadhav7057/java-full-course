package OOPS.ACCESS_MODIFIERS;
/*Public Access Modifier
The public access modifier is specified using
 the keyword public. Public members are accessible from everywhere
  in the program. There is no 
restriction on the scope of public data members.
 */

class Calculator {
    public static int add(int a, int b) {
        return a + b;

    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }
}

class Account {
    public String name;
}

public class Public {
    public static void main(String[] args) {
        Account account = new Account();
        account.name = "Priyanka Gaikwad";
        System.out.println(account.name);
        Calculator Math = new Calculator();
        System.out.println(Math.add(10, 56));
        System.out.println(Math.div(3, 1));
        System.out.println(Math.mul(23, 23));
        System.out.println(Math.sub(5, 6));
    }

}
/*
 * RUN: -1
 * PS C:\Java_Full_Course> javac OOPS\ACCESS_MODIFIERS\Public.java
 * PS C:\Java_Full_Course> java OOPS.ACCESS_MODIFIERS.Public
 * Priyanka Gaikwad
 * 66
 * 3
 * 529
 * -1
 * PS C:\Java_Full_Course>
 */