package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ColumnNotFixed {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6},
            {7, 8, 9}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // Taking inputs from user
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int[][] arr2 = new int[row][];

        for (int i = 0; i < arr2.length; i++) {
            int col = sc.nextInt();
            arr2[i] = new int[col]; // After taking the column no. we are initializing each array in a row

            for (int j = 0; j < col; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // Printing the array
        for (int[] a: arr2) {
            System.out.println(Arrays.toString(a));
        }
    }
}
