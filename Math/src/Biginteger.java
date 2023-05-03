import java.math.BigInteger;

public class Biginteger {
// The BigInteger class is used to store and work with large integer values
    public static void main(String[]args) {
        System.out.println("The BigInteger class is used to store and work with large integer values");
        long x = (long) Math.pow(10,20);
        System.out.println(x); // 9223372036854775807 instead of 1000000000000000000000

        // To mitigate this we can use instance of BigInteger class
        BigInteger a = new BigInteger("5000000000000000000000000000000000000000");
        BigInteger b = new BigInteger("1000000000000000000000000000000000000000");

        System.out.println(a);
        System.out.println(b);

        // System.out.println(a  + b); // Invalid
        BigInteger c = a.add(b);
        BigInteger d = a.subtract(b);
        BigInteger e = a.multiply(b);
        BigInteger f = a.divide(b);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(a.mod(b));

        BigInteger p = new BigInteger("1234567890464562312");
        BigInteger q = p.pow(20);

        System.out.println(q);

        // Data Conversion
        int r = 50;
        BigInteger s = new BigInteger(x + "");
        System.out.println(s); // 50

        BigInteger t = new BigInteger("987564123");
        int u = t.intValue();
        long v = t.longValue();

        System.out.println(u);
        System.out.println(v);
    }
}
