package BinarySearch;

// Question: https://leetcode.com/problems/find-in-mountain-array/
/*
    Mountain Array: A mountain array (a.k.a bitonic array) is an array of length
     at least 3 with elements strictly increasing from starting till an index i,
     and then strictly decreasing from index i to last index. The structure looks as following:
                 arr[0] < arr[1] < arr[i] >arr[i+1] > arr[i+2] > arr[N-1]
                 Example: arr = {1, 2, 3, 4, 9, 8, 7, 6, 5}
 */
// Here, we have to find the minimum index of the target means target element can be repeated
// Find the peak element of the given array
// Then perform binary search only in the first half (Ascending) of it
// If target not found there, then perform binary search in the second half (Descending)

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int out = findElement(arr, target);

        System.out.println(out);
    }

    public static int findElement(int[] arr, int target) {
        int peak = searchPeakElement(arr);
        int first_try = binarySearch(arr, target, 0, peak);

        if (first_try != -1) {
            return first_try;
        }

        return binarySearch(arr, target, peak, arr.length -1);
    }

    // Finding the peak element
    public static int searchPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int middle = (start + end) / 2;

            if (arr[middle] > arr[middle + 1]) {
                end = middle;
            }
            else {
                start = middle + 1;
            }
        }
        return start;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
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
