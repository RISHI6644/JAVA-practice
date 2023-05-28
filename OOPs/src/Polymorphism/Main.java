package Polymorphism;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's learn about Polymorphism!!!");

        /* Polymorphism: The word polymorphism is a greek word and here, poly means 'many' and morphism means 'ways to
                represent'. So, in simple terms, polymorphism means many ways to represent a single item or entity.

                Any language that does not support polymorphism is known as Object basis language and if it does than
                it is called as Object-Oriented language.
         */

        /* Types of polymorphism:
                1. Compile-time polymorphism or, static polymorphism: This is achieved via method overloading.

                         Method overloading: When a class has multiple methods with same name, but the number of
                         parameters, ordering, return types etc. can be different. ex: Multiple constructors.

                         A a = new A();
                         A a2 = new A(2,4);

                         Why is it known as static or, compile-time polymorphism?
                         => Because java determines the method to be called during compile-time

                 2.  Run-time polymorphism or, Dynamic polymorphism: This is achieved via method overriding

                          Method Overriding: When a child class has a same named method of a parent class, but the
                          method body is different.

                      How Java determines which method to run ?
                      => The method to run is determined by Java using "Dynamic method dispatch" technique and that is
                      why it is known as dynamic polymorphism.

                      Dynamic method dispatch: It is a mechanism by which a call to an overridden method is resolved at
                      runtime rather than compile-time. It is also known as "Late Binding".

                      We cannot override a method that is declared as 'final'
         */
    }
}