public class Fraction {
    public int numerator, denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    Fraction add(Fraction a){
        int denom = this.denominator * a.denominator;
        int num = ((denom / this.denominator) * this.numerator) + ((denom / a.denominator) * a.numerator);
        Fraction addition = new Fraction(num, denom);
        return addition;
    }

    Fraction subtract(Fraction a){
        int denom = this.denominator * a.denominator;
        int num = ((denom / this.denominator) * this.numerator) - ((denom / a.denominator) * a.numerator);
        Fraction addition = new Fraction(num, denom);
        return addition;
    }

    Fraction multiply(Fraction a){
        int num_mul = this.numerator * a.numerator;
        int den_mul = this.denominator * a.denominator;
        Fraction multiplication = new Fraction(num_mul, den_mul);
        return multiplication;
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}

class FractionMain {
    public static void main(String[]args) {
        Fraction x = new Fraction(2, 3);  // 2/3
        System.out.println(x);
        Fraction y = new Fraction(4, 5); // 4/5
        System.out.println(y);

        Fraction p = x.add(y); // 22/15
        System.out.println(p);

        Fraction q = x.subtract(y); // -2/15
        System.out.println(q);

        Fraction r = x.multiply(y); // 8/15
        System.out.println(r);
    }
}