package BinarySearch;

// Question: https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
/*
    Intuition: The approach here will be to find the pivot first and then just return
     pivot + 1. Because if the array is rotated then the number of rotation will be
     equivalent to the number of elements till pivot.
     Pivot: The pivot element is the only element whose previous is greater than it.
             If there is no previous element, then there is no rotation means the
             first element is the pivot.
 */

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println(countRotation(arr));

        int[] arr2 = {7, 9, 11, 12, 15};
        System.out.println(countRotation(arr2));
    }

    private static int countRotation(int[] arr) {
        int pivot = searchPivot(arr);
        return pivot + 1;
    }

    public static int searchPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            // Four cases
            if (middle < end && arr[middle] > arr[middle + 1]) { // First condition will prevent indexOutOfBound Exception
                return middle;
            }
            if (middle > start && arr[middle] < arr[middle - 1]) {
                return middle - 1;
            }
            if (arr[middle] <= arr[start]) {
                end = middle - 1;
            }
            else {
                start = middle + 1;
            }
        }
        return -1;
    }
}
