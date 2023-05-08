import java.util.Scanner;
public class DaysInAMonth {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        switch (N) {
            case 1:
                System.out.println("January");
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("February");
                System.out.println("28 days");
                break;
            case 3:
                System.out.println("March");
                System.out.println("31 days");
                break;
            case 4:
                System.out.println("April");
                System.out.println("30 days");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
