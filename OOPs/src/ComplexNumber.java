public class ComplexNumber {
    int real_part;
    int img_part;

    ComplexNumber (int real_part, int img_part) {
        // this keyword: In Java, this keyword is used to refer to the current object inside a class method
        this.real_part = real_part;
        this.img_part = img_part;
    }

    void printNumber() {
        System.out.println(this.real_part + " + " + this.img_part + "i");
    }

    ComplexNumber add(ComplexNumber c) {
        int real_sum = this.real_part + c.real_part;
        int img_sum = this.img_part + c.img_part;

        ComplexNumber addition = new ComplexNumber(real_sum, img_sum);
        return addition;
    }

    ComplexNumber subtract(ComplexNumber c) {
        int real_sub = this.real_part - c.real_part;
        int img_sub = this.img_part - c.img_part;

        ComplexNumber subtraction = new ComplexNumber(real_sub, img_sub);
        return subtraction;
    }

    ComplexNumber multiply(ComplexNumber c) {
        int real_mul = (this.real_part * c.real_part) - (this.img_part * c.img_part);
        int img_mul = (this.real_part * c.img_part) + (this.img_part * c.real_part);

        ComplexNumber multiplication = new ComplexNumber(real_mul, img_mul);
        return multiplication;
    }

    ComplexNumber divide(ComplexNumber c) {
        float divisor = (c.real_part * c.real_part) + (c.img_part * c.img_part);
        float real_div = (this.real_part * c.real_part + this.img_part * c.img_part) / divisor;
        float img_div = (this.img_part * c.real_part - this.real_part * c.img_part) / divisor;

        ComplexNumber division = new ComplexNumber((int) real_div,(int) img_div);
        return division;
    }

    /* toString method: It is a special method that is called automatically whenever we try to concatenate an object
        with a string */

    public String toString() {
        return this.real_part + " + " + this.img_part + "i";
    }
}

class ComplexMain {
    public static void main (String[]args) {
        ComplexNumber x = new ComplexNumber(3, 5);
        ComplexNumber y = new ComplexNumber(-2, 4);

        x.printNumber();
        y.printNumber();

        ComplexNumber p = x.add(y);
        System.out.println(p);

        ComplexNumber q = x.subtract(y);
        System.out.println(q);

        ComplexNumber r = x.multiply(y);
        System.out.println(r);

        ComplexNumber s = x.divide(y);
        System.out.println(s);
    }
}
