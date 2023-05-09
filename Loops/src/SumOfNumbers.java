/* Given a stream of numbers, read the numbers till you read a -ve integer and print their sum of numbers read so far.
    Sample input : 5 3 2 -4 0 9
    Sample output: 6
 */

import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int numbers;
        int sum = 0;
        do {
            numbers = sc.nextInt();
            sum = sum + numbers;
        } while (numbers >= 0) ;
        System.out.println(sum);
    }
}