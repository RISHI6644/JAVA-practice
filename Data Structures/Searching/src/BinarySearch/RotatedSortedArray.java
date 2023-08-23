package BinarySearch;

// Question: https://leetcode.com/problems/search-in-rotated-sorted-array/
/* Approach 1: Find the pivot (The element from which its previous & next elements will be
    sorted in ascending order) in the array.
    Then search in first-half (from index 0 till pivot's index). Otherwise, search in
    second-half (from (pivot + 1) till the end index)

    Finding pivot: case 1: When arr[mid] > arr[mid + 1] => return mid
                   case 2: When arr[mid] < arr[mid - 1] => return mid - 1
                   case 3: When arr[start] >= arr[mid]  => end = mid -1; In this case, all the
                           elements from mid will be less than arr[start]. Hence, we can ignore
                           all these elements (end = mid -1) since we are looking for peak means
                           the largest element.
                   case 4: When arr[start] < arr[mid] => start = mid + 1
 */

// Approach 2: We can solve it simply in one method using recursion

/*
    Rotated Sorted Array: A rotated sorted array is an array that was originally sorted in
     ascending order but has been rotated around a pivot point. This rotation disrupts the
     original order of the elements. Despite the rotation, the array still maintains some
     level of order.
    During rotation, the element at the first moves to the last position in clockwise rotation
     (Left Rotation), or the last element moves to the first element in an anti-clockwise rotation
     (Right rotation).

    For example, consider the original sorted array, arr = {1, 3, 4, 8, 10, 15, 17}
     After first right rotation it becomes arr1 = {17, 1, 3, 4, 8, 10, 15}
     After second right rotation it becomes arr2 = {15, 17, 1, 3, 4, 8, 10}
     After third right rotation it becomes arr3 = {10, 15, 17, 1, 3, 4, 8}
     After fourth right rotation it becomes arr4 = {8, 10, 15, 17, 1, 3, 4}
     ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ... ..
     After seventh right rotation it becomes arr7 = {1, 3, 4, 8, 10, 15, 17}

   Properties of a Rotated Sorted Array:
    i) Partial Sorting: Even though the array is rotated, there are portions of it that
        remain sorted. Specifically, one portion of the array will be sorted in ascending
        order, and the other portion will be sorted in ascending order as well, but it may
        start with larger values.
   ii) Pivot Point: The pivot point is the element where the rotation occurred. Elements to
        the left of the pivot are greater than elements to the right. The minimum element in
        the array is typically the pivot.
        In the above example, pivot is 1.
 */

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 8, 10, 15, 17};
        int target = 0;
        int pivot = search(arr, target);

        System.out.println(pivot);

        int[] arr2 = {8, 10, 15, 17, 1, 3, 4};
        int target2 = 1;
        int pivot2 = search(arr2, target2);

        System.out.println(pivot2);
    }

    public static int search(int[] arr, int target) {
        int pivot = searchPivot(arr);

        // If it does not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // Just apply normal binary search
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // But if pivot has found, it means that it found two ascending sorted arrays
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) { // When we will find the target element greater than
                                // the pivot element, than the searching range will be
                                // reduced, and it will be [start, pivot - 1] since all
                                // numbers after pivot are smaller than start
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1); // when target < arr[start],
                                                                              // all elements from start
                                                                              // till pivot are going to
                                                                              // be larger than the target
                                                                              // Hence search range = [pivot + 1, end]
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int middle = (start + end) / 2;

            if (arr[middle] == target) {
                return middle;
            }
            else if (target < arr[middle]) {
                end = middle - 1;
            }
            else {
                start = middle + 1;
            }
        }
        return -1;
    }

    // This will not work in case of duplicate values
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
