package BinarySearch;

/* Question: Given an array = {2, 3, 5, 9, 14, 16, 18} and a target value 15.
    Find the ceiling (smallest element in array which is greater or equal to
    the target) of the target.

    Output: 16
 */

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int out = ceilingSearch(arr, target);

        System.out.println(out);

        int target2 = 14;
        int out2 = ceilingSearch(arr, target2);
        System.out.println(out2);

        int target3 = 9;
        int out3 = ceilingSearch(arr, target3);
        System.out.println(out3);

        int target4 = 17;
        int out4 = ceilingSearch(arr, target4);
        System.out.println(out4);
    }
    
    public static int ceilingSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (arr[middle] == target) {
                return arr[middle];
            }
            else if (target < arr[middle]) {
                end = middle - 1;
            }
            else if (target > arr[middle]) {
                start = middle + 1;
            }
        }
        return arr[start];
    }
}
