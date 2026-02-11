/* Java Methods are blocks of code that perform a specific task. 
A method allows us to reuse code, improving both efficiency and
 organization. All methods in Java must belong to a class. Methods 
are similar to functions and expose the behavior of objects.

Why Use Methods?
Breaking code into separate methods helps 
improve readability, reusability, and maintainability

*/

import java.util.Scanner;

public class methods {
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;

        } else if (x < y) {
            z = x - y;
        } else {
            z = x * y;
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        c = logic(a, b);
        System.out.println(c);

    }

}
