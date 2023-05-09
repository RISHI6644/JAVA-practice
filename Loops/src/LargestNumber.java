import java.util.Scanner;
public class LargestNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Largest = 0;
        for (int i = 1; i <= N; i++) {
            int current_number = sc.nextInt();
            if (current_number > Largest) {
                Largest = current_number;
            }
            else {
                continue;
            }
        }
        System.out.println(Largest);
    }
}