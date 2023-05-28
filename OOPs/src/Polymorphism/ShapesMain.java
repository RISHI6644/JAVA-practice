package Polymorphism;

public class ShapesMain {
    public static void main(String[] args) {
        Shapes shape = new Shapes();

        // Type of method in overriding that is called depends on what the type of the object is
        // Here, which method will be called depends on the type of object. This is known as "Upcasting" and that
        // is how overriding works
        Shapes circle = new Circle(); // What the object able to access is defined by the type of reference and
                                      // specifically which one it can access is defined by the type of object.
        Shapes triangle = new Triangle();
        Shapes square = new Square();

        shape.area();
        circle.area();
        triangle.area();
        square.area();

        Shapes square1 = new Square();
        square1.area();

        Shapes s1 = new Shapes();
        Shapes.greeting(); // To access static stuff we should use the class name as convention even though it can be
                           // accessed by reference type.

        Shapes s2 = new Shapes();
        s2.greeting(); // The method cannot be overridden
    }
}
