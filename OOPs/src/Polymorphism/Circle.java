package Polymorphism;

public class Circle extends Shapes{
    @Override // This is called annotation
    // This will run when an object of Circle is created
    // Hence, it is overriding the parent class's method
    void area() {
        System.out.println("Area of a circle is PI * r * r");
    }
}
