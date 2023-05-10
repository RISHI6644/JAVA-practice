/* Read two arrays from the user and generate a third array containing all the common elements from the first two.
    Sample input: 5
                  10 20 30 40 50
                  3
                  60 20 40
   Sample output: 20 40
 */

import java.util.*;
public class CommonElements {
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

        List<Integer> common = new ArrayList<>();

        for (int k = 0; k < arr1.length; k++) {
            for (int l = 0; l < arr2.length; l++) {
                if (arr1[k] == arr2[l]) {
                    common.add(arr1[k]);
                    break;
                }
            }
        }

        int [] result = new int[common.size()];
        for (int i = 0; i < common.size(); i++) {
            result[i] = common.get(i);
        }

        for (int num:result) {
            System.out.print(num + " ");
        };
    }
}