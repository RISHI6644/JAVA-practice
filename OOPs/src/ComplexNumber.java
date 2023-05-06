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

        ComplexNumber result = new ComplexNumber(real_sum, img_sum);
        return result;
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

        ComplexNumber z = x.add(y);
        System.out.println(z);
    }
}