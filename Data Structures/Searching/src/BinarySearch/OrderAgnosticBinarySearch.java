package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        System.out.println("Let's learn about Order-Agnostic Binary Search");

        /* Order-Agnostic Binary Search: It is a modified version of Binary Search algorithm.
            It comes with one more condition checking. The reason behind this algorithm is what
            if the order of the sorted array is not given. So here it checks whether the value of
            the first element is greater or smaller than the last element.

            Consider the following steps:
            i) Initialize a boolean variable 'is_ascending' as true if arr[start] is less than
                arr[end] else set it as false.
            ii) Then perform the steps of binary search for that particular order
         */

        int[] arr = {-18, -5, 2, 4, 9, 12, 16, 18, 22, 45, 74};
        int target = 22;
        int out = orderAgnosticBinarySearch(arr, target);

        System.out.println(out);

        int[] arr2 = {74, 30, 18, 10};
        int target2 = 18;
        int out2 = orderAgnosticBinarySearch(arr2, target2);

        System.out.println(out2);
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Find whether the array sorted in ascending or descending order
        boolean is_ascending;
        if (arr[start] < arr[end]) {
            is_ascending = true;
        }
        else {
            is_ascending = false;
        }

        while (start <= end) {
            int middle = (start + end) / 2;

            if (arr[middle] == target) {
                return middle;
            }

            if (is_ascending) {
                if (target < arr[middle]) {
                    end = middle - 1;
                }
                else {
                    start = middle + 1;
                }
            }

            else {
                if (target > arr[middle]) {
                    end = middle - 1;
                }
                else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
