/* Given an array, find the maximum and the minimum elements in it.
    Sample input: 5
                  10 20 30 40 50
    Sample output: 50
                   10
 */

import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int j = arr.length - 1; j >= 0; j--) {
            if (min > arr[j]) {
                min = arr[j];
            }
        }

        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: " + max);
    }
}