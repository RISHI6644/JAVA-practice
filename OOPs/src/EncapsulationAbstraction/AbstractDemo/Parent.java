package EncapsulationAbstraction.AbstractDemo;

public abstract class Parent {
    /* Abstract Class: An abstract class is designed to be specifically used as a base class.
        This class contains at least one abstract method. Abstract class cannot be instantiated rather it can be
        subclassed and these subclasses usually provides implementations for the abstract methods of their parent class.
     */

    /* Abstract Method: An abstract method does not have its implementation or body. It is declared inside an abstract
        class. And the implementation or the method body is defines in its subclasses via method overridden approach.
     */

    abstract void career(String name);
    abstract void partner(String name, int age);

    // abstract Parent(); // We cannot create abstract constructor

    // abstract static void greeting (); // We cannot create abstract static methods

    static void greeting() {
        System.out.println("Greetings!!!");
    }

    void normal() {
        System.out.println("This is a normal method");
    }
}
