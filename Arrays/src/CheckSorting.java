/* Given an array A, check if it is sorted in ascending order or not.
    Sample input: 3
                  1 2 2
    Sample output: 1
 */

import java.util.Scanner;
public class CheckSorting {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean sorted = true;

        for (int x = 1; x < arr.length; x++) {
            if (arr[x] < arr[x - 1]) {
                sorted = false;
                break;
            }
            if (arr[x] == arr[x - 1]) {
                continue;
            }
        }

        if (sorted) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}