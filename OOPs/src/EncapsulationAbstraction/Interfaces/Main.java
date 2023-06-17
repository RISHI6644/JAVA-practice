package EncapsulationAbstraction.Interfaces;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's learn about interfaces!!!");

        /* Interface: To establish multiple inheritance or to achieve abstraction we can use interface.
            It is a blueprint of a class which only contains static constants and abstract methods without
            the method body. The variables are static and final by default in an interface.
         */

        /* Abstract class vs Interface
            1. Abstract class can provide the implementation of an interface, but the interface cannot provide the
               implementation of abstract class.
            2. Abstract class can have both abstract and non-abstract methods whereas Interface can have only abstract
               methods. Since Java 8, it can have default and static methods also.
            3. Abstract class does not support multiple inheritance unlike interface.
            4. Abstract class can have final, non-final, static and non-static variables. But Interface can only have
               static and final variables.
            5. The abstract keyword is used to declare abstract class. On the other hand, the interface keyword is
               used to declare interface.
            6. An abstract class can extend another Java class and implement multiple Java interfaces, whereas An
               interface can extend another Java interface only.
            7. An abstract class can be extended using keyword "extends" and an interface can be implemented using
               keyword "implements".
            8. A Java abstract class can have class members like private, protected, etc. But members of a Java
               interface are public by default.
         */

        // Two classes which are unrelated to each other can implement the same interface
    }
}
