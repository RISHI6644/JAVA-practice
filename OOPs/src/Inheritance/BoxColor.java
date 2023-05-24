package Inheritance;

public class BoxColor extends BoxWeight{
    double clr;

    public BoxColor(double clr) {
        super();
        this.clr = clr;
    }

    public BoxColor(BoxColor other) {
        super(other);
        this.clr = other.clr;
    }

    public BoxColor(double l, double h, double w, double weight, double clr) {
        super(l, h, w, weight);
        this.clr = clr;
    }

    public BoxColor(double side, double weight, double clr) {
        super(side, weight);
        this.clr = clr;
    }
}
