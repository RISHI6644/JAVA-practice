package ArrayList;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {18, 30, 10, 74};
        reverse(arr); // for even number of elements

        System.out.println(Arrays.toString(arr));

        int[] arr2 = {1, 2, 3};
        reverse(arr2); // for odd number of elements

        System.out.println(Arrays.toString(arr2));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swapElements(arr, start, end);
            start++;
            end--;
        }
    }

    static void swapElements(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
