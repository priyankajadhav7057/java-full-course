// Decision Making (Control Statements) in Java:
// Decision-making (or control statements) are used to execute different blocks of code based on certain conditions. They allow a Java program to choose a path of execution depending on whether a condition is true or false.

// Examples:

// if: Executes a block if a condition is true.
// if-else: Chooses between two blocks based on a condition.
// if-else if-else: Tests multiple conditions sequentially.
// switch: Selects one block from multiple options based on a variable’s value.
import java.util.Scanner;

public class controlStatements {
    public static void main(String[] args) {
        // for this contion we take input from user for that perpose we use scanner
        // class
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // if statements
        if (a <= 10) {
            System.out.println("All numbers which are less than or equal to 10 are: " + a);
        }
        // if-else statements
        if (a <= 10) {
            System.out.println("a is less than 10: " + a);
        } else {
            System.out.println("a is gretaor than 10:" + a);
        }

        // if-else if-else statements

        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote: " + age);

        } else if (age < 18 && age > 0) {
            System.out.println(" You are under 18 so you are not eligibale for vote:" + age);
        } else {
            System.out.println("Invalid age: " + age);
        }

        // switch statements
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day: " + day);
                break;
        }

    }
}
