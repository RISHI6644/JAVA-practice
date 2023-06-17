package EncapsulationAbstraction.Interfaces.ExtendingInterfaces;

public interface A {
    void fun();

    // Static methods can only be accessed from the interface
    // Static interface method should always have a body
    static void greeting () {
        System.out.println("It is a static interface method");
    }
    // Call via the interface name
    // A.greeting();
}
