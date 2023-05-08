public class Variables {
    public static void main(String[]args) {
        System.out.println("Let's learn about variables in Java");

/* Variables: A variable is a container which stores a value in a Java program. Each variable has a type associated
              with it that is defined at the time of its declaration.
 */
       int num = 10; // Here, num is a variable of integer type storing value 10
        System.out.println(num);

        // Naming Convention
        int Id = 18301074;
        // int 1id = 1223; // Invalid
        int id_2 = 16251;

        int marks; // Declaration
        marks = 69; // Usage

        // Data types & their Ranges
        /* Data Types: Data types mean to identify the type of the data and associate operations that can be done on
                        the data values. Data types define the value that a variable can take.
                       Data types also tell us information about:
                       => The size of the memory location
                       => The maximum and minimum value of range that can store in the memory location
                       => Different types of operations can be done on the memory location (+, -, *, /)

                       There are two types of data types in Java:
                       1. Primitive Data types (Provided by Java) : Categorized in two types => (i) Numeric: categorized
                              in two types => (i) integer(i.e. int, byte, short, long) & (ii) floating point (i.e. double,
                              float) and (ii) Non-numeric (i.e. char, boolean)
                       2. Non-primitive Data types (created by programmers):
         */
        int i = 100; // Range of int => [-2,147,483,648:2,147,483,647] & Size is 32 bits or, 4 bytes
        System.out.println(i);

        byte b = 10; // Range of byte => [-128:127] & Size is 8 bits or, 1 byte
        System.out.println(b);

        short s = 5; // Range of short => [-32,768:32,767] & Size is 16 bits or, 2 bytes
        System.out.println(s);

        long l = 1_223_454_746L; // Range of long => [-9,223,372,036,854,775,808:9,223,372,036,854,775,807] & Size is 64 bits or, 8 bytes
        System.out.println(l); // Consider the underscores as commas

        float f = 3.32F; // Range of float => [1.40239846 * 10^-45:3.40282347 * 10^38] & Size is 32 bits or, 4 bytes
        System.out.println(f);

        double d = 3.141592653589793238; // Range of double => [4.9406564584124654 * 10^-324:1.7976931348623157 * 10^308] & Size is 64 bits or, 8 bytes
        System.out.println(d);

        char c = 'R';
        System.out.println(c);

        boolean bool = true;
        System.out.println(bool);

        // Declaring a constant in Java
        final double PI = 3.141592653589793238;
        System.out.println(PI);
    }
}
