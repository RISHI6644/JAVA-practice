/* Given an array, generate a new array that is reverse of it.
    Sample input: 5
                  1 2 3 4 5
    Sample output: 5 4 3 2 1
 */

import java.util.Scanner;
public class ReverseArray {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] reverse = new int[l];
        int j = l;

        for (int i = 0; i < arr.length; i++) {
            reverse[j - 1] = arr[i];
            j--;
        }

        for (int num:reverse) {
            System.out.print(num + " ");
        }
    }
}