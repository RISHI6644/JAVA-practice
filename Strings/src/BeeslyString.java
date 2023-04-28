/* Problem Description
Mr. Jim likes playing with strings a lot, so Mrs. Pam gifted him a string A which has some unique magical powers.
The string consists of lowercase latin letters 'p','a' and 'm' only.

In one wish, Mr Jim can perform one of the following operations:
1. Remove exactly one occurrence of 'p' and exactly one occurrence of 'm', from anywhere inside string A.
2. Remove exactly one occurrence of 'a' and exactly one occurrence of 'm', from anywhere inside string A.
Now Mr. Jim wants to know if after some number of wishes is it possible to make string A empty.

Output: Return 1 if it is possible to make string A empty after some number of operations otherwise Return 0.

 Input 1:
A = "mpampamm"
A = "pampampam"

Example Output
 1
 0
 */

import java.util.Scanner;
public class BeeslyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int output = solve(A);
        System.out.println(output);
    }

    public static int solve(String s) {
        char[] arr = s.toCharArray();
        int num_of_p = 0;
        int num_of_a = 0;
        int num_of_m = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'p') {
                num_of_p++;
            } else if (arr[i] == 'a') {
                num_of_a++;
            } else if (arr[i] == 'm') {
                num_of_m++;
            } else {
                break;
            }
        }
        if (num_of_p % 2 == 0 && num_of_a % 2 == 0) {
            if (num_of_m == 2 * num_of_p) {
                return 1;
            }
        }
        else {
            return 0;
        }
        return 0;
    }
}
