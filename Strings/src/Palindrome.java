import java.util.Scanner;
public class Palindrome {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // To generate the reverse of the given string
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reverse = sb.toString();

        if (str.equals(reverse)) {
            System.out.println("Palindromic");
        }
        else {
            System.out.println("Non-Palindromic");
        }
    }
}
