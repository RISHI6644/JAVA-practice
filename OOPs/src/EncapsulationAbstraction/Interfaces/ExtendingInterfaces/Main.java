package EncapsulationAbstraction.Interfaces.ExtendingInterfaces;

public class Main implements B{

    @Override // Annotation is also internally written as an interface
    public void fun() {

    }

    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }
}
