/* Given an integer N, generate and print an array containing squares of all numbers from 1 to N.
    Sample input: 5
    Sample output: 1 4 9 16 25
 */

import java.util.Scanner;
public class SquareNumber {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum = i * i;
            arr[i - 1] = sum;
        }
        for (int num:arr) {
            System.out.print(num + " ");
        }
    }
}