import java.util.Scanner;
public class SquareNumber {
    static int squareNumber (int n) {
        return n * n;
    }

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = squareNumber(n);
        System.out.println(result);
    }
}