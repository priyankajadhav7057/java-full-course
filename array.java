// Arrays in Java
// An array is a collection of elements of the same data type stored in contiguous memory locations. It allows multiple values to be stored under a single name and accessed using an index.

// Java arrays can hold both primitive types (like int, char, boolean, etc.) and objects (like String, Integer, etc.)
// When we use arrays of primitive types, the elements are stored in contiguous locations. For non primitive types, references to items are stored at contiguous locations.
// The first element of the array is at index 0.
// After creating an array, its size is fixed; we can not change it.

public class array {
    public static void main(String[] args) {
        System.out.println("we print primitive type array");
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(arr);
        /*
         * this is multilion comments
         * when i am print like System.out.println(arr ); his output somthing like
         * we print primitive type array
         * [I@372f7a8d the reson is What does [I@372f7a8d mean?
         * 
         * When you do this:
         * 
         * System.out.println(arr);
         * 
         * you are not printing the array elements.
         * You are printing the array object reference.
         * 
         * Java internally calls:
         * 
         * arr.toString()
         * 
         * For arrays, toString() is inherited from Object, and its format is:
         * 
         * [className@hexHashCode]
         * 
         * So in your output:
         * 
         * [I@372f7a8d
         * 
         * it means:
         * 
         * [ → this is an array
         * 
         * I → array of int (I is JVM code for int)
         * 
         * @ → separator
         * 
         * 372f7a8d → hashcode (memory-related identity, in hexadecimal)
         * ➡️ In simple words:
         * Java is telling you “this is an int array stored at some memory location”,
         * not its values.
         */
        // declaration and memory allocation
        int[] marks = new int[5];
        // initialization
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 50;
        marks[3] = 60;
        marks[4] = 80;
        // marks[5] = 7;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Primitive array
        int[] array = { 10, 20, 30, 40 };
        int n = array.length;

        System.out.print("Primitive Array -> ");
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");

        System.out.println();

        // Non-primitive array
        String[] alph = { "A", "B", "C", "D" };
        System.out.println("Non-Primitive Array ->");
        for (int i = 0; i < alph.length; i++) {
            System.out.println(alph[i] + " ");

        }

    }
}
