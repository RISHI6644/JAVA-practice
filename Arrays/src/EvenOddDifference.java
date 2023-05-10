/* Write a program to find the difference between the sum of all even elements and the sum of all odd elements
    from the given list.
    Sample input: 10
                  56 63 87 24 32 13 15 19 44 52
    Sample output: 11
 */

import java.util.Scanner;
public class EvenOddDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int difference = even_odd(arr);
        System.out.println(difference); }

    public static int even_odd ( int[] ls){
        int even_sum = 0;
        int odd_sum = 0;
        int difference;

        for (int i = 0; i < ls.length; i++) {
            if (ls[i] % 2 == 0) {
                even_sum = even_sum + ls[i];
            } else {
                odd_sum = odd_sum + ls[i];
            }
        }
        return even_sum - odd_sum;
    }
}