package Polymorphism;

public class ShapesMain {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes triangle = new Triangle();
        Shapes square = new Square();

        shape.area();
        circle.area();
        triangle.area();
        square.area();

        Shapes square1 = new Square();
        square1.area();
    }
}
