import static java.lang.Math.E;
import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's learn about the Math module in Java!");

        // Comparison
        int max = Math.max(10, 7);
        int min = Math.min(10, 7);

        double max1 = Math.max(3.32, 3.50);

        System.out.println(max);
        System.out.println(min);
        System.out.println(max1);

        // Rounding off methods
        double w = Math.floor(3.32);
        double x = Math.ceil(3.32);
        double y = Math.round(3.32);
        double z = Math.round(3.83);

        System.out.println(w); // 3.0
        System.out.println(x); // 4.0
        System.out.println(y); // 3.0
        System.out.println(z); // 4.0
        System.out.println(Math.round(3.5)); // 4

        // Logarithms and Exponents
        double e = E;
        System.out.println(e); // 2.718281828459045
        double a = Math.log(E);
        double b =  Math.log10(100);
        System.out.println(a); // 1.0
        System.out.println(b); // 2.0
        double p = Math.pow(2,3);
        System.out.println(p); // 8.0
        double q = Math.sqrt(49);
        System.out.println(q); // 7.0

        // Trigonometric Methods
        final double pi = Math.PI;
        System.out.println(pi); // 3.141592653589793

        System.out.println(Math.sin(PI / 6)); // 0.49999999999999994
        System.out.println(Math.sin(0)); // 0.0

        System.out.println(Math.cos(PI / 3)); // 0.5000000000000001
        System.out.println(Math.cos(0)); // 1.0

        System.out.println(Math.tan(PI / 4)); // 0.9999999999999999
        System.out.println(Math.tan(0)); // 0.0
    }
}