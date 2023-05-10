/* Given an array and a key value as input, find the index of the key in the array. Return -1 if it's not present.
    Sample input: 5
                  10 20 30 40 50
                  40
    Sample output: 3
 */

import  java.util.Scanner;
public class LinearSearch {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        int key_value = sc.nextInt();
        int ans = 0;

        // Iterating from left to right
        for (int i = 0; i < arr.length ; i++ ) {
                if (arr[i] == key_value) {
                    ans = i;
                    break;
                }
                else {
                    ans = -1;
                }
        }

        // Iterating from right to left
//        for (int i = arr.length - 1; i  >=0; i-- ) {
//            if (arr[i] == key_value) {
//                ans = i;
//                break;
//            }
//            else {
//                ans = -1;
//            }
//        }

        System.out.println(ans);
    }
}