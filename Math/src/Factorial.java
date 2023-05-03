import java.math.BigInteger;
import java.util.Scanner;
public class Factorial {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 1;

        // If the value of N is very large than we can create an instance of BigInteger class
        // BigInteger sum = new BigInteger("1");

        for (int i = N; i > 0; i--) {
            sum *= i;
            /* BigInteger temp = new BigInteger(i + "");
            sum = sum.multiply(temp); */
        } 
        System.out.println(sum);
    }
}
