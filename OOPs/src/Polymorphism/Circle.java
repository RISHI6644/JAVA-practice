package Polymorphism;

public class Circle extends Shapes{
    @Override // This is called annotation
    // This will run when an object of Circle is created
    // Hence, it is overriding the parent class's method
    void area() {
        System.out.println("Area of a circle is PI * r * r");
    }

    /* Can a static method be overridden ?
    => NO
       The static method in the parent class will always run no matter from which object we are calling it.
       Static methods can be inherited but cannot be overridden. Because the parent class does not dependent
       on objects.
       In simple words, overriding depends on objects, static stuff does not depend on objects. Hence, static methods
       cannot be overridden.
     */

    //@Override
    static void greeting() {
        System.out.println("Greetings!!! I am in Circle class");
    }
}
