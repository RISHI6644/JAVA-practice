package Inheritance;

public class Box {
    double length;
    double height;
    double width;
    // double weight;

    Box() {
        super(); // Pointing to the Object class

        this.length = -1;
        this.height = -1;
        this.width = -1;
    }

    // To create a cube
    Box(double side) {
        this.length = side;
        this.height = side;
        this.width = side;
    }

    Box(double l, double h, double w) {
        this.length = l;
        this.height = h;
        this.width = w;
    }

    Box(Box old_box) {
        this.height = old_box.height;
        this.length = old_box.length;
        this.width = old_box.width;
    }
}
