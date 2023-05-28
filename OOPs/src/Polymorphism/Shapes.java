package Polymorphism;

public class Shapes {
    void area() {
        System.out.println("I am in Shapes class");
    }

    /* final keyword: This keyword can be used to prevent overriding. Since a final method cannot be overridden, a call
     to one can only be resolved at compile-time. This is known as "Early binding".

     We can also use this keyword to prevent a class to be inherited. Whenever we declare a class as final implicitly
     all the methods in it will also be declared as final.
     */

//    final void area() {
//        System.out.println("I am in Shapes class");
//    }

    static void greeting() {
        System.out.println("Greetings!!! I am in Shapes class");
    }
}
