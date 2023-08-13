package BinarySearch;

// Question: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Find first occurrence of the target
// Find last occurrence of the target

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] out = positionSearch(nums, target);

        System.out.println(Arrays.toString(out));
    }

    public static int[] positionSearch(int[] arr, int target) {
        int[] position = {-1, -1};

        // Check for first occurrence or, if the target is first
        int start = searchIndex(arr, target, true);
        int end = searchIndex(arr, target, false);

        position[0] = start;
        position[1] = end;

        return position;
    }

    // This function just returns the index value of target
    public static int searchIndex(int[] arr, int target, boolean findStartIndex) {
        int index = -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (target < arr[middle]) {
                end = middle - 1;
            }
            else if (target > arr[middle]){
                start = middle + 1;
            }
            else {
                index = middle; // potential index found
                if (findStartIndex) {
                    end = middle - 1;
                }
                else {
                    start = middle + 1;
                }
            }
        }
        return index;
    }
}

/* Time Complexity: Since here binary search is running twice, so it will take,
    (logN + logN) = logN (instead of 2logN as constant does not matter in time
    complexity since it determines a relationship between the size of the input
    and the time) amount of time.
 */