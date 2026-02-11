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
        // displya array using for each loop
        System.out.println("Display array using for loop reverse  order");
        for (int i = alph.length - 1; i >= 0; i--) {
            System.out.println(alph[i] + " ");
        }

        // for each loop
        System.out.println("Display array using for each loop");
        for (String all : alph) {
            System.out.println(all + "");
        }

        // 2D array
        int[] sum;// this is 1D array
        int[][] grade;// this is 2D array
        grade = new int[2][3];
        grade[0][0] = 101;
        grade[0][1] = 102;
        grade[0][2] = 103;
        grade[1][0] = 201;
        grade[1][1] = 202;
        grade[1][2] = 203;
        System.out.println("2D array");
        for (int i = 0; i < grade.length; i++) {
            for (int j = 0; j < grade[i].length; j++) {
                System.out.print(grade[i][j]);
                System.out.print(" ");

            }
            System.out.println("");
        }

        // 3Darray
        int[][][] matrix = new int[2][3][4];
        matrix[0][0][0] = 1;
        matrix[0][0][1] = 2;
        matrix[0][0][2] = 3;

        matrix[0][1][0] = 21;
        matrix[0][1][1] = 12;
        matrix[0][1][2] = 11;

        matrix[1][2][0] = 43;
        matrix[1][2][1] = 23;
        matrix[1][2][2] = 13;
        // System.out.println("3D array");
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[i].length; j++)

        // {
        // for (int k = 0; k < matrix[i][j].length; k++) {
        // System.out.print(matrix[i][j][k] + "");
        // System.out.print("");
        // }
        // System.out.print(" ");
        // }
        // System.out.println();

        // }
        System.out.println("3D array");

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Block " + i);
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    System.out.print(matrix[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

}
