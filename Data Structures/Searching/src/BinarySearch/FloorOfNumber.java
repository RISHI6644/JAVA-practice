package BinarySearch;

/* Question: Given an array = {2, 3, 5, 9, 14, 16, 18} and a target value 16.
    Find the Floor (greatest element in array which is less or equal to
    the target) of the target.

    Output: 14
 */

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int out = floorSearch(arr, target);

        System.out.println(out);

        int target2 = 14;
        int out2 = floorSearch(arr, target2);
        System.out.println(out2);

        int target3 = 17;
        int out3 = floorSearch(arr, target3);
        System.out.println(out3);
    }

    public static int floorSearch(int[] arr, int target) {
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
        return arr[end];
    }
}
