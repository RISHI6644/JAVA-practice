public class TypeCasting {
    public static void main(String[]args) {
        System.out.println("Let's learn about Typecasting in Java");

        /* Typecasting refers to changing the type of data from one type to another
            There are two types of typecasting in Java:
            1. Widening Typecasting => automatically done by Java. It converts smaller data types to larger data type.
                sequence: byte -> short-> int -> long -> float -> double
            2. Explicit Typecasting => user defined. User needs to convert larger data types to smaller data type.
                sequence: double -> float -> long -> int -> short -> byte
         */

        // Widening Typecasting
        int i = 100;
        long l = i;
        System.out.println(l);

        // Explicit Typecasting
        long l2 = 1000000;
        int i2 = (int) l2;
        System.out.println(l2);

        int i3 = 2000;
        byte b = (byte) i3; // Lossy conversion
        System.out.println(b);
    }
}
