import java.util.Scanner;
public class Branching {
    public static void main(String[]args) {
        System.out.println("Let's learn about branching in Java");

        /* if else
        * The if statement is used to test a condition. It checks boolean condition: true or false
        * It can optionally have an else if and an else statement attached with it as well
        * */

        String weather = "rainy";

        if (weather == "rainy") {
            System.out.println("Take an Umbrella");
        }
        else if (weather == "sunny") {
            System.out.println("wear sunglasses");
        }
        else {
            System.out.println("Check weather forecast");
        }

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("This is a positive number");
        }
        else if (num == 0) {
            System.out.println("Value is Zero");
        }
        else {
            System.out.println("This is a negative number");
        }

        /* switch case
        * The switch case statement is used to transfer control to a particular block of code, based on the value of
          the variable being tested.
        * */

        switch (weather) {
            case "rainy":
                System.out.println("Take an Umbrella");
                break;
            case "sunny":
                System.out.println("wear sunglasses");
                break;
            default:
                System.out.println("Check weather forecast");
        }

        /* Enhanced switch case representation:
        switch (weather) {
            case "rainy" -> {
                    System.out.println("Take an Umbrella");
                }
         */

    }
}
