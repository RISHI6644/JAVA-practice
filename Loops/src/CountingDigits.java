import java.util.Scanner;
public class CountingDigits {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        String b = String.valueOf(num);

        for (int i = 1; i <= b.length(); i++) {
            count++;
        }
        System.out.println(count);
    }
}