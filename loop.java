// Loops are control statements in Java that allow a block of code to be executed repeatedly as long as a specified condition is true. They help in reducing code repetition.

// There are 4 types of loops in Java.

// for: Used when the number of iterations is known.
// while: Used when the number of iterations is not known in advance, condition checked before each iteration.
// do-while: Similar to while loop, but condition is checked after executing the block (executes at least once).
// for-each: Used to iterate over arrays and collections.

public class loop {
    public static void main(String[] args) {
        // For loop
        System.out.println("First I Print 1 to 50  numbaers using for loop");
        for (int i = 0; i <= 50; i++) {
            System.out.println(i);
        }

        // While loop
        System.out.println("Now I Print 1 to 50  numbaers using while loop");
        int j = 0;
        while (j <= 50) {
            System.out.println(j);
            j++;
        }

        // Do-Whlie loop
        System.out.println("Now I Print 1 to 50  numbaers using do-while loop");
        int k = 0;
        do {
            System.out.println(k);
            k++;
            ;
        } while (k <= 50);

    }

}
