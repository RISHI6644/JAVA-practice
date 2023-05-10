/* Read two arrays from the user and generate a third array containing all the common elements from the first two.
    Sample input: 5
                  10 20 30 40 50
                  3
                  60 20 40
   Sample output: 20 40
 */

import java.util.Scanner;
public class CommonElements2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int[] arr1 = new int[l1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int l2 = sc.nextInt();
        int[] arr2 = new int[l2];

        for (int j = 0; j < arr2.length; j++ ) {
            arr2[j] = sc.nextInt();
        }

        int common = 0;

        if (l1 < l2) {
            common = l2;
        }
        else {
            common = l1;
        }

        int[] temp = new int[common];
        int count = 0;

        for (int k = 0; k < arr1.length; k++) {
            for (int l = 0; l < arr2.length; l++) {
                if (arr1[k] == arr2[l]) {
                    temp[count] = arr1[k];
                    count++;
                    break;
                }
            }
        }

        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        for (int num:result) {
            System.out.print(num + " ");
        };
    }
}