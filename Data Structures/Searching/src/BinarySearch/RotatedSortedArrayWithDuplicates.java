package BinarySearch;

// Question: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
/*
    The idea is the same as the previous one without duplicates. The only difference is that
     due to the existence of duplicates, arr[start] == arr[middle] could be possible, the first
     half could be out of order (i.e. not in the ascending order, e.g. {3, 1, 2, 3, 3, 3, 3}) and
     we have to deal this case separately. In that case, it is guaranteed that arr[end] will also
     be equal to arr[middle], so the condition arr[mid] == arr[start] == arr[end] can be checked
     before the original logic, and if so then move left and right both towards the middle by 1
     and repeat.
 */

/*
    Rotated Sorted Array: A rotated sorted array is an array that was originally sorted in
     ascending order but has been rotated around a pivot point. This rotation disrupts the
     original order of the elements. Despite the rotation, the array still maintains some
     level of order.
    During rotation, the element at the first moves to the last position in clockwise rotation
     (Left Rotation), or the last element moves to the first element in an anti-clockwise rotation
     (Right rotation).

    For example, consider the original sorted array, arr = {2, 2, 2, 2, 9}
     After first right rotation it becomes arr1 = {9, 2, 2, 2, 2}
     After second right rotation it becomes arr2 = {2, 9, 2, 2, 2}

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

public class RotatedSortedArrayWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 9, 2, 2, 2};
        int target = 2;
        int pivot = search(arr, target);

        System.out.println(pivot); // 0

        int[] arr2 = {2,5,6,0,0,1,2};
        int target2 = 0;
        int pivot2 = search(arr2, target2);

        System.out.println(pivot2); // 4

        int[] arr3 = {3, 3, 3, 1, 2, 3};
        int target3 = 3;
        int pivot3 = search(arr3, target3); // 2

        System.out.println(pivot3);

        int[] arr4 = {3, 3, 1, 2, 3, 3};
        int target4 = 3;
        int pivot4 = search(arr4, target4);

        System.out.println(pivot4); // 1
    }

    public static int search(int[] arr, int target) {
        int pivot = searchPivotWithDuplicates(arr);

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
    public static int searchPivotWithDuplicates(int[] arr) {
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

            // If elements at middle, start and end are equal, then just skip the duplicates
            if (arr[middle] == arr[start] && arr[middle] == arr[end]) {
                // NOTE: What if these elements at start and end were the pivots ?
                // So, first of all check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                ++start;

                // Then check whether end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                --end;
            }

            // Left is sorted, so pivot should be in right
            else if (arr[start] < arr[middle] || arr[start] == arr[middle] && arr[middle] > arr[end]) {
                start = middle + 1;
            }
            else {
                end = middle - 1;
            }
        }
        return -1;
    }
}
