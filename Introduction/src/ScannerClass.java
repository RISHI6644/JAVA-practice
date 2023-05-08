import java.util.Scanner;

/* Scanner Class in Java
    Java offers a variety of solutions for reading inputs. The simplest and the easiest way of reading input is through
    Scanner class.
 */
public class ScannerClass {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        System.out.println(i);

        byte b = sc.nextByte();
        System.out.println(b);

        short s = sc.nextShort();
        System.out.println(s);

        boolean bool = sc.nextBoolean();
        System.out.println(bool);

        String str = sc.next(); // The next function only reads the input till a breakpoint (White-space character)
        System.out.println(str);

        // To print the entire input we can use nextLine() function
        String str2 = sc.nextLine();
        System.out.println(str2);

        /* To read a character Java doesn't provide any default function and that is why we need to read a char value
            in follwing way: */
        char c = sc.next().charAt(0);
        System.out.println(c);
    }
}
